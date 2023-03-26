import java.sql.Date;
import java.sql.Time;

public class Cita {

    Date fecha = new Date(2023, 5, 3);
    public Time hora;
    public String tipoCita;
    public int consultorio;
    public String nombreClinica;
    public String direccionClinica;
    public String diagnosticoFinal;

    public Cita(Date fecha, Time hora, String tipoCita, int consultorio, String nombreClinica, String direccionClinica,
            String diagnosticoFinal) {
        this.fecha = fecha;
        this.hora = hora;
        this.tipoCita = tipoCita;
        this.consultorio = consultorio;
        this.nombreClinica = nombreClinica;
        this.direccionClinica = direccionClinica;
        this.diagnosticoFinal = diagnosticoFinal;
    }

    public Cita(Date fecha, Time hora, String tipoCita, int consultorio, String nombreClinica,
            String direccionClinica) {
        this.fecha = fecha;
        this.hora = hora;
        this.tipoCita = tipoCita;
        this.consultorio = consultorio;
        this.nombreClinica = nombreClinica;
        this.direccionClinica = direccionClinica;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }

    public int getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(int consultorio) {
        this.consultorio = consultorio;
    }

    public String getNombreClinica() {
        return nombreClinica;
    }

    public void setNombreClinica(String nombreClinica) {
        this.nombreClinica = nombreClinica;
    }

    public String getDireccionClinica() {
        return direccionClinica;
    }

    public void setDireccionClinica(String direccionClinica) {
        this.direccionClinica = direccionClinica;
    }

    public String getDiagnosticoFinal() {
        return diagnosticoFinal;
    }

    public void setDiagnosticoFinal(String diagnosticoFinal) {
        this.diagnosticoFinal = diagnosticoFinal;
    }

    public String asignarCita(Date fecha, Time hora, String tipoCita, String consultorio, String nombreClinica,
            String direccionClinica) {
        return "Para el dia " + fecha + " a las " + hora + " se le asigna una cita de tipo " + tipoCita
                + " en el consultorio " + consultorio + " en la clinica " + nombreClinica + " con la direccion "
                + direccionClinica;
    }

    // public String actualizarCita(){

    // }
    // public String cancelarCita(){

    // }
    // public String diagnosticar(){

    // }
}
