import java.util.Vector;
import java.util.Scanner;

public class Medicamento {

    public String codigo;
    public String nombre;
    public int dosificacion;
    public int existencias;
    Vector listaMedicamentos;

    public Medicamento(String codigo, String nombre, int dosificacion, int existencias) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dosificacion = dosificacion;
        this.existencias = existencias;
        listaMedicamentos = new Vector();
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

    void añadirMedicamento(Medicamento medicamento) {
        listaMedicamentos.add(medicamento);
    }

    void listarMedicamento() {
        for (int i = 0; i < listaMedicamentos.size(); i++) {
            Medicamento mediclist = (Medicamento) listaMedicamentos.elementAt(i);
            System.out.println("MEDICAMENTOS: ");
            System.out.println(mediclist.getNombre());
        }
    }

    void buscarMedicamento() {
        Scanner sc = new Scanner(System.in);
        String codigoMedicamento = sc.next();
        for (int i = 0; i < listaMedicamentos.size(); i++) {
            Medicamento mediclist = (Medicamento) listaMedicamentos.elementAt(i);
            if (mediclist.getCodigo().equals(codigoMedicamento)) {
                System.out.println("Hay " + mediclist.getExistencias() + " existencias de este medicamento en Stock");
            }
        }
    }

    public String actualizarMedicamento() {
        return "hola";

    }

    public String eliminarMedicamento() {
        return "hola";

    }

    public String consultarStock(int codigo, String nombre, int existencias) {
        return "hola";

    }
}
