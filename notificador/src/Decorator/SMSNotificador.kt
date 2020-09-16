package Decorator

class SMSNotificador(): PlataformaNotificacion() {

    override fun enviarMensaje(mensaje: String) {
        println("SR . SMSNOTIFICADOR $mensaje")
    }

}