package cl.llanquihuetour.organizador.model;

public class DIRECCION {
    private String calle;
    private int numero;
    private String comuna;


    public DIRECCION(String calle, String comuna, int numero) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;

    }


    public String getcalle() {
        return calle;
    }

    public void setcalle(String calle) {
        this.calle = calle;
    }


    public int getnumero() {
        return numero;
    }

    public void setnumero(int numero) {
        this.numero = numero;
    }
    public String getcomuna() {
        return comuna;
    }

    public void setcomuna(String comuna) {
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return calle + "" + numero + ", " + comuna;
    }

}