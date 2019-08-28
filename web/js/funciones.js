$(document).ready(function () {
    $("#btnSubasta").click(function () {
     var idp= $(this).parent().find("#idpro").val();
       swal("Debes registrarte primero");
          
    });
    $("#btnPublicar").click(function () {
      $(this).parent().find("#publi").val();
       swal("Debes registrarte primero");       
    });
    $("#btnSub").click(function () {
      $(this).parent().find("#sub").val();
       swal("Debes registrarte primero");       
    });
   
});

