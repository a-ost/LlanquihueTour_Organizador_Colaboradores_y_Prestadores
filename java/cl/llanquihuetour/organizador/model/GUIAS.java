package cl.llanquihuetour.organizador.model;

public class GUIAS extends COLABORADORES {
    private String DIRECCION;
    private String idiomas;
    private String sector;

    public GUIAS(String Nombre, String rut, String Telefono, DIRECCION Direccion, String Idiomas, String Sector) {

        setnombre(Nombre);
        setrut(rut);
        settelefono(Telefono);
        setdireccion(String.valueOf(Direccion));
        this.idiomas = Idiomas;
        this.sector = Sector;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String Idiomas) {
        this.idiomas = Idiomas;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String Area) {
        this.sector = Area;
    }

    @Override
    public String toString() {
        return "Guía { Nombre: " + getnombre() + "\nRut: " + getrut() + "\nTelefono: " + gettelefono()
                + "\nDirección: " + DIRECCION + "\nIdiomas: " + idiomas + "\nSectores: " + sector
                + "}";

    }

}
