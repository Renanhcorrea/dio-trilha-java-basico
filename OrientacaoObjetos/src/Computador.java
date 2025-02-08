

public class Computador {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else 
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
