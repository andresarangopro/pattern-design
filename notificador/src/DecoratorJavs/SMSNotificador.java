package DecoratorJavs;

public class SMSNotificador  extends PlataformaNotificador{
    public SMSNotificador(PlataformaNotificador plataformaNotificador) {
        super(plataformaNotificador);
    }

    public SMSNotificador() {
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("SMSNotificador "+mensaje);
        enviarATodos(mensaje);
    }
}
