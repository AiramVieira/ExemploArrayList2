
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * @author Alunos
 */
public class Exemplo03 {

    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um número")));
        }
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Posição[" + i + "] => " + numeros.get(i));
        }
        int soma = 0;

        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }
        double media = soma / numeros.size();

        int menorNumero = Integer.MAX_VALUE;
            for (int i = 0; i < numeros.size(); i++) {
                if(numeros.get(i) < menorNumero){
                    menorNumero = numeros.get(i);
                }
        }
        int maiorNumero = Integer.MIN_VALUE;
            for (int i = 0; i < numeros.size(); i++) {
                if(numeros.get(i) > maiorNumero){
                    maiorNumero = numeros.get(i);
                }
        }
        JOptionPane.showMessageDialog(null, 
                "A soma é: " + soma
                + "\n A média é: " + media
                + "\n O menor número é: " + menorNumero
                + "\n O maior número é: " + maiorNumero);

    }
}
