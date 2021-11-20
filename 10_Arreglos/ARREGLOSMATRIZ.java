java.util.*;

public class ARREGLOMATRIZ{


    public static void main(String[] args){
        int arreglo[] = new int[10];
        for(int i = 5; i<arreglo.length; i++){
            System.out.println("Magia: " + arreglo[i]);
            Scanner.entrada = new Scanner(System.in);

            int matriz[][]= new int [3][3];

            float sumafilas = 0;

            for (int i = 0; i<matriz.length; i++){
                for(int j = 0; j< matriz.length; j++){
                    System.out.println("ingresa el valor de la fila"
                    + i + "ingresa el valor de la columna" + j + " ");

                    matriz[i][j] = entrada.nextInt();
                }
                
            }
            for (int i = 0; i<matriz.length; i++ ){
                for (int j = 0; i<matriz.length; j++){
                    sumafilas+=matriz [i][j];

                }
                System.out.println
            }

    }


}

