public abstract class Funcionario {
    protected String nome;

    public Funcionario(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calularSalario();

    public String contraCheque(){
        return "Nome: " + nome +
                "\nSalario: " + String.format("%.2f",calularSalario());
    }
}
