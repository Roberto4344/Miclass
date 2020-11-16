public class Ordenador {
    //La MAC del ordenador
    private String mac;
    //El dinero que el cliente ha pagado
    private int dinero;
    //Para saber si el ordenador esta encencido o apagado
    private boolean estado;
    //precio que cuesta la hora
    private int precioHora;

    /**
     * Aqui es donde creamos el ordenador 
     */
    public Ordenador (boolean encendido,int coste){
        estado = encendido;
        precioHora = coste;
    }

    /**
     * Este metodo nos permite fijar la mac
     */
    public void setmac(String newmac){
        this.mac = newmac;
    }

    /**
     * Este metodo nos muestra la mac del ordenador 
     */
    public String getMac(){
        return mac;
    }

    /**
     * Este metodo nos permite a�adir dinero 
     */
    public void pagar (int a�adirDinero){
        dinero = ( dinero + a�adirDinero);
    }

    /**
     * Este metodo permite encender y apagar el ordenador 
     */
    public boolean encenderApagar(){
        if(estado == false ){
            estado = true;
            return estado;
        }
        else{
            estado = false;
            return estado;
        }
    }

    /**
     * Este metodo sirve para confirmar el pago 
     */
    public void confirmarPago (){
        int horas;
        horas = (precioHora / dinero );
        if(estado == false){
            System.out.println("El ordenador esta apagado le devolvemos"+ dinero + "euros");
            dinero = 0;
        }
        else{
            System.out.println("El ordenador"+ mac);
            System.out.println("Ha pagado usted" + horas +"horas");  
        }
    }
        public void imprimirInfo(){
            System.out.println("MAC "+mac);
            System.out.println("dinero a�adido  "+ dinero+" euros");
            System.out.println("El ordenador esta encendido " +estado);
            System.out.println("El precio de la hora "+precioHora+" euros");
    }
}

