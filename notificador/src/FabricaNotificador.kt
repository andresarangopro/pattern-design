class FabricaNotificador {

    val FACEBOOK = "facebook"
    val SMS = "SMS"
    val MENSAJERIAEMPRESARIAL = "mensajeria_empresarial"

    fun crearNotificador(tipoPlataforma:String, destino:String): IPlataformaNotificacion? {
        when(tipoPlataforma){
            FACEBOOK->{return Facebook(destino)}
            SMS->{return SMS(destino)}
            MENSAJERIAEMPRESARIAL->{return MensajeriaEmpresarial(destino)}
        }
        return null
    }
}