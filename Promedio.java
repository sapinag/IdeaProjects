
import java.util.Scanner;
public class Promedio {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int calif[]= new int[5];
        int suma;
        //float nombre;
        suma = 0;
        float promedio;
        System.out.println("CUAL ES TU NOMBRE:");
        String nombre = s.nextLine();
        System.out.println("PROMEDIO DE CALIFICACIONES");
        System.out.println("INGRESA CALIFICACION #1:");
        calif[0] = s.nextInt();
        System.out.println("INGRESA CALIFICACION #2:");
        calif[1] = s.nextInt();
        System.out.println("INGRESA CALIFICACION #3:");
        calif[2] = s.nextInt();
        System.out.println("INGRESA CALIFICACION #4:");
        calif[3] = s.nextInt();
        System.out.println("INGRESA CALIFICACION #5:");
        calif[4] = s.nextInt();

        for(int i = 0; i < calif.length; i++) {
            suma += calif[i];
        }
        promedio=(suma/ calif.length);
        System.out.println("Nombre de Alumno:   "+nombre);
        System.out.println("Calificacion #1:   "+calif[0]);
        System.out.println("Calificacion #2:   "+calif[1]);
        System.out.println("Calificacion #3:   "+calif[2]);
        System.out.println("Calificacion #4:   "+calif[3]);
        System.out.println("Calificacion #5:   "+calif[4]);
        System.out.println("EL PROMEDIO ES:   "+promedio);
        if (promedio >90) {
            System.out.println("Y tu nota es: A");
        }
            else
                if (promedio >80 && promedio <=90)
                {
                System.out.println("Y tu nota es: B");
                }
                else
                if (promedio >70 && promedio <=80)
                {
                    System.out.println("Y tu nota es: C");
                }
                else
                if (promedio >60 && promedio <=70)
                {
                    System.out.println("Y tu nota es: D");
                }
                else
                if (promedio >50 && promedio <=60)
                {
                    System.out.println("Y tu nota es: E");
                }
                else
                if (promedio <=50)
                {
                    System.out.println("Y tu nota es: F");
                }
        }

}
