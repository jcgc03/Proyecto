import java.util.Vector;

public class Medico {

    public String nombre;
    public String apellido;
    public String identiicacion;
    public String tarjetaProfesional;
    public String direccion;
    public String telefono;
    public String correo;
    public String nombreEspecialidad;
    Vector listaMedicos;

    public Medico(String nombre, String apellido, String identiicacion, String tarjetaProfesional, String direccion,
            String telefono, String correo, String nombreEspecialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identiicacion = identiicacion;
        this.tarjetaProfesional = tarjetaProfesional;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.nombreEspecialidad = nombreEspecialidad;
        listaMedicos = new Vector();
    }

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

    public String getIdentiicacion() {
        return identiicacion;
    }

    public void setIdentiicacion(String identiicacion) {
        this.identiicacion = identiicacion;
    }

    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(String tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
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

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    void añadirMedico(Medico medico) {
        listaMedicos.add(medico);
    }

    void listarMedico() {
        for (int i = 0; i < listaMedicos.size(); i++) {
            Medico medlist = (Medico) listaMedicos.elementAt(i);
            System.out.println(medlist.getNombre());
        }
    }

    public String crearMedico() {

    }

    public String actualizarMedico() {

    }

    public String eliminarMedico() {

    }

    public String atenderCita() {

    }
}
