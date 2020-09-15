class SMS(var destino: String): IPlataformaNotificacion {

    override fun enviarNotificacion(mensaje: String) {
        println("SMSNOTIFICADOR: Destino: $destino Mensaje: $mensaje")
    }

}