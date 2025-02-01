package repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class RepeticaoWhile {
    public static void main(String[] args) {
        //Estrutura de Repeticao.
        // While: "Enquanto".
        double mesada = 50.0;

        while (mesada>0 )
        {
            double valorDoce = valorAleatorio();
          
            if(valorDoce > mesada){
                valorDoce = mesada;
            }
            
            System.out.println("Doce do valor: " + valorDoce);
            mesada = mesada - valorDoce;
        }        
        System.out.println("Mesada: " + mesada);
        System.out.println("Joaozinho gastou toda a sua mesa.");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
