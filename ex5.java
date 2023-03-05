import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = input.nextLine();

        String palavraInvertida = "";

        //para percorrer os caracteres da string de trás para frente, começando pelo último caracter e indo até o primeiro.
        // Em cada iteração do loop, adicionamos o caracter à nova string palavraInvertida. Por fim, exibimos a string invertida na tela.

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

        System.out.println("A palavra invertida é: " + palavraInvertida);
    }
}