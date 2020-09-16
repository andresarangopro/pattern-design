package Decorator

class MensajeriaEmpresarialNotificador(): PlataformaNotificacion() {
    override fun enviarMensaje(mensaje: String) {
        println("MensajeriaEmpresarialNotificador $mensaje")
    }


}