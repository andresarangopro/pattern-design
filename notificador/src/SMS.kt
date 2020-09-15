class SMS(correo: String): IPlataformaNotificacion {

    override fun enviarNotificacion(mensaje: String) {
        println("SMSNOTIFICADOR $mensaje")
    }

}