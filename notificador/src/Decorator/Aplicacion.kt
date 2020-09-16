package Decorator

fun main(args:Array<String>) {
    val FACEBOOK = "facebook"
    val SMS = "SMS"
    val MENSAJERIAEMPRESARIAL = "mensajeria_emrpesarial"

    var plataforma:PlataformaNotificacion = MensajeriaEmpresarialNotificador()
    //plataforma = FacebookNotificador(plataforma)
}