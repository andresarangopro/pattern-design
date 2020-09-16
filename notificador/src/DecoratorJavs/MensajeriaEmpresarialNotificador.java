package DecoratorJavs;

public class MensajeriaEmpresarialNotificador extends PlataformaNotificador{

    public MensajeriaEmpresarialNotificador(PlataformaNotificador plataformaNotificador) {
        super(plataformaNotificador);
    }

    public MensajeriaEmpresarialNotificador() {
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("MensajeriaEmpresarialNotificador "+mensaje);
        enviarATodos(mensaje);
    }
}
