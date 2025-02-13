
package registros_concierto;
import java.util.ArrayList;
import java.util.Scanner;
import registros_concierto.Clientes.Concierto;
import registros_concierto.Clientes.Ticket;
import registros_concierto.Clientes.zona;

public class Registros_concierto {
    
    public static void menuPrincipal(){
        System.out.println("-------MENU-------");
        System.out.println("1. Ver cociertos disponibles. ");
        System.out.println("2. Registrar clientes.");
        System.out.println("3. Comprar ticket.");
        System.out.println("4. Ver tickets por cliente.");
        System.out.println("5. Ver tickets por concierto.");
        System.out.println("6. Cancelar ticket.");
        System.out.println("7. Finalizar");
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        
        ArrayList<Clientes> clientes = new ArrayList<>();
        clientes.add(new Clientes(1, "Juan", "Pérez", "juan.perez@mail.com", 312456789));
        clientes.add(new Clientes(2, "María", "García", "maria.garcia@mail.com", 31654321));
        clientes.add(new Clientes(3, "Carlos", "Sánchez", "carlos.sanchez@mail.com", 326789123));
        clientes.add(new Clientes(4, "Ana", "López", "ana.lopez@mail.com", 321654987));
        clientes.add(new Clientes(5, "Luis", "Martínez", "luis.martinez@mail.com", 325123456));

        // Lista de Conciertos
        ArrayList<Concierto> conciertos = new ArrayList<>();
        conciertos.add(new Concierto(1, "Rock en Vivo", "Queen", "2025-03-01", "Estadio A", 50.0));
        conciertos.add(new Concierto(2, "Fiesta Electrónica", "David Guetta", "2025-03-10", "Club B", 40.0));
        conciertos.add(new Concierto(3, "Concierto Clásico", "Yo-Yo Ma", "2025-04-05", "Teatro C", 60.0));
        conciertos.add(new Concierto(4, "Festival Reggaeton", "Bad Bunny", "2025-04-12", "Arena D", 45.0));
        conciertos.add(new Concierto(5, "Concierto Pop", "Ariana Grande", "2025-05-20", "Auditorio E", 55.0));
        conciertos.add(new Concierto(6, "Festival de Jazz", "Miles Davis", "2025-06-10", "Teatro F", 65.0));
        conciertos.add(new Concierto(7, "Concierto de Música Latina", "Shakira", "2025-07-15", "Estadio G", 70.0));
        conciertos.add(new Concierto(8, "R&B Soul", "Alicia Keys", "2025-08-01", "Teatro H", 50.0));
        conciertos.add(new Concierto(9, "Festival Metal", "Metallica", "2025-09-05", "Arena I", 75.0));
        conciertos.add(new Concierto(10, "Tour de Hip-Hop", "Kendrick Lamar", "2025-10-12", "Estadio J", 80.0));

        // Lista de Tickets
        ArrayList<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(1, 1, 2, "VIP", "2025-03-01", 100.0));
        tickets.add(new Ticket(2, 2, 1, "General", "2025-03-10", 60.0));
        tickets.add(new Ticket(3, 1, 3, "VIP", "2025-04-05", 120.0));
        tickets.add(new Ticket(4, 4, 1, "General", "2025-04-12", 90.0));
        tickets.add(new Ticket(5, 5, 4, "VIP", "2025-05-20", 110.0));

        // Lista de Zonas
        ArrayList<zona> zonas = new ArrayList<>();
        zonas.add(new zona(1, "General", 500, 20.0));
        zonas.add(new zona(2, "centro", 300, 15.0));
        zonas.add(new zona(3, "lateral_der", 200, 10.0));
        zonas.add(new zona(4, "lateral_izq", 100, 25.0));
        zonas.add(new zona(5, "VIP", 50, 30.0));
        
        
        
