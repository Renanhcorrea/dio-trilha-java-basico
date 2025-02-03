package estruturasExcepcionais;

public class CepExemple {
    public static void main(String[] args) {
        try {
            String cepFormatdo = newCep("23765064");
            System.out.println(cepFormatdo);
        } catch (CepInvalidoException e) {
            System.out.println("Try again.");
        }
        
    

    }

    static String newCep (String cep) throws CepInvalidoException{
        if(cep.length() != 8 )
            throw new CepInvalidoException();

            //Trying to get one CEP.
            return "23.765-064";
    }
    
}
