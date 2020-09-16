public class FacebookNotificador extends PlataformaNotificador{

    public FacebookNotificador(PlataformaNotificador plataformaNotificador) {
        super(plataformaNotificador);
    }

    public FacebookNotificador() {
        super();
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("FACEBOOK "+mensaje);
        enviarATodos(mensaje);
    }
}
