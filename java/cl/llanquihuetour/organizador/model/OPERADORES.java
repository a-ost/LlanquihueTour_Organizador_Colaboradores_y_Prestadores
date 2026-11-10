package cl.llanquihuetour.organizador.model;

public class OPERADORES extends COLABORADORES{
    private String Servicio;
    private String Tarifaporpersona;
    private String Direccion;

    public OPERADORES (){

    }

    public OPERADORES( String Nombre, String Rut, String Telefono, String Dirección, String Area){
        setnombre(Nombre);
        setrut(Rut);
        settelefono(Telefono);
        setdireccion(Direccion);
        this.Servicio = Servicio;
        this.Tarifaporpersona = Tarifaporpersona;

    }

    public String getServicio (){ return Servicio; }
    public void setServicio (String Servicio) { this.Servicio = Servicio; }

    public String getTarifaporpersona () {return Tarifaporpersona;}
    public void  setTarifaporpersona (String Tarifaporpersona) {this.Tarifaporpersona = Tarifaporpersona; }

    @Override
    public String toString () {
        return "Operador{Nombre: " + getnombre() + "\nRut: " + getrut() + "\nTelefono: " + gettelefono() +
                "\nDirección: " + getdireccion() + "\nServicio: " + Servicio + "\nTarifa por persona: $" + Tarifaporpersona
                + "}";

    }

}
