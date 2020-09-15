class Facebook(var destino: String): IPlataformaNotificacion {
    override fun enviarNotificacion(mensaje: String) {
        println("FacebookNotificador: Destino: $destino Mensaje: $mensaje")
    }
}