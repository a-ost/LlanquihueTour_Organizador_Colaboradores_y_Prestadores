package cl.llanquihuetour.organizador.model;

public class PROVALOJAMIENTO extends PROVEDORES {
   private String tipoAlojamiento;
   private int capacidad;
   private int precioNoche;

   public PROVALOJAMIENTO (String empresa, String rut, String Telefono, DIRECCION direccion, String tipoAlojamiento, int capacidad, int precioNoche) {
       this.tipoAlojamiento = tipoAlojamiento;
       this.capacidad = capacidad;
       this.precioNoche = precioNoche;
       setrut(rut);
       setempresa(empresa);
       String telefono = "";
       settelefono(telefono);
       setdireccion(direccion);

   }

   public String getTipoAlojamiento () {return tipoAlojamiento;}
    public void setTipoAlojamiento (String tipoAlojamiento) {this.tipoAlojamiento = tipoAlojamiento;}

    public int getCapacidad () {return capacidad;}
    public void setCapacidad (int capacidad) {this.capacidad = capacidad;}

    public int getPrecioNoche () {return precioNoche;}
    public void setPrecioNoche (int precioNoche) {this.precioNoche = precioNoche;}

    @Override
    public String toString() {
       return "Proveedor Alojamiento{ Empresa: " + getempresa() + "\nRut: " + getrut() +
               "\nTelefono: " + gettelefono() + "\nDirección: " + getdireccion() + "\nTipo de alojamiento" + tipoAlojamiento
               + "\nCapacidad: " + capacidad + "\nPrecio por noche: " + precioNoche + "}";


    }

    @Override
    public String toSting() {
        return "";
    }


}

