/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica32 {
       
       public static double densidade(double x, double media, 
            double desvio) {  
        double d = (1/(Math.sqrt(2*Math.PI*desvio)))*
                Math.exp((-1/2)*Math.pow(((x-media)/desvio),2));
                    
        return d;
      }
      public static void main(String[] args) {
         
         System.out.println("Valor:\t"+densidade(-1,67,3));
      } 
}
