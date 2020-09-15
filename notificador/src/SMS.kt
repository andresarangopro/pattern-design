class SMS(var correo: String): IPlataformaNotificacion {

    override fun enviarNotificacion(mensaje: String) {
        println("SMSNOTIFICADOR: Destino: $correo Mensaje: $mensaje")
    }

}