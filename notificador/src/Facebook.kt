class Facebook(correo: String): IPlataformaNotificacion {
    override fun enviarNotificacion(mensaje: String) {
        println("FacebookNotificador $mensaje")
    }
}