import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Gerador de Senhas Aleatórias ===");
        System.out.print("Digite o tamanho da senha que você deseja gerar (1 a 20): ");

        int tamanho = scanner.nextInt();

        if (tamanho < 1 || tamanho > 20) {
            System.out.println("Erro: o tamanho da senha deve estar entre 1 e 20 caracteres.");
            scanner.close();
            return;
        }

        String senhaGerada = gerarSenha(tamanho);
        System.out.println("Senha gerada: " + senhaGerada);

        scanner.close();
    }

    public static String gerarSenha(int tamanho) {
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*";
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            int index = (int) (Math.random() * caracteres.length());
            senha.append(caracteres.charAt(index));
        }

        return senha.toString();
    }
}
