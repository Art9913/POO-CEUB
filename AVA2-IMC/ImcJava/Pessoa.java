class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public void mostrarImcPessoa() {
        double imc = calcularImc();
        System.out.printf("Olá %s, seu IMC é: %.2f%n", nome, imc);
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc < 24.9) {
            System.out.println("Você está com peso normal.");
        } else if (imc < 29.9) {
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está com obesidade.");
        }
    }

    private double calcularImc() {
        return peso / (altura * altura);
    }
}