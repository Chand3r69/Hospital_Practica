import java.util.List;

public class Hospital {
    String codHospital;
    String nombre;
    Ciudad ciudad;
    int telefono;
    List<Servicio> servicios;
    Medico director;


    public Hospital(String codHospital, String nombre, Ciudad ciudad, int telefono, List<Servicio> servicios, Medico director) {
        this.codHospital = codHospital;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.servicios = servicios;
        this.director = director;
    }
}
