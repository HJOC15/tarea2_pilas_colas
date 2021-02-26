import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        //Creamos nuestras variables y la cola
        Scanner teclado = new Scanner(System.in);
        int opcion;
        Queue cola = new LinkedList<>();

            while(true){

                System.out.println("1. Agregar aviones");
                System.out.println("2. mostrar los aviones que actualmente se encuentran en el hangar\n" +
                        "3. Ver cual avión esta disponible para salir del hangar.\n" +
                        "4. Mostrar la lista de aviones pendientes por despegar\n" +
                        "5. Hacer que el avion despeguer \n" +
                        "6. Salir");
                System.out.println("Ingresa tu opcion");
                opcion = teclado.nextInt();
                switch (opcion){
                    case 1:
                        //Ingreso de aviones
                        System.out.print("Ingresa el número de aviones a ingresar: ");
                        int total = teclado.nextInt();

                        for (int i = 0; i < total; i++) {
                            System.out.println("Agregando el avion número " + (i + 1));
                            cola.add(teclado.next());
                        }
                        break;

                    case 2:

                        //Ver el siguiente avion

                        System.out.println("El siguiinte a avion a despegar  es: " + cola);
                        break;

                    case 3:
                        // Ver la lista de aviones

                        System.out.println("Los aviones pemdoemtes son: ");
                        System.out.println(cola.peek());
                        break;

                    case 4:
                        // E l siguiente avion a despegar
                        System.out.println("Los aviones pendientes son: ");
                        System.out.println(cola);
                        break;

                    case 5:
                        // hacer que un avion despegue
                        cola.remove(cola.peek());
                        break;

                    case 6:
                        System.out.println("Gracias por usar el servicio");
                        break;

                    default:
                        System.out.println("Opcion inválida");
                        break;

                }

                if (opcion == 6){
                    break;
                }
            }
    }

}