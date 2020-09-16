class SMSNotificador(correo: String): PlataformaNotificacion(correo) {

    override fun enviarNotificacion(mensaje: String) {
        println("SR . $correo SMSNOTIFICADOR $mensaje")
    }

}