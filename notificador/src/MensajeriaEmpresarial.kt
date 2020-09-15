class MensajeriaEmpresarial(var correo: String): IPlataformaNotificacion {

    override fun enviarNotificacion(mensaje: String) {
        println("MensajeriaEmpresarialNotificador: Destino: $correo Mensaje: $mensaje")
    }

}