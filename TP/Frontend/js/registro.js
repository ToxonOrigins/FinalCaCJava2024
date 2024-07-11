function validl() {
    let mail = document.getElementById("fname");
    let clave = document.getElementById("lclave");
    let error = false
    if (mail.value == "") {
        document.getElementById("fname").style.border = "1px red solid";
        error = true;
    } else { document.getElementById("fname").style.border = "1px #dee2e6 solid" }
    if (clave.value == "") {
        document.getElementById("lclave").style.border = "1px red solid";
        error = true;
    } else { document.getElementById("lclave").style.border = "1px #dee2e6 solid" }
    if (error == false) {
        alert("Ingreso exitoso");
        alert("Ya puede ingresar al carrito");
        sessionStorage.setItem("login",true);
    } else { alert("Error revise los items marcados con rojo")}
    return !error

}
function validr() {
    let mail = document.getElementById("mailr");
    let mail2 = document.getElementById("confirmail");
    let clave = document.getElementById("claver");
    let clave2 = document.getElementById("confirmclave");
    let nombre = document.getElementById("nombre");
    let apellido = document.getElementById("apellido");
    let error = false
    if (mail.value == "") {
        document.getElementById("mailr").style.border = "1px red solid";
        error = true;
        vaciom = true
    } else { document.getElementById("mailr").style.border = "1px #dee2e6 solid" }
    if (mail2.value == "") {
        document.getElementById("confirmclave").style.border = "1px red solid";
        error = true;
        vaciom = true
    } else {
        document.getElementById("claver").style.border = "1px #dee2e6 solid";
        vaciom = false
    }
    if ((mail2.value != mail.value) || (vaciom == true)) {
        document.getElementById("mailr").style.border = "1px red solid";
        document.getElementById("confirmail").style.border = "1px red solid";
        error = true;
    } else {
        document.getElementById("mailr").style.border = "1px #dee2e6 solid";
        document.getElementById("confirmail").style.border = "1px #dee2e6 solid"
    }
    if (clave.value == "") {
        document.getElementById("claver").style.border = "1px red solid";
        error = true;
        vacio = true
    } else { document.getElementById("claver").style.border = "1px #dee2e6 solid" }
    if (clave2.value == "") {
        document.getElementById("confirmclave").style.border = "1px red solid";
        error = true;
        vacio = true
    } else {
        document.getElementById("claver").style.border = "1px #dee2e6 solid";
        vacio = false
    }
    if ((clave2.value != clave.value) || (vacio == true)) {
        document.getElementById("claver").style.border = "1px red solid";
        document.getElementById("confirmclave").style.border = "1px red solid";
        error = true;
    } else {
        document.getElementById("claver").style.border = "1px #dee2e6 solid";
        document.getElementById("confirmclave").style.border = "1px #dee2e6 solid"
    }

    if (nombre.value == "") {
        document.getElementById("nombre").style.border = "1px red solid";
        error = true;
    } else { document.getElementById("nombre").style.border = "1px #dee2e6 solid" }
    if (apellido.value == "") {
        document.getElementById("apellido").style.border = "1px red solid";
        error = true;
    } else {
        document.getElementById("apellido").style.border = "1px #dee2e6 solid";
    }
    if (error == false) {
        alert("Registro exitoso");
    } else { alert("Error revise los items marcados con rojo")}
    return !error

} 
