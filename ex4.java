import java.util.Scanner;
public class ex4 {
    /* O carro e o caminhão estão à mesma distância de Ribeirão Preto ao eles se cruzarem, eles se encontram a 60,9 km de Ribeirão Preto.
     Consegui fazer a conta somente no meu caderno, mas, para isso, precisamos determinar onde eles vão se encontrar.
     Para isso começamos pelo caminhao, que tem o detalhe do pedagio, que impactaria direamente na velocidade media dele
     que nao seria mais 80, seria 70,6km/h
     dito isso, temos a velocidade media do caminhao e do carro, ja que o carro possui sem parar
     e usando formulas de mru, podemos chegar a conclusao que se encontrariam a 60,49 km de ribeirao preto.
     */

    // nao consegui pensar em uma lógica que coloque a regra do pedagio para fazer um programa, mas
    // tentei desenvolver um q mostre o momento que eles se cruzariam, fornecendo distancia/velocidade de cada veiculo.
    // so de extra mesmo, caso queira dar uma olhada.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a velocidade média do primeiro veículo (em km/h): ");
        double velocidade1 = input.nextDouble();

        System.out.print("Digite a velocidade média do segundo veículo (em km/h): ");
        double velocidade2 = input.nextDouble();

        System.out.print("Digite a distância entre as cidades (em km): ");
        double distancia = input.nextDouble();

        double tempo = distancia / (velocidade1 + velocidade2);
        double distanciaPercorrida1 = velocidade1 * tempo;

        System.out.printf("Os veículos se encontram em %.2f km a partir da cidade inicial do primeiro veículo.", distanciaPercorrida1);
    }
}
