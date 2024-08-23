import java.util.Scanner

public class SomaNumero {
    private int num1, num2;
    
    public SomaNumero(int numero1, int numero2) {
        this.num1 = numero1;
        this.num2 = numero2;
    }
    public int somar() {
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(system.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt;
        SomaNumero soma = new SomaNumero(numero1, numero2);
        int result = soma.somar();
        System.out.println("O resultado da soma é: " + result);
        scanner.close;
    }
}