//Este es igual que validarRelleno pero sin el return
function validarSelect(select, mensajeError) {
    if(select.value == ""){
        alert(mensajeError);
        changeState(false, select);
    }else{
        changeState(true, select);
    }
}

function changeState(newState, elem){
    if(newState){
        elem.classList.add("is-valid");
        elem.classList.remove("is-invalid");
    }else{
        elem.classList.add("is-invalid");
        elem.classList.remove("is-valid");
    }
}

function validarFecha(){
    let dia = document.getElementById("fecha");
    let mes = document.getElementById("meses");
    let año = document.getElementById("año");

    if(dia.value == '' || dia.value < 1 || dia.value > 31){
        changeState(false, dia);
    }else{
        changeState(true, dia);
    }
    if(mes.value < 1 || mes.value > 4){
        changeState(false, mes);
    }else{
        changeState(true, mes);
    } 
    if(año == '' || año.value < 1400 || año.value > 2040){
        changeState(false, año);
    }else{
        changeState(true, año);
    }
}


function validarRelleno(elem, mensajeError){
    if(!elem.value){
        alert(mensajeError);
        changeState(false, elem);
        return false;
    }else{
        changeState(true, elem);
        return true;
    }
}

function validarPrecio(elem){
    if(!validarRelleno(elem, "Por favor introduzca precio"))
        return;

    if(elem.value < 120){
        changeState(false, elem);
        return
    }

    changeState(true, elem);
}

function comprobarImpuestos(elem, idMens){
    if(elem.value < 16){
        document.getElementById(idMens).hidden = false;
    }else{
        document.getElementById(idMens).hidden = true;
    }
}

function selecionaMejorOpcion(){
    if(document.getElementById("des").checked){
        document.getElementById('mejorPromocion').hidden = false;
    }else{
        document.getElementById('mejorPromocion').hidden = true;
    }
}