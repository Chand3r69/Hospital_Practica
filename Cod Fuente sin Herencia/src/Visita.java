import java.util.Date;

public class Visita {

    String codVisita;
    Date fechaHora;
    Hospital hospital;
    Servicio servicio;
    Medico medico;
    String diagnostico;
    String tratamientos;
    int numeroCama;
    Date fechaSalida;
    Historial historial;




    public Visita(String codVisita, Date fechaHora, Hospital hospital, Servicio servicio, Medico medico, String diagnostico, String tratamientos, int numeroCama, Date fechaSalida, Historial historial) {
        this.codVisita = codVisita;
        this.fechaHora = fechaHora;
        this.hospital = hospital;
        this.servicio = servicio;
        this.medico = medico;
        this.diagnostico = diagnostico;
        this.tratamientos = tratamientos;
        this.numeroCama = numeroCama;
        this.fechaSalida = fechaSalida;
        this.historial = historial;
    }


}
