import java.util.ArrayList;

public class Aplicacion {

    public static void main(String[] args){
        PlataformaNotificador plataformaNotificador =new  FacebookNotificador();
        plataformaNotificador = new MensajeriaEmpresarialNotificador(plataformaNotificador);
        plataformaNotificador = new SMSNotificador(plataformaNotificador);
        plataformaNotificador.enviarNotificacion("Hola \n");


        PlataformaNotificador pn = new SMSNotificador();
        pn =  new FacebookNotificador(pn);
        pn.enviarNotificacion("Bye -  bye ");
    }
}
