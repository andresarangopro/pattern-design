class MensajeriaEmpresarialNotificador(correo: String): PlataformaNotificacion(correo) {

    override fun enviarNotificacion(mensaje: String) {
        println("MensajeriaEmpresarialNotificador $mensaje")
    }

}