class Notificador(var usuarios: ArrayList<Usuario>) {

    fun enviarMensaje(mensaje:String){
            usuarios.forEach {
                FabricaNotificador().crearNotificador(it.tipoPlataforma,it.correo)!!.enviarNotificacion(mensaje)
            }

    }

}