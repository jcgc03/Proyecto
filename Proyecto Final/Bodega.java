import java.util.Vector;
import java.util.Scanner;

public class Bodega {

    Vector<Medicamento> listaMedicamentos;

    public Bodega() {
        listaMedicamentos = new Vector<Medicamento>();
    }

    void añadirMedicamento(Medicamento medicamento) {
        listaMedicamentos.add(medicamento);
    }

    void listarMedicamento() {
        for (int i = 0; i < listaMedicamentos.size(); i++) {
            Medicamento mediclist = (Medicamento) listaMedicamentos.elementAt(i);
            System.out.print("(" + mediclist.getCodigo() + ")" + " ");
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

}
