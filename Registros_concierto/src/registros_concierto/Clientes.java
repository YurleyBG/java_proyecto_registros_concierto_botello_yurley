
package registros_concierto;


public class Clientes {
    int id=0;
    String Nombre="";
    String Apellido="";
    String Correo="";
    int Telefono=0;

    public Clientes(int id, String Nombre, String Apellido, String Correo, int Telefono ) {
        this.id=id;
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.Correo=Correo;
        this.Telefono=Telefono;
    }

    @Override
    public String toString() {
        
        StringBuilder concatcliente = new StringBuilder();
        concatcliente.append("----------------------\n")
        .append("id: ").append(id).append("\n")
        .append("Nombre: ").append(Nombre).append("\n")
        .append("Apellido: ").append(Apellido).append("\n")
        .append("Correo: ").append(Correo).append("\n")
        .append("Telefono: ").append(Telefono).append("\n");

         return concatcliente.toString();
        
    }
    public static class Concierto{
        int id=0;
        String Nombre="";
        String Artista="";
        String Fecha="";
        String Lugar="";
        double PrecioBase=0;

        public Concierto(int id,String Nombre, String Artista, String Fecha, String Lugar, double PrecioBase ) {
            
            this.id=id;
            this.Nombre=Nombre;
            this.Artista=Artista;
            this.Fecha=Fecha;
            this.Lugar=Lugar;
            this.PrecioBase=PrecioBase;
        }

        @Override
        public String toString() {
            return "Concierto{" + "id=" + id + ", Nombre=" + Nombre + ", Artista=" + Artista + ", Fecha=" + Fecha + ", Lugar=" + Lugar + ", PrecioBase=" + PrecioBase + '}';
        }
      
    }
    public static class Ticket {
        int id=0;
        int ID_Cliente=0;
        int ID_Concierto=0;
        String Zona="";
        String FechaCompra="";
        double PrecioFinal=0;

        public Ticket(int id,int ID_Cliente, int ID_Concierto, String Zona, String FechaCompra,double PrecioFinal ) {
            
            this.id=id;
            this.ID_Cliente=ID_Cliente;
            this.ID_Concierto=ID_Concierto;
            this.Zona=Zona;
            this.FechaCompra=FechaCompra;
            this.PrecioFinal=PrecioFinal;
        }

        @Override
        public String toString() {
            StringBuilder concatticket = new StringBuilder();
            concatticket.append("----------------------\n")
            .append("id: ").append(id).append("\n")
            .append("ID_Cliente: ").append(ID_Cliente).append("\n")
            .append("ID_Concierto: ").append(ID_Concierto).append("\n")
            .append("Zona: ").append(Zona).append("\n")
            .append("FechaCompra: ").append(FechaCompra).append("\n")
            .append("PrecioFinal: ").append(PrecioFinal).append("\n");
            
            return concatticket.toString();
        }

    }
    public static class zona {
        int id=0;
        String NombreZona="";
        int Capacidad=0;
        double PrecioAdicional=0;

        public zona(int id, String NombreZona, int Capacidad,double PrecioAdicional ) {
            
            this.id=id;
            this.NombreZona=NombreZona;
            this.Capacidad=Capacidad;
            this.PrecioAdicional=PrecioAdicional;
            
        }
        @Override
        public String toString() {
            return "zona{" + "id=" + id + ", NombreZona=" + NombreZona + ", Capacidad=" + Capacidad + ", PrecioAdicional=" + PrecioAdicional + '}';
        }
        

    }
    
    
}
