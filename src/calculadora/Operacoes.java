
package calculadora;

/**
 *
 * @author Emily Nascimento
 */
public class Operacoes {
    
    static double resultado;       //static - pode usar esse metodo sem criar objeto na classe
            
    public static void somar (double x1, double x2){
        resultado = x1+x2;
        System.out.println("Resultado = "+resultado);
    }
    public static void subtrair(double x1, double x2){
        resultado = x1-x2;
        System.out.println("Resultado = "+resultado);
    }
    public static  void multiplicar(double x1, double x2){
        resultado = x1*x2;
        System.out.println("Resultado = "+resultado);
    }
     public static void dividir(double x1, double x2){
        //estrutura de decisão
        if(x2==0){
            System.out.println("Impossível dividir porque o denominador é zero");
        }else{
            resultado = x1/x2;
            System.out.println("Resultado = "+resultado);
        }
        
    }
     
     
     
}
