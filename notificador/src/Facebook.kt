class Facebook(var correo: String): IPlataformaNotificacion {
    override fun enviarNotificacion(mensaje: String) {
        println("FacebookNotificador: Destino: $correo Mensaje: $mensaje")
    }
}