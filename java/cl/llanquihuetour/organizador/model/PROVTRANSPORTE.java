package cl.llanquihuetour.organizador.model;

public class PROVTRANSPORTE extends PROVEDORES {
    private String tipoDeVehiculo;
    private int capacidadPasajeros;
    private int tarifaPorPasajero;

    public PROVTRANSPORTE(String empresa, String rut, String telefono, DIRECCION direccion, String
            tipoDeVehiculo, int capacidadPasajeros, int tarifaPorPasajero) {
        this.tipoDeVehiculo = tipoDeVehiculo;
        this.capacidadPasajeros = capacidadPasajeros;
        this.tarifaPorPasajero = tarifaPorPasajero;
        setdireccion(direccion);
        setempresa(empresa);
        setrut(rut);
        settelefono(telefono);
    }

    public String getTipoDeVehiculo () {return tipoDeVehiculo; }
    public void setTipoDeVehiculo (String tipoDeVehiculo) {this.tipoDeVehiculo = tipoDeVehiculo; }

    public int getCapacidadPasajeros () {return capacidadPasajeros;}
    public void setCapacidadPasajeros (int capacidadPasajeros) {this.capacidadPasajeros = capacidadPasajeros;}

    public int getTarifaPorPasajero () {return tarifaPorPasajero;}
    public void setTarifaPorPasajero (int tarifaPorPasajero) {this.tarifaPorPasajero = tarifaPorPasajero;}

@Override
public String toSting () {
        return "Proveedor Transporte{Empresa: " + getempresa() + "\nRut: " + getrut() + "\nTelefono: " + gettelefono()
                + "\nDirección: " + "Tipo de vehiculo" + tipoDeVehiculo + "\nCapacidad de pasajero: " + capacidadPasajeros
                + "\nTarifa por pasajero: " + tarifaPorPasajero + "}";

}



























}
