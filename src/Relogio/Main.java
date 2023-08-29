package Relogio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Definir horário");
            System.out.println("2. Reiniciar para meia-noite");
            System.out.println("3. Iniciar cronômetro");
            System.out.println("4. Imprimir horário (formato 24 horas)");
            System.out.println("5. Imprimir horário (formato AM/PM)");
            System.out.println("6. Sair");
            System.out.print("Digite sua escolha: ");
            
            int escolha = scanner.nextInt();
            
            switch (escolha) {
                case 1:
                    System.out.print("Digite as horas: ");
                    int horas = scanner.nextInt();
                    System.out.print("Digite os minutos: ");
                    int minutos = scanner.nextInt();
                    System.out.print("Digite os segundos: ");
                    int segundos = scanner.nextInt();
                    relogio.definirHorario(horas, minutos, segundos);
                    break;
                case 2:
                    relogio.reiniciarMeiaNoite();
                    break;
                case 3:
                    relogio.iniciarCronometro();
                    break;
                case 4:
                    relogio.imprimirHorario(true);
                    break;
                case 5:
                    relogio.imprimirHorario(false);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Escolha inválida. Por favor, selecione uma opção válida.");
                    break;
            }
        }
    }
}