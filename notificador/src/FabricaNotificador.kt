class FabricaNotificador {

    val FACEBOOK = "facebook"
    val SMS = "SMS"
    val MENSAJERIAEMPRESARIAL = "mensajeria_emrpesarial"

    fun crearNotificador(tipoPlataforma:String, correo:String): PlataformaNotificacion? {
        when(tipoPlataforma){
            FACEBOOK->{return FacebookNotificador(correo)}
            SMS->{return SMSNotificador(correo)}
            MENSAJERIAEMPRESARIAL->{return MensajeriaEmpresarialNotificador(correo)}
        }
        return null
    }
}