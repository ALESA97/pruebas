import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //INICIO SIN ARRAYS
        Scanner input=new Scanner(System.in);
        System.out.println("Indica cuantos valores quieres introducir:");
        int nrvalors=input.nextInt();
        int valoracumulado=0;
        int valor;
        System.out.println("Comienza a introducir numeros:");
        for (int i = 0; i < nrvalors; i++) {
            valor= input.nextInt();
            valoracumulado +=valor; //valoracumulado=valoracumulado + valor
        }
        System.out.println("Promedio es:" + valoracumulado/nrvalors);
        //FIN SIN ARRAYS


        //INICIO CON ARRAYS
        System.out.println("Indica cuantos valores quieres introducir:");
        int nrValors=input.nextInt();
        double[] numeros=new double[nrValors];
        double valorAcumulado=0;
        System.out.println("Comienza a introducir numeros:");
        for (int i = 0; i < nrValors; i++) {
            numeros[i]= input.nextDouble();
            valorAcumulado +=numeros[i];
        }
        System.out.println("Promedio es:" + valorAcumulado/nrValors);
        //FIN CON ARRAYS

        //INICIO Arrays y boolean
        float[] scores={7.5f,5.0f,10.0f};
        boolean isInScores = false;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == 10) {
                isInScores = true;
            }
        }

        if (isInScores) {
            System.out.println("Un alumno ha conseguido un 10");
        }else{
            System.out.println("Naide ha sacado un 10");
        }

    }   //FIN Arrays y boolean
}