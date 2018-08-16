
package ejercicio47video55;

import java.util.*;

public class Matriz {
    
    public void trans(){
        
        Scanner entrada = new Scanner(System.in);
        int matriz [][] = new int [3][3];
        
        System.out.println("DIGITE LA MATRIZ");
        
        for(int i=0; i<3; i++){
            
            for(int j=0; j<3; j++){
                
                System.out.print("MATRIZ["+i+"]["+j+"]: ");
                matriz [i][j]=entrada.nextInt();
            }
        }
        
        System.out.println("\nMATRIZ ORIGINAL: ");
        
         for(int i=0; i < 3; i++){
            
            for(int j=0; j < 3; j++){
                
                System.out.print(matriz[i][j]+" ");
                
            }
            System.out.println("");
         }
        
         int aux;
         
         for(int i=0; i < 3; i++){
            
            for(int j=0; j < i; j++){
                aux = matriz[i][j];
                matriz [i][j] = matriz[j][i];
                matriz [j][i] = aux;
            }
            }
         
         
         System.out.println("LA MATRIZ TRANSPUESTA ES: ");
         
         for(int i=0; i < 3; i++){
            
            for(int j=0; j < 3; j++){
            
                System.out.print(matriz[i][j]+" ");
            }
            
            System.out.println("");
            }
    }
    
}
