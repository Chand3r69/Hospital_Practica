import java.util.List;

public class Servicio {

    String idServcio;
    String nombre;
    List<Hospital> hospitales;
    int numeroCamas;
    String comentarios;


    public Servicio(String idServcio, String nombre, List<Hospital> hospitales, int numeroCamas, String comentarios) {
        this.idServcio = idServcio;
        this.nombre = nombre;
        this.hospitales = hospitales;
        this.numeroCamas = numeroCamas;
        this.comentarios = comentarios;
    }



}
