import java.sql.Date;
import java.sql.Time;

public class Cita {

    public String fecha;
    public String hora;
    public String tipoCita;
    public int consultorio;
    public String nombreClinica;
    public String direccionClinica;
    public String diagnosticoFinal;
    public Paciente paciente;
    public Medico medico;
    public Medicamento medicamento;

    public Cita(String fecha, String hora, String tipoCita, int consultorio, String nombreClinica,
            String direccionClinica,
            String diagnosticoFinal) {
        this.fecha = fecha;
        this.hora = hora;
        this.tipoCita = tipoCita;
        this.consultorio = consultorio;
        this.nombreClinica = nombreClinica;
        this.direccionClinica = direccionClinica;
        this.diagnosticoFinal = diagnosticoFinal;
    }

    public Cita(String fecha, String hora, String tipoCita, int consultorio, String nombreClinica,
            String direccionClinica, Paciente paciente, Medico medico, Medicamento medicamento) {
        this.fecha = fecha;
        this.hora = hora;
        this.tipoCita = tipoCita;
        this.consultorio = consultorio;
        this.nombreClinica = nombreClinica;
        this.direccionClinica = direccionClinica;
        paciente = new Paciente(nombreClinica, direccionClinica, direccionClinica, tipoCita, direccionClinica,
                nombreClinica, direccionClinica);
        medico = new Medico(nombreClinica, direccionClinica, direccionClinica, direccionClinica, direccionClinica,
                tipoCita, nombreClinica, direccionClinica);
        medicamento = new Medicamento(direccionClinica, nombreClinica, consultorio, consultorio);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente newPaciente) {
        this.paciente = newPaciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico newMedico) {
        this.medico = newMedico;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento newMedicamento) {
        this.medicamento = newMedicamento;
    }

    // public String asignarCita(String fecha, String hora, String tipoCita, String
    // consultorio, String nombreClinica,
    // String direccionClinica) {
    // return "Para el dia " + fecha + " a las " + hora + " se le asigna una cita de
    // tipo " + tipoCita
    // + " en el consultorio " + consultorio + " en la clinica " + nombreClinica + "
    // con la direccion "
    // + direccionClinica;
    // }

    public void asignarCita() {
        System.out.println(String.format(
                "Señor(a) %s %s su cita quedó programada para el dia %s, a la hora %s, cita de tipo: %s, en el consultorio %s, en la clinica %s, con direccion %s, con el doctor %s %s",
                paciente.getNombre(), paciente.getApellido(), getFecha(), getHora(), getTipoCita(), getConsultorio(),
                getNombreClinica(), getDireccionClinica(),
                medico.getNombre(), medico.getApellido()));
    }

    public void cancelarCita() {
        System.out.println(String.format(
                "Señor(a) %s %s su cita del dia %s, a la hora %s, cita de tipo: %s, en el consultorio %s, en la clinica %s, con direccion %s, con el doctor %s %s fue CANCELADA",
                paciente.getNombre(), paciente.getApellido(), getFecha(), getHora(), getTipoCita(), getConsultorio(),
                getNombreClinica(), getDireccionClinica(),
                medico.getNombre(), medico.getApellido()));
    }

}
