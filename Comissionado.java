public class Comissionado extends Funcionario{
    private double salarioBase;
    private double txComissao;
    private double totalVenda;

    public Comissionado(String nome, double salarioBase, double txComissao, double totalVenda) {
        super(nome);
        this.salarioBase = salarioBase;
        this.txComissao = txComissao;
        this.totalVenda = totalVenda;
    }


    @Override
    public double calularSalario() {
        return  salarioBase + (txComissao * totalVenda);
    }
}
