public class Ordenador {
    //La MAC del ordenador
    private String mac;
    //El dinero que el cliente ha pagado
    private int dinero;
    //Para saber si el ordenador esta encencido o apagado
    private boolean estado;
    //precio que cuesta la hora
    private int precioHora;
    //El numero de ordenador 
    private int numeroOrdenador;

    /**
     * Aqui es donde creamos el ordenador 
     */
    public Ordenador (boolean encendido,int costeHora,int nOrdenador){
        estado = encendido;
        precioHora = costeHora;
        numeroOrdenador = nOrdenador;
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
     * Este metodo nos indica el dinero que se ha añadido 
     */
    public int getdinero(){
        return dinero;
    }

    /**
     * Este metodo nos devuelve el estado del ordenador ON/OFF
     */
    public boolean getestado(){
        return estado;
    }

    /**
     * Este metodo nos devuelve a cuanto esta la hora
     */
    public int getprecioHora(){
        return precioHora;
    }

    /**
     * Este metodo muestra el numero de ordenador 
     */
    public int getnumeroOrdenador(){
        return numeroOrdenador;
    }

    /**
     * Este metodo nos da la informacion de los 3 atributos String int boolean.
     */
    
    public String getdata(){
        String dato ="";
        dato = dato +"MAC "+ mac +" /num "+numeroOrdenador +" /ON "+ estado +" /Precio "+ precioHora +" /Euros " +dinero;
        return dato;
    }

    /**
     * Este metodo nos permite añadir dinero 
     */
    public void pagar (int añadirDinero){
        dinero = ( dinero + añadirDinero);
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
            System.out.println("con numero" + numeroOrdenador);
            System.out.println("Ha pagado usted" + horas +"horas");  
        }
    }

    public void imprimirInfo(){
        System.out.println("MAC "+mac +"/numero"+numeroOrdenador +"/dinero añadido  "+ dinero+" euros /El ordenador esta encendido " +estado +"/El precio de la hora "+precioHora+" euros");
    }
}

