class MensajeriaEmpresarial(var destino: String): IPlataformaNotificacion {

    override fun enviarNotificacion(mensaje: String) {
        println("MensajeriaEmpresarialNotificador: Destino: $destino Mensaje: $mensaje")
    }

}