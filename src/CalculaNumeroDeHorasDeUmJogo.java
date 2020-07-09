import java.util.Scanner;

public class CalculaNumeroDeHorasDeUmJogo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Game timer");
        int horaInicial = obterHora("Digite a hora inicial:");
        int horaFinal = obterHora("Digite a hora final:");
        calcularEImprimirDuracaoDoJogo(horaInicial, horaFinal);
    }

    private static void calcularEImprimirDuracaoDoJogo(int horaInicial, int horaFinal) {
        int numeroDeHorasDoDia = 24;
        int duracaoDoJogo = horaFinal - horaInicial;
        if (duracaoDoJogo <= 0) {
            duracaoDoJogo += numeroDeHorasDoDia;
        }
        System.out.printf("Duração do jogo: %d hora (s).", duracaoDoJogo);
    }

    private static int obterHora(String mensagemAoUsuario) {
        System.out.println(mensagemAoUsuario);
        return scanner.nextInt();
    }
}
