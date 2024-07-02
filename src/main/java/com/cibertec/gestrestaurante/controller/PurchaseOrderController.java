package com.cibertec.gestrestaurante.controller;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cibertec.gestrestaurante.dto.PurchaseOrderDetailRequest;
import com.cibertec.gestrestaurante.dto.PurchaseOrderRequest;
import com.cibertec.gestrestaurante.model.Product;
import com.cibertec.gestrestaurante.model.PurchaseOrder;
import com.cibertec.gestrestaurante.model.PurchaseOrderDetail;
import com.cibertec.gestrestaurante.service.PurchaseOrderService;
import com.cibertec.gestrestaurante.service.impl.ProductServiceImpl;
import com.cibertec.gestrestaurante.service.impl.PurchaseOrderServiceImpl;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class PurchaseOrderController {
	
	@Autowired
	ProductServiceImpl productservice;
	
	@Autowired
	PurchaseOrderServiceImpl porderservice;
	
	@GetMapping("/porder")
	public String index( Model model) {
		model.addAttribute("porders", porderservice.getAll());
		
		return "PurchaseOrder/index";
	}
	
	@GetMapping("/porder/{id}")
	public String getById(@PathVariable("id") Long id, Model model) {
		model.addAttribute("porder", porderservice.getById(id));
		
		return "PurchaseOrder/detail";
	}
	
	@GetMapping("/porder/add")
	public String add(PurchaseOrderRequest porder, Model model) {
		model.addAttribute("porder", porder);
		
		model.addAttribute("products", productservice.getAll());
		
		return "PurchaseOrder/addporder";
	}
	
	@PostMapping(value="/porder/add", params={"adddetail"})
	public String mngdetail(PurchaseOrderRequest porder, Model model) {
		List<PurchaseOrderDetailRequest> detaillistporder = porder.getPurchasedetail();
		
		if(porder.getProduct_id() != 0) {
			Product product = productservice.getById(porder.getProduct_id());
			
			
			
			if(product.getId() != null) {

				PurchaseOrderDetailRequest detail = new PurchaseOrderDetailRequest(product.getName(), product.getPrice(), 1, product.getId());
				
				boolean isAdded = false;
				
				List<PurchaseOrderDetailRequest> detaillist = new ArrayList<>();
				
				if(detaillistporder != null) {
					for (int i = 0; i  < detaillistporder.size(); i++) {
						
						PurchaseOrderDetailRequest detailitem = detaillistporder.get(i);
						if(detailitem.getProduct_id() == product.getId()) {
							detaillistporder.remove(i);
							detailitem.setQuantity(detailitem.getQuantity() + 1);
							detaillistporder.add(detailitem);
							isAdded = true;
						}
					    break;
					    
				    }
					
					detaillist = detaillistporder;
				}
				
				if(!isAdded) {
					detaillist.add(detail);
				}
				porder.setPurchasedetail(detaillist);
			}
		}

		model.addAttribute("porder", porder);
		model.addAttribute("products", productservice.getAll());
		
		return "PurchaseOrder/addporder";
	}

	@PostMapping(value="/porder/add", params={"deletedetail"})
	public String mngdeletedetail(PurchaseOrderRequest porder, Model model, HttpServletRequest req) {

		List<PurchaseOrderDetailRequest> detaillistporder = porder.getPurchasedetail();
		
		int indremove = Integer.valueOf(req.getParameter("deletedetail"));
		
		detaillistporder.remove(indremove);
		

		model.addAttribute("porder", porder);
		model.addAttribute("products", productservice.getAll());
		
		return "PurchaseOrder/addporder";
	}
	

	@PostMapping("/porder/add")
	public String save(PurchaseOrderRequest porder, Model model) {


		PurchaseOrder porderres = new PurchaseOrder();
		
		List<PurchaseOrderDetailRequest> detaillistporder = porder.getPurchasedetail();

		List<PurchaseOrderDetail> detaillist = new ArrayList<>();
		
		for (int i = 0; i  < detaillistporder.size(); i++) {
			PurchaseOrderDetail detail = new PurchaseOrderDetail();
			PurchaseOrderDetailRequest detailitem = detaillistporder.get(i);
			detail.setName(detailitem.getName());
			detail.setPrice(detailitem.getPrice());
			detail.setQuantity(detailitem.getQuantity());
			
			detaillist.add(detail);
		}
		
		porderres.setDoc(porder.getDoc());
		porderres.setName(porder.getName());
		porderres.setTablenum(porder.getTablenum());
		porderres.setPurchasedetail(detaillist);
		
		LocalDateTime now = LocalDateTime.now();
		porderres.setPurchasedate(now);
		
		porderservice.create(porderres);
		
		return "redirect:/porder";
	}
	
	 @GetMapping("/porder/delete/{id}")
	    public String delete(@PathVariable("id") Long id) {
		 	porderservice.delete(id);
	        return "redirect:/porder";
	    }
}
