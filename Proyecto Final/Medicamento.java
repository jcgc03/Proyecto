public class Medicamento {

    public String codigo;
    public String nombre;
    public int dosificacion;
    public int existencias;

    public Medicamento(String codigo, String nombre, int dosificacion, int existencias) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dosificacion = dosificacion;
        this.existencias = existencias;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDosificacion() {
        return dosificacion;
    }

    public void setDosificacion(int dosificacion) {
        this.dosificacion = dosificacion;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

}
