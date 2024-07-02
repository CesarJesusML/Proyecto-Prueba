/*!
=========================================================
* FoodHut Landing page
=========================================================

* Copyright: 2019 DevCRUD (https://devcrud.com)
* Licensed: (https://devcrud.com/licenses)
* Coded by www.devcrud.com

=========================================================

* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
*/

// smooth scroll
$(document).ready(function(){
    $(".navbar .nav-link").on('click', function(event) {

        if (this.hash !== "") {

            event.preventDefault();

            var hash = this.hash;

            $('html, body').animate({
                scrollTop: $(hash).offset().top
            }, 700, function(){
                window.location.hash = hash;
            });
        } 
    });
});

new WOW().init();

function initMap() {
    var uluru = {lat: 37.227837, lng: -95.700513};
    var map = new google.maps.Map(document.getElementById('map'), {
      zoom: 8,
      center: uluru
    });
    var marker = new google.maps.Marker({
      position: uluru,
      map: map
    });
 }
 
 
// Enivar datos en formato JSON meduante una solicitud AJAX
function createBooking() {
    var name = document.getElementById('name').value;
    var email = document.getElementById('email').value;
    var phone = document.getElementById('phone').value;
    var doc = document.getElementById('doc').value;
    var quantity = document.getElementById('quantity').value;
    var bookingdate = document.getElementById('bookingdate').value;

    var data = {
        name: name,
        email: email,
        phone: phone,
        doc: doc,
        quantity: quantity,
        bookingdate: bookingdate
    };

    // Realizar la solicitud POST utilizando AJAX
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "/api/booking", true);
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4) {
            if (xhr.status === 200) {
                alert('Mesa reservada exitosamente');
                // Actualizar la página después de la creación de la reserva
                location.reload();
                // Desplazarse al inicio de la página
                window.scrollTo(0, 0);
            } else {
                alert('Error al realizar la reserva');
                console.error('Error:', xhr.statusText);
            }
        }
    };
    xhr.send(JSON.stringify(data));
}
