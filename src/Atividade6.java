import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double raio, area;
        System.out.println("Digite o valor do raio do círculo: ");
        raio = input.nextDouble();

        area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);
    }

}
