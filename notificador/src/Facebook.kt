class Facebook(correo: String): IPlataformaNotificacion(correo) {


    override fun enviarNotificacion(mensaje: String) {
        println("FacebookNotificador $mensaje")
    }

}