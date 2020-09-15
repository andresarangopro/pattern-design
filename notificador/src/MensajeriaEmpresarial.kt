class MensajeriaEmpresarial(correo: String): IPlataformaNotificacion {

    override fun enviarNotificacion(mensaje: String) {
        println("MensajeriaEmpresarialNotificador $mensaje")
    }

}