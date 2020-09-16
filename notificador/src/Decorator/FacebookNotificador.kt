package Decorator

class FacebookNotificador(): PlataformaNotificacion() {
    override fun enviarMensaje(mensaje: String) {
        println("FacebookNotificador $mensaje")
    }


}