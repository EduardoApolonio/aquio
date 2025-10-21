//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Funcionario mensal = new Mensalista("Edu", 550.0);
        Funcionario horista = new Horista("Bia", (int) 4.0, 5);
        Funcionario comissionado = new Comissionado("tee", 233.3, 943.3, 100.0);

        System.out.println(mensal.contraCheque());
        System.out.println(horista.contraCheque());
        System.out.println(comissionado.contraCheque());

        }
    }
