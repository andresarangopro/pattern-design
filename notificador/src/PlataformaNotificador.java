public abstract class PlataformaNotificador {

    public PlataformaNotificador plataformaNotificador;

    public PlataformaNotificador(PlataformaNotificador plataformaNotificador){
        this.plataformaNotificador = plataformaNotificador;
    }

    public PlataformaNotificador(){}

    public abstract void enviarNotificacion(String mensaje);

    public void enviarATodos(String mensaje){
        if(plataformaNotificador != null) {
            plataformaNotificador.enviarNotificacion(mensaje);
        }
    }
}
