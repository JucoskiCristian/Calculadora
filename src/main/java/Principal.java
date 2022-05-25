import calculadora.Calculadora;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String opcao = "";
        Calculadora calculadora = new Calculadora();
        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog("1 - Leitura \n 2 - Soma\n 3 - Subtração\n 4 - Produto\n 5 - Divisão \n 9 - Sair");
            switch (Integer.parseInt(opcao)) {
                case 1:
                    calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor A")));
                    calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor B")));
                    break;
                case 2: JOptionPane.showMessageDialog(null, "Soma: " + calculadora.getAdicao());
                break;
                case 3: JOptionPane.showMessageDialog(null, "Subtração: " + calculadora.getSubtracao());
                break;
                case 4: JOptionPane.showMessageDialog(null, "Produto: " + calculadora.getProduto());
                break;
                case 5: JOptionPane.showMessageDialog(null, "Divisão: " + calculadora.getDivisao());
                break;
            }
        }
    }
}