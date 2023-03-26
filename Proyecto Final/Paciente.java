import java.sql.Date;

public class Paciente {

    public String nombre;
    public String apellido;
    public String identificacion;
    public Date fechaNacimiento;
    public String direccion;
    public String telefono;
    public String correo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    void añadirMedico(Medico medico) {
        listaMedicos.add(medico);
    }

    void listarMedico() {
        for (int i = 0; i < listaMedicos.size(); i++)
            ;
        {
            Medico medlist = (Medico) listaMedicos.elementAt(i);
            System.out.println(medlist.getNombre());
        }
    }

    public String añadirPaciente() {

    }

    public String actualizarPaciente() {

    }

    public String eliminarPaciente() {

    }

    public String pedirCita() {

    }

    public String cancelarCita() {

    }

    public String reclamarMedicamento() {

    }

}
