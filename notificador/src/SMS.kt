class SMS(correo: String): IPlataformaNotificacion(correo) {

    override fun enviarNotificacion(mensaje: String) {
        println("SMSNOTIFICADOR $mensaje")
    }

}