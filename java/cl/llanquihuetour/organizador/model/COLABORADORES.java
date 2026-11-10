package cl.llanquihuetour.organizador.model;

public class COLABORADORES {
     private String nombre;
     private String rut;
     private String telefono;
     private String direccion;

     public COLABORADORES (String eltonPeréz, String rut, int telefono, DIRECCION d1) {

     }


     public COLABORADORES (String nombre, String rut, String telefono, String direccion) {
         this.nombre = nombre;
         this.rut = rut;
         this.telefono = telefono;
         this.direccion = direccion;
     }

    public COLABORADORES() {
    }

    public String getnombre () {return nombre;}
    public void setnombre (String nombre) { this.nombre = nombre;}

    public String getrut () {return rut;}
    public void setrut(String rut) {this.rut = rut;}

    public String gettelefono(){return telefono;}
    public void settelefono (String telefono) {this.telefono = telefono;}

    public String getdireccion () { return direccion; }
    public void setdireccion (String direccion) {this.direccion = direccion;}

    @Override
    public String toString(){return "Colaborador {Nombre: " + nombre + "\nRut: " + rut + "\nTelefono: " + telefono + "\nDirección: " + direccion;
    }

}



