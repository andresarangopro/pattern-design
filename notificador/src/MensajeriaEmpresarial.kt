class MensajeriaEmpresarial(correo: String): IPlataformaNotificacion(correo) {

    override fun enviarNotificacion(mensaje: String) {
        println("MensajeriaEmpresarialNotificador $mensaje")
    }

}