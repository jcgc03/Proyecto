import java.util.Vector;

public class Paciente {

    public String nombre;
    public String apellido;
    public String identificacion;
    public String fechaNacimiento;
    public String direccion;
    public String telefono;
    public String correo;
    Vector listaPacientes;

    public Paciente(String nombre, String apellido, String identificacion, String fechaNacimiento, String direccion,
            String telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        listaPacientes = new Vector();
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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
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

    void añadirPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }

    void listarPaciente() {
        for (int i = 0; i < listaPacientes.size(); i++) {
            Paciente paclist = (Paciente) listaPacientes.elementAt(i);

            System.out.print(paclist.getNombre() + " ");
            System.out.print(paclist.getApellido());
            System.out.println(" ");
        }
    }
}
