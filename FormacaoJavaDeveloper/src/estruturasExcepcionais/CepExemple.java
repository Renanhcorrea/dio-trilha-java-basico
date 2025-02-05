package estruturasExcepcionais;

public class CepExemple  {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Try again.");
        }

    }

    static String formatarCep (String cep) throws CepInvalidoException {
        if(cep.length() != 8 )
            throw new CepInvalidoException ();

            //Trying to get one CEP.
            return "23.765-064";
    }
    
}
