package ers.indiv03;
import java.util.Scanner;
public class ejercicio03 
{
    public static void main(String[] args) 
    {
        try
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Introduzca el numero de la opcion que desea ejecutar: \n 1-Añadir un usuario \n 2-Añadir un producto \n 3-getNombre(producto) \n 4-setNombre(producto) \n 5-getReferencia(producto) "
                + "\n 6-setReferencia(producto) \n 7-getUnidades(producto) \n 8-setUnidades(producto)"
                + "\n 9-getUnidades(producto) \n 10-setUnidades(producto) \n 11-Mostrar las caracteristicas de un prodructo \n 12-getNombre(usuario) \n 13-setNombre(usuario) "
                + "\n 14-getApellidos(usuario) \n 15-setApellidos(usuario) \n 16-getEdad(usuario) \n 17-setEdad(usuario)"
                + "\n 18-getDNI(usuario) \n 19-setDNI(usuario) \n 20-Mostrar las caracteristicas de un usuario \n 21-Salir del programa");
            Usuario Luis = new Usuario("", "", 0, "");
            Producto Detergente = new Producto("", "", 0);
            int numero = keyboard.nextInt();
            String operacion;
            switch(numero)
            {
                case 1:
                    System.out.println("Introduzca el nombre");
                    String a = keyboard.next();
                    System.out.println("Introduzca el apellido");
                    String b = keyboard.next();
                    System.out.println("Introduzca la edad");
                    int c = keyboard.nextInt();
                    System.out.println("Introduzca el dni");
                    String d = keyboard.next();
                    Luis = new Usuario(a, b, c, d);
                    break;
                case 2:
                    System.out.println("Introduzca el nombre");
                    String a1 = keyboard.next();
                    System.out.println("Introduzca la referencia");
                    String b1 = keyboard.next();
                    System.out.println("Introduzca las unidades");
                    int c1 = keyboard.nextInt();
                    Detergente = new Producto(a1, b1, c1);    
                    break;
                case 3:
                    System.out.println(Detergente.getNombre());
                    break;
                case 4:
                    Detergente.setNombre(keyboard.next());
                    break;
                case 5:
                    System.out.println(Detergente.getReferencia());
                    break;
                case 6:
                    Detergente.setReferencia(keyboard.next());
                    break;
                case 7:
                    System.out.println(Detergente.getUnidades());
                    break;
                case 8:
                    Detergente.setUnidades(keyboard.nextInt());
                    break;
                case 9:
                    System.out.println(Detergente.getUnidades());
                    break;
                case 10:
                    Detergente.setUnidades(keyboard.nextInt());
                    break;
                case 11:
                    System.out.println(Detergente.toString());
                    break;
                case 12:
                    System.out.println(Luis.getNombre());
                    break;
                case 13:
                    Luis.setNombre(keyboard.next());
                    break;
                case 14:
                    System.out.println(Luis.getApellidos());
                    break;
                case 15:
                    Luis.setApellidos(keyboard.next());
                    break;
                case 16:
                    System.out.println(Luis.getEdad());
                    break;
                case 17:
                    Luis.setEdad(keyboard.nextInt());
                    break;
                case 18:
                    System.out.println(Luis.getDNI());
                    break;
                case 19:
                    Luis.setDNI(keyboard.next());
                    break;
                case 20:
                    System.out.println(Luis.toString());
                    break;
                case 21: 
                    System.out.println("Saliendo del programa...");
                    break;
                default: System.out.println("El numero introducido no corresponde a ninguna de las opciones");    
            }
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e);
        }
    }
}
