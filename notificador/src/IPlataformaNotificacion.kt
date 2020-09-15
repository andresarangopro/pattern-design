abstract class IPlataformaNotificacion(var correo:String) {

    abstract fun enviarNotificacion(mensaje:String)
}