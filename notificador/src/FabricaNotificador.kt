class FabricaNotificador {

    val FACEBOOK = "facebook"
    val SMS = "SMS"
    val MENSAJERIAEMPRESARIAL = "mensajeria_emrpesarial"

    fun crearNotificador(tipoPlataforma:String, correo:String): IPlataformaNotificacion? {
        when(tipoPlataforma){
            FACEBOOK->{return Facebook(correo)}
            SMS->{return SMS(correo)}
            MENSAJERIAEMPRESARIAL->{return MensajeriaEmpresarial(correo)}
        }
        return null
    }
}