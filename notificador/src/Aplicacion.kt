fun main(args:Array<String>) {
    val FACEBOOK = "facebook"
    val SMS = "SMS"
    val MENSAJERIAEMPRESARIAL = "mensajeria_empresarial"

    var array = arrayListOf<Usuario>(
        Usuario("andresarango",FACEBOOK),
        Usuario("andresarango",SMS),
        Usuario("andresarango",MENSAJERIAEMPRESARIAL)
    )
    var notificador = Notificador(array)

    notificador.enviarMensaje("Hoy promoción en desarrollos SONDERSOFT !!! que esperas en hacer tus sueños realidad")

}