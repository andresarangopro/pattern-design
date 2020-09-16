package Decorator

abstract class PlataformaNotificacion() {
    var notifier:PlataformaNotificacion?=null

    abstract fun enviarMensaje(mensaje:String)
    constructor(notifier:PlataformaNotificacion):this(){
        this.notifier = notifier
    }
    fun enviarNotificador(){}
}