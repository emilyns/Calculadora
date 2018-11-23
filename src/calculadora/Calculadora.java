
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Emily Nascimento
 */
public class Calculadora {
//while - enquanto
//integer: metodo statico - não precisa criar objeto
    public static void main(String[] args) {
       Operacoes.somar(10, 20);
       
       //utilizando metodo estatico da classe Operacoes
       String valor = JOptionPane.showInputDialog(null, "Informe um numero");
       int numero = Integer.parseInt(valor);
       
       int tabuada = 0;
       
       while(tabuada <= 11){
            Operacoes.dividir(numero, tabuada);
            tabuada = tabuada + 1;
          }
       for(int i=0; i<=0; i++){
           Operacoes.multiplicar(numero, i);
       }
       
       
    }
    
}
