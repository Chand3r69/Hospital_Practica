import java.util.Date;
import java.util.List;

public class Medico extends Persona {
    String codMedico;
    List<Servicio> servicios;
    Hospital hospital;

    public Medico(String nombre, String primerApellido, String segundoApellido, String DNI, Date fechaNacimiento, String codMedico, List<Servicio> servicios, Hospital hospital) {
        super(nombre, primerApellido, segundoApellido, DNI, fechaNacimiento);
        this.codMedico = codMedico;
        this.servicios = servicios;
        this.hospital = hospital;
    }

    public String getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "codMedico='" + codMedico + '\'' +
                ", servicios=" + servicios +
                ", hospital=" + hospital +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", DNI='" + DNI + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
