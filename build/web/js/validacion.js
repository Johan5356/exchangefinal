function validar() {
    var correo, clave, expresion;
    correo = document.getElementById("correo").value;
    clave = document.getElementById("clave").value;
    expresion = /\w+@\w+\.+[a-z]/;
    if (correo === "") {
        alert("Todos los campos son obligatorios");
        return false;
    } else if (clave === "") {
        alert("Complete el campo");
        return false;
    } else if (!expresion.test(correo)) {
        alert("El correo no es valido")
        return false;
    }
}

function formulario() {
    var telefono, correo, clave, expresion, a, expresion2, departamento, ciudad;
    correo = document.getElementById("correo").value;
    clave = document.getElementById("clave").value;
    a = document.getElementById("clave2").value;
    departamento = document.getElementById("departamento").value;
    ciudad = document.getElementById("ciudad").value;
    telefono = document.getElementById("telefono");
    expresion = /\w+@\w+\.+[a-z]/;
    
    if (correo === "") {
        alert("Todos los campos son obligatorios");
        return false;
    } else if (clave === "") {
        document.getElementById("mensaje").innerHTML = "Ingrese contraseña";
        return false;
    } else {
        document.getElementById("mensaje").innerHTML="";
        return false;
    }  if (!expresion.test(correo)) {
        alert("El correo no es valido");
        return false;
    }
    if (telefono === "") {
        alert("Complete el campo");
        return false;
    } else if (clave !== a) {
        document.getElementById("mensaje2").innerHTML = "La cotraseña no coinciden";
        return false;
    } else if (clave === a) {
        document.getElementById("mensaje2").innerHTML = "";
        return false;
    } 
}




