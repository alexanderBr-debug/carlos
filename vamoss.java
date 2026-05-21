import java.util.Scanner;
public class vamoss{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        

       
         double[] temperaturas = new double[7];   
         double sumaTotal = 0;                                                                                                                                      
          int contaCalorMayor = 0;
                int contaCalorMenor = 0;
            double maximaTemperatura  = temperaturas[0];
            double menorTemperatura  = temperaturas[0];
         
         

         for (int i = 0; i < temperaturas.length;i++){
           
            System.out.println("ingrese la temperatura del dia" + (i+1) + "");
            temperaturas[i] = sc.nextDouble();
             
            
             sumaTotal += temperaturas[i];
                
            }

            System.out.println("todas las temperaturas:");
        
            for(int j = 0;j< temperaturas.length;j++){
                
                System.out.println(temperaturas[j]);
                
                if (temperaturas[j] >= 30){
                    contaCalorMayor ++;
                }

                if (temperaturas[j] < 27){
                    contaCalorMenor ++;
                }

                
            }

            for (int k = 0; k < temperaturas.length;k++){
               if (maximaTemperatura < temperaturas[k]){
                maximaTemperatura = temperaturas[k];
               }
               if (menorTemperatura < temperaturas[k]){
                    menorTemperatura = temperaturas[k];
               }
            }

           
      

           
         double promedio = promedioTemperatura(sumaTotal);
         System.out.println("el promedio general es " + promedio );
      
         System.out.println( "la cantidad de dias calurosos fueron: " + contaCalorMayor);
           System.out.println( "la cantidad de dias frios fueron: " + contaCalorMenor);
           System.out.println("la maxima temperatura fue: " + maximaTemperatura);
           System.out.println("la menor temperatura fue: " + menorTemperatura);
                
          sc.close();

        



        
    }
      public static double promedioTemperatura(double sumaTotal){
       double promedio = sumaTotal/7;
       return promedio;
    }
    
}
