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
    public Ordenador (int costeHora,String serial){
        estado = true;
        precioHora = costeHora;
        mac = serial;
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
     * Este metodo nos indica el dinero que se ha introducido
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
     * Este metodo nos da la informacion de lo que nos interesa
     */
    
    public String getdata(){
        String dato ="";
        dato = dato +"MAC "+ mac +" /ON "+ estado +" /Precio "+ precioHora +" /Euros " +dinero;
        return dato;
    }

    /**
     * Este metodo nos permite introducir dinero 
     */
    public void pagar (int intrDinero){
        dinero = ( dinero + intrDinero);
    }

    /**
     * Este metodo permite encender y apagar el ordenador 
     */
    public void encenderApagar(){
        if(estado == true ){
            estado = true;
        }
        else{
            estado = false;
        }
    }

    /**
     * Con este metodo imprimimos la informacion
     */

    public void imprimirInfo(){
        System.out.println("MAC "+mac +"/dinero a�adido  "+ dinero+" euros /El ordenador esta encendido " +estado +"/El precio de la hora "+precioHora+" euros");
    }
}

