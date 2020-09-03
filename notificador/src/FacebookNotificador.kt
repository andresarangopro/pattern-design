class FacebookNotificador(correo: String): PlataformaNotificacion(correo) {


    override fun enviarNotificacion(mensaje: String) {
        println("FacebookNotificador $mensaje")
    }

}