function verEnlaceBis(){
    var enlace = document.getElementById("enlace");
    alert(enlace.href); 	// muestra http://www...com
}
function checkeo(){
    var elementos = document.getElementsByName("pregunta");
    for(var i=0; i<elementos.length; i++) {
        alert(" Elemento: " + elementos[i].value + "\n Seleccionado: " +
        elementos[i].checked);
    }
}
function selecciones(){
    var elemento = document.getElementById("condiciones");
    alert(" Elemento: " + elemento.value + "\n Seleccionado: " + elemento.checked);
    var elemento2 = document.getElementById("privacidad");
    alert(" Elemento: " + elemento2.value + "\n Seleccionado: " + elemento2.checked);
}
function validacion(){
    indice = document.getElementById("opciones").selectedIndex;
    if( indice == null || indice == 0 ) {
        alert(" indice seleccionado es: nulo ");
    }else{
        alert(" indice seleccionado es:  " +indice);
    }
}