package examenu2;
import java.util.Scanner;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExamenU2 {
   //primero ingrese los 5 positivos
    public static void main(String[] args) {
        
        List<Integer> impar = new ArrayList<Integer>();
        List<Integer> par = new ArrayList<Integer>();
        System.out.println("Ingresa numeros");
        numeros(impar,par,0,0);
    }
    private static void numeros(List impar,List par,int numpar,int contar){
        Scanner leer=new Scanner(System.in);
        int num;
            if (numpar<5||contar<5) {
                        num=leer.nextInt();
                                               if (contar!=5) {
                            if (num%2==0) {
                            par.add(num);
                            
                            numeros(impar,par,numpar,contar+1);
                            }
                        }
                        if(contar==5){
                            System.out.println("ingresa impares");
                          
                        }

                        if (numpar!=5) {
                            if(num%2!=0){
                            impar.add(num);
                           
                            numeros(impar,par,numpar+1,contar);
                            }    
                        }
                        if(numpar==5){
                             System.out.println("ingresa numeros pares");
                            System.out.println("");                        }
            }
             if (numpar==5&&contar==5) {
                 System.out.print("\n" +impar.get(0));
                 System.out.print("-" +par.get(0));
                 System.out.print("-" + impar.get(1));
                 System.out.print("-" + par.get(1));
                 System.out.print("-" + impar.get(2));
                 System.out.print("-" + par.get(2));
                 System.out.print("-" + impar.get(3));
                 System.out.print("-" + par.get(3));
                 System.out.print("-" + impar.get(4));
                 System.out.println("-" + par.get(4));
                
             }
        
    }
}
