import java.util.Scanner;

public class Calificaciones {
    static String nombre;
    static float [] calificaciones = new float[5];
    static float promedio = 0;
    static String calificacion = null;

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nombre del estudiante: ");
        nombre = teclado.nextLine();
        for (int i = 0; i < 5; i++){
            System.out.print("Digite la calificación " + (i + 1) + ": ");
            calificaciones [i] = entrada.nextFloat();
        }
        System.out.println();
        calcular_promedio(calificaciones);
        calificacion_final(promedio);
        imprimir(nombre, calificaciones, promedio, calificacion);
    }

    public static float calcular_promedio (float [] calificaciones){
        float total = 0;
        for (int i = 0; i < 5; i++){
            total = calificaciones [i] + total;
        }
        promedio = total / 5;
        return promedio;
    }

    public static String calificacion_final (float promedio){
        if (promedio <= 50){
            calificacion = "F";
        }else if (promedio >= 50 && promedio < 61){
            calificacion = "E";
        }else if (promedio >= 61 && promedio < 71){
            calificacion = "D";
        }else if (promedio >= 71 && promedio < 81){
            calificacion = "C";
        }else if (promedio >= 81 && promedio < 91){
            calificacion = "B";
        }else if (promedio <= 100){
            calificacion = "A";
        }
        return calificacion;
    }

    public static void imprimir (String nombre, float [] calificaciones, float promedio, String calificacion){
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < 5; i++){
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones [i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }
}