import java.util.Date;

public class Paciente extends Persona {
    String codPaciente;
    String numeroSeguridadSocial;

    public Paciente(String nombre, String primerApellido, String segundoApellido, String DNI, Date fechaNacimiento, String codPaciente, String numeroSeguridadSocial) {
        super(nombre, primerApellido, segundoApellido, DNI, fechaNacimiento);
        this.codPaciente = codPaciente;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }


    public String getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "codPaciente='" + codPaciente + '\'' +
                ", numeroSeguridadSocial='" + numeroSeguridadSocial + '\'' +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", DNI='" + DNI + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
