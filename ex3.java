public class ex3 {
    public static void main(String[] args) {

        // Sequência a) A lógica é adicionar 2 ao número anterior. O próximo elemento é 9.
        int a = 1;
        System.out.print(a + ", ");
        for (int i = 1; i < 4; i++) {
            a += 2;
            System.out.print(a + ", ");
        }
        System.out.println("9");

        // Sequência b) A logica é multiplicar o número anterior por 2. O próximo elemento é 128.
        int b = 2;
        System.out.print(b + ", ");
        for (int i = 1; i < 6; i++) {
            b *= 2;
            System.out.print(b + ", ");
        }
        System.out.println("128");

        // Sequência c) a logica é somar o numero anterior com 1 e depois multiplicar por ele mesmo. O próximo elemento é 49.
        int c = 0;
        System.out.print(c + ", ");
        for (int i = 1; i < 7; i++) {
            c = i*i;
            System.out.print(c + ", ");
        }
        System.out.println("49");

        // Sequência d) a = 100, é basicamente uma sequência dos quadrados dos números naturais pares
        for (int i = 2; i * i <= 100; i += 2) {
            System.out.print(i * i + ", ");
        }
        System.out.println("");

        // Sequência e) a lógica é somar os dois números anteriores. O próximo elemento é 13.
        int e1 = 1;
        int e2 = 1;
        System.out.print(e1 + ", " + e2 + ", ");
        for (int i = 2; i < 7; i++) {
            int temp = e1 + e2;
            System.out.print(temp + ", ");
            e1 = e2;
            e2 = temp;
        }
        System.out.println("");

        // Sequência f) o proximo número seria 200 "duzentos" já que todos numeros iniciam com a letra "d"
        // Não é possível gerar uma sequência de números que começam com a letra "d" em Java, pois a letra "d" não está relacionada com o conceito de números e sim de caracteres.
        // entao nao sera possivel mostrar na prática.
    }
}
