package calculadora;

/**
 *
 * @author Nicholas Bueno
 */
import javax.swing.JOptionPane;
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String PrimNumero=
                JOptionPane.showInputDialog("Digite o primeiro Número");
        String SegNumero=
                JOptionPane.showInputDialog("Digite o segundo Número");
        String OP=
                JOptionPane.showInputDialog("selecione a operção desejada: +, -, * ou /");
        float resultado = 0;
        float n1 = Integer.parseInt(PrimNumero);
        float n2 = Integer.parseInt(SegNumero);
        switch (OP){
            case "+":
                resultado=(n1+n2);
            break;
            case "-":
                resultado=(n1-n2);
            break;
            case "*":
                resultado=(n1*n2);
            break;
            case "/":
                resultado=(n1/n2);
            break;
            default:
                JOptionPane.showMessageDialog(null, "sinal invalido!");
            break;
        }
        JOptionPane.showMessageDialog(null,"O resultado é: "+resultado);
            
    }
        
}
