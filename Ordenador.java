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
            System.out.println("Ha pagado usted" + horas +"horas");  
        }
    }
}

