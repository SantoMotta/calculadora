package calculadora;

import javax.swing.JOptionPane;
import calculadora.Calculadora;
public class Principal {
public static void main(String[] args) {
String opcao = "";
Calculadora calculadora = new Calculadora();
while (!opcao.equals("9")) {
    opcao = JOptionPane.showInputDialog("1 - leitura \n2 - soma \n3 - subtração \n4 - produto \n5 - divisão \n9 - sair");
switch (Integer.parseInt(opcao)) {
    case 1:
        calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A")));
        calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B")));
       break;
    case 2:
        
                JOptionPane.showMessageDialog(null,"soma:"+calculadora.getAdicao());
        break;
    case 3:
                JOptionPane.showMessageDialog(null,"soma:"+calculadora.getSubtracao());
        break;
    case 4:
                JOptionPane.showMessageDialog(null,"soma:"+calculadora.getProduto());
        break;
    case 5:
                JOptionPane.showMessageDialog(null,"soma:"+calculadora.getdivisao());
        break;
       
}
}
}
}