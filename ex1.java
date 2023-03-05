
/*
Ao final do processamento, o valor da variável SOMA será 91.
O loop while irá iterar 13 vezes, pois K começa com o valor zero e é incrementado de 1 em 1 a cada iteração até chegar a 13. A cada iteração, o valor de K é adicionado à variável SOMA.
Assim, na primeira iteração, SOMA receberá o valor 1, na segunda iteração SOMA receberá 3 (1 + 2), na terceira iteração SOMA receberá 6 (1 + 2 + 3) e assim sucessivamente.
 */
public class ex1 {
    public static void main(String[] args) {

        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println(SOMA);
    }
}