        Scanner scanner = new Scanner(System.in);
        Registros_concierto concierto=new Registros_concierto();
        System.out.println("--------BIENNVENIDO---------");
        System.out.println("");
        boolean booleanito=true;
        while(booleanito){
           
            
            concierto.menuPrincipal();
            System.out.println("");
            int ingresa_id=0;
            System.out.println("Ingrese la id a la que desea entrar:");
            ingresa_id=scanner.nextInt();
            switch(ingresa_id){
                case 1:
                    System.out.println("_______CONCIERTOS DISPONIBLES_____");
                    for (Concierto i : conciertos) {
                        StringBuilder concatconcer = new StringBuilder();
                        concatconcer.append("----------------------\n")
                        .append("id: ").append(i.id).append("\n")
                        .append("Nombre: ").append(i.Nombre).append("\n")
                        .append("Artista: ").append(i.Artista).append("\n")
                        .append("Fecha: ").append(i.Fecha).append("\n")
                        .append("Lugar: ").append(i.Lugar).append("\n")
                        .append("Precio Base: ").append(i.PrecioBase).append("\n");
                        
                      System.out.println(concatconcer);  
                    }
                     
                break;  
                case 2:
                    
                    System.out.println("_______REGISTRAR CLIENTE_____");
                    int idcliente=0;
                    String Nombrecliente="";
                    String Apellidocliente="";
                    String Correocliente="";
                    int Telefonocliente=0;
                    boolean idExiste = false;
                    while (!idExiste) {
                        System.out.println("Ingrese la id:");
                        idcliente=scanner.nextInt();
                        idExiste = true;
                        for (Clientes cliente : clientes) {
                            if (cliente.id == idcliente) {
                                System.out.println("El id ingresado ya existe.");
                                idExiste = false;
                                break;  
                            }
                        }
                    }
                    scanner.nextLine();
                    System.out.println("ingrese el nombre:");
                    Nombrecliente=scanner.nextLine();
                    System.out.println("Ingrese el apellido:");
                    Apellidocliente=scanner.nextLine();
                    System.out.println("Ingrese el correo electronico:"); 
                    Correocliente=scanner.nextLine();
                    System.out.println("Ingrese el numero de telefono:"); 
                    Telefonocliente=scanner.nextInt();

                    Clientes clientecito = new Clientes(idcliente, Nombrecliente, Apellidocliente, Correocliente, Telefonocliente);
                    clientes.add(clientecito);
                    System.out.println("");
                    System.out.println("__clientes__");
                    for (Clientes cliente : clientes) {
                        
                        StringBuilder concatcliente = new StringBuilder();
                        concatcliente.append("----------------------\n")
                        .append("id: ").append(cliente.id).append("\n")
                        .append("Nombre: ").append(cliente.Nombre).append("\n")
                        .append("Apellido: ").append(cliente.Apellido).append("\n")
                        .append("Correo: ").append(cliente.Correo).append("\n")
                        .append("Telefono: ").append(cliente.Telefono).append("\n");
                        System.out.println(concatcliente); 
                        
                    }  
                break;
                case 3:
                     System.out.println("_______COMPRAR TICKET_____");
                     System.out.println("");
                     int idnewticket=0;
                     int idnewcliente=0;
                     int idconcierto=0;
                     int zona=0;
                     String fecha="";
                     double preciofinal=0;
                     double precioConcierto=0;
                     double preciozona=0;
                     
                 
                    boolean idExis = false;
                    while (!idExis) {
                        System.out.println("Ingrese la id:");
                        idnewticket=scanner.nextInt();
                        idExis = true;
                        for (Clientes cliente : clientes) {
                            if (cliente.id == idnewticket) {
                                System.out.println("El id ingresado ya existe.");
                                idExis = false;
                                break;  
                            }
                        }
                    }
                    System.out.println("Ingrese la fecha de la compra:"); 
                    scanner.nextLine();
                    fecha=scanner.nextLine();
                  
                    System.out.println("ingrese la id del cliente:");
                    idnewcliente=scanner.nextInt();
                    System.out.println("Ingrese la id del concierto:");
                    idconcierto=scanner.nextInt();
                   
                    System.out.println(":::::::: Menu :::::::");
                    for (zona z :zonas) {
                       
                        StringBuilder ticket = new StringBuilder();
                        ticket.append(z.id + " ").append(z.NombreZona+ " ").append(z.PrecioAdicional);
                       
                        preciozona=z.PrecioAdicional;
                        System.out.println(ticket);
                        
                    }
                    System.out.println("______________________");
                    System.out.println("Ingrese el id de la zona que quiere:"); 
                    zona=scanner.nextInt();
                    if(zona==1){
                        for (Concierto r : conciertos) {
                            
                            if(r.id==idconcierto){
                                precioConcierto=r.PrecioBase;
                            }
                        }
                        preciofinal=precioConcierto+preciozona;
                        Ticket tickecito = new Ticket(idnewticket, idnewcliente, idconcierto, "General",fecha , preciofinal);
                        tickets.add(tickecito);
                    }
                    if(zona==2){
                        for (Concierto r : conciertos) {
                            
                            if(r.id==idconcierto){
                                precioConcierto=r.PrecioBase;
                            }
                        }
                        
                        preciofinal=precioConcierto+preciozona;
                        Ticket tickecito = new Ticket(idnewticket, idnewcliente, idconcierto, "Centro",fecha , preciofinal);
                        tickets.add(tickecito);
                    }
                    if(zona==3){
                        for (Concierto r : conciertos) {

                            if(r.id==idconcierto){
                                precioConcierto=r.PrecioBase;
                            }
                        }
                        preciofinal=precioConcierto+preciozona;
                        Ticket tickecito = new Ticket(idnewticket, idnewcliente, idconcierto, "Lateral_der",fecha , preciofinal);
                        tickets.add(tickecito);

                    }
                    if(zona==4){
                     for (Concierto r : conciertos) {

                            if(r.id==idconcierto){
                                precioConcierto=r.PrecioBase;
                            }
                        }
                        preciofinal=precioConcierto+preciozona;
                        Ticket tickecito = new Ticket(idnewticket, idnewcliente, idconcierto, "Lateral_izq",fecha , preciofinal);
                        tickets.add(tickecito);
                    }
                    if(zona==5){
                        for (Concierto r : conciertos) {

                            if(r.id==idconcierto){
                                precioConcierto=r.PrecioBase;
                            }
                        }
                        preciofinal=precioConcierto+preciozona;
                        Ticket tickecito = new Ticket(idnewticket, idnewcliente, idconcierto, "VIP",fecha , preciofinal);
                        tickets.add(tickecito);
                    }
                     
                     
                     
                break;
                case 4:
                    System.out.println("_______LISTAR TICKETS POR CLIENTE_____");
                    System.out.println("");
                    int idClientecito=0;
                    int guardar=0;
                    System.out.println("Ingrese la id del cliente: ");
                    idClientecito=scanner.nextInt();
                    for(Ticket a :tickets){
                         
                        if(a.ID_Cliente==idClientecito){
                            
                        
                                StringBuilder concatticket = new StringBuilder();
                                concatticket.append("----------------------\n")
                                .append("id: ").append(a.id).append("\n")
                                .append("ID_Cliente: ").append(a.ID_Cliente).append("\n")
                                .append("ID_Concierto: ").append(a.ID_Concierto).append("\n")
                                .append("Zona: ").append(a.Zona).append("\n")
                                .append("FechaCompra: ").append(a.FechaCompra).append("\n")
                                .append("PrecioFinal: ").append(a.PrecioFinal).append("\n");

                                System.out.println(concatticket);
                            
                        }
                    }
                break;
                case 5:
                    System.out.println("_______LISTAR TICKETS POR CONCIERTO_____");
                    System.out.println("");
                    int idCONCIERTICO=0;
                    int contador=0;
                    System.out.println("Ingrese la id del Concierto: ");
                    idCONCIERTICO=scanner.nextInt();
                    for(Ticket b :tickets){
                       
                        if(b.ID_Concierto==idCONCIERTICO){
                              contador=contador+1;
                        
                            StringBuilder concatticket = new StringBuilder();
                            concatticket.append("----------------------\n")
                            .append("id: ").append(b.id).append("\n")
                            .append("ID_Cliente: ").append(b.ID_Cliente).append("\n")
                            .append("ID_Concierto: ").append(b.ID_Concierto).append("\n")
                            .append("Zona: ").append(b.Zona).append("\n")
                            .append("FechaCompra: ").append(b.FechaCompra).append("\n")
                            .append("PrecioFinal: ").append(b.PrecioFinal).append("\n");

                            System.out.println(concatticket);
                            
                            
                        }
                        
                    }
                    System.out.println("El total de tickets vendidos es de  "+contador+"." );
                break;
                case 6:
                    System.out.println("_______CANCELAR TICKET_____");
                    System.out.println("");
                    
                   
                    int idCliente_Ticket=0;
                    int idCon_Ticket=0;
                    
                    System.out.println("Ingrese la id del cliente que desea cacelar su ticket: ");
                    idCliente_Ticket=scanner.nextInt();
                    System.out.println("Ingrese la id del concierto que desea cancelar: ");
                    idCon_Ticket=scanner.nextInt();
                    boolean ticketCancelado = false;

                    for (int i = 0; i < tickets.size(); i++) {
                        Ticket t = tickets.get(i);

                        if (t.ID_Cliente == idCliente_Ticket && t.ID_Concierto == idCon_Ticket) {
                            tickets.remove(i);  
                            ticketCancelado = true;  
                            System.out.println("Su ticket ha sido cancelado correctamente.");
                            break;  
                        }
                    }
                    if (!ticketCancelado) {
                        System.out.println("No se encontró un ticket con las id cliente y concierto agregadas.");
                    }

                    
                    System.out.println("Tickets restantes:");
                    for (Ticket Restantes : tickets) {
                        System.out.println(Restantes);
                    }
                break;
                case 7:
                    System.out.println("Haz abandonado el programa Hasta la proxima :)");
                    booleanito=false;
                    
                break;


            }
        }
        
    }
    
}
