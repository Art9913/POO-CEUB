public class Professor {
    private String nomeCompleto;
    private String matricula;

    public Professor(String nomeCompleto, String matricula) {
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Professor: " + nomeCompleto + " | Matrícula: " + matricula;
    }
}
