package ClasseAbstrata;

public class Desenvolvedor extends Funcionario implements Trabalhavel{

    private String Linguagem;

    

    public Desenvolvedor() {
    }
    public Desenvolvedor(String nome, int matricula, float valorHora, int horasTrabalhadas,
            String Linguagem) {
        super(nome, matricula, valorHora, horasTrabalhadas);
        this.Linguagem = Linguagem;
    }

    public String getLinguagem() {
        return Linguagem;
    }
    public void setLinguagem(String Linguagem) {
        this.Linguagem = Linguagem;
    }


    @Override
    public float calcularSalario() {
        return (getHorasTrabalhadas() * getValorHora());        
    }

    @Override
    public String toString() {
        
        return super.toString() + 
        "\nCargo: Desenvolvedor" +
        "\nLinguagem Dominada: " + Linguagem +
        "\nSalário: R$:" + calcularSalario();
    }

    @Override
    public String trabalhar() {
        return "O desenvolvedor " + getNome() + " está trabalhando...";
    }

    @Override
    public String relatarProgresso() {
        return"O desenvolvedor " + getNome() + " está finalizando o trabalho.";
    }
}
