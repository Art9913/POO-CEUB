import java.util.Scanner;

public class TelaLoginProfessor {
    private Professor professorAtual;

    public void acessar(String nome, String matricula) {
        professorAtual = new Professor(nome, matricula);
        System.out.println("Login realizado com sucesso!");
        System.out.println(professorAtual);
    }

    public void limparCampos() {
        professorAtual = null;
        System.out.println("Campos limpos.");
    }

    public static void main(String[] args) {
        TelaLoginProfessor tela = new TelaLoginProfessor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Login Professor ===");
        System.out.print("Nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();

        tela.acessar(nome, matricula);

        // tela.limparCampos(); // Descomente se quiser testar limpar campos
    }
}
