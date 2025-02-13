
package registros_concierto;
import java.util.Scanner;

public class Registros_concierto {
    
    public static void menuPrincipal(){
        System.out.println("-------MENU-------");
        System.out.println("1. Ver cociertos disponibles. ");
        System.out.println("2. Registrar clientes.");
        System.out.println("3. Comprar ticket.");
        System.out.println("4. Ver tickets por cliente.");
        System.out.println("5. Cancelar ticket.");
        System.out.println("6. Finalizar");
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Registros_concierto concierto=new Registros_concierto();
        boolean booleanito=true;
        while(booleanito){
            System.out.println("--------BIENNVENIDO");
            concierto.menuPrincipal();
            System.out.println("");
            int ingresa_id=0;
            System.out.println("Ingrese la id a la que desea entrar:");
            ingresa_id=scanner.nextInt();
            switch(ingresa_id){
                case 1:
                    System.out.println("_______CONCIERTOS DISPONIBLES_____");
                    
                break;  
                case 2:
                     System.out.println("_______REGISTRAR CLIENTE_____");
                break;
                case 3:
                     System.out.println("_______COMPRAR TICKET_____");
                break;
                case 4:
                     System.out.println("_______LISTAR TICKETS POR CLIENTE_____");
                break;
                case 5:
                     System.out.println("_______CANCELAR TICKET_____");
                break;
                case 6:
                    System.out.println("Haz abandonado el programa Hasta la proxima :)");
                    booleanito=false;
                    
                break;


            }
        }
        
    }
    
}
