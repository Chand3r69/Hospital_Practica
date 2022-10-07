import java.util.List;

public class Main {
    public static void main (String[] args ){
        Servicio Serv2 = new Servicio();
        Ciudad Ciudad2 = new Ciudad("04","Cbba");
        Hospital HospitalG = new Hospital( "8874","Hospital General",Ciudad2,88774, (List<Servicio>) Serv2,"Gregorio");
        Servicio S = new Servicio ("115","ServGeneral", (List<Hospital>) HospitalG,156,"Emergencia");
        Visita Visita1 = new Visita();


    }
}
