package cl.llanquihuetour.organizador.model;

public abstract class PROVEDORES {
    private String empresa;
    private String rut;
    private String telefono;
    private DIRECCION direccion;

    public PROVEDORES (){
    }

    public PROVEDORES(String empresa, String rut, String telefono, DIRECCION direccion) {
        this.empresa = empresa;
        this.rut = rut;
        this.telefono = telefono;
        this.direccion = direccion;
    }


    public String getempresa () {return empresa;}
    public void setempresa (String Empresa) {this.empresa = Empresa;}

    public String getrut () {return rut;}
    public void setrut (String Rut) {this.rut = rut;}

    public String gettelefono () {return telefono;}
    public void settelefono (String telefono) {this.telefono = telefono;}

    public DIRECCION getdireccion () {return direccion;}
    public void setdireccion (DIRECCION direccion) {this.direccion = direccion;}

    @Override
    public String toString (){
        return "Proveedor {Empresa: " + empresa + "\nRut: " + rut + "\nTelefono: "
                + telefono + "\nDireccion: " + direccion;
    }

    public abstract String toSting();
}
