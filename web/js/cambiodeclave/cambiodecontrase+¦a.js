var cambiodecontraseña ={
    init: function () {

    $('#formeditar').submit(function () {
      return false
    })
    $("button[name=editar]").click(function () {
      console.log('desde init iniciar sesion')
      iniciarSesion.validarCampos()
    })
  },
  Editarclave: function () {
    $.ajax({
      url:'clave',
      type:'post',
      data:$('#formeditar').serialize(),
      success:function(resultado){
        console.log(resultado)
        console.log('se cambio')
      },
      error:function(error){
        console.warn(error)
      }
      
      
    })
  },
    
    
}

cambiodecontraseña.init()
