import java.util.Vector;

public class DirectorioMedico {

    Vector<Medico> listaMedicos;

    public DirectorioMedico() {

        listaMedicos = new Vector<Medico>();
    }

    void añadirMedico(Medico medico) {
        listaMedicos.add(medico);
    }

    void listarMedico() {

        for (int i = 0; i < listaMedicos.size(); i++) {
            Medico medlist = (Medico) listaMedicos.elementAt(i);
            System.out.print(medlist.getNombre() + " ");
            System.out.print(medlist.getApellido() + " ");
            System.out.println(" ");
        }
    }

}
