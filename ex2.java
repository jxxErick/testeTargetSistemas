import java.util.Scanner;

    public class ex2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num, a = 0, b = 1, c;

            System.out.print("Digite um número inteiro positivo: ");
            num = input.nextInt();
            /* um loop while para gerar a sequência de Fibonacci, armazenando os valores anteriores nas variáveis a e b.
            A cada iteração, a variável c recebe a soma de a e b, e os valores de a e b são atualizados. Quando o valor de b
            ultrapassa o número informado pelo usuário, o loop é interrompido. */

            while (b < num) {
                c = a + b;
                a = b;
                b = c;
            }

            /* uma verificação se o número informado pertence ou não à sequência de Fibonacci, comparando-o com o valor de b ao final do loop.
            Se forem iguais, uma mensagem é exibida informando que o número pertence à sequência, caso contrário é
            exibida uma mensagem informando que não pertence.*/

            if (b == num) {
                System.out.println(num + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println(num + " não pertence à sequência de Fibonacci.");
            }
        }
    }

