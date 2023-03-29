import java.util.Vector;

public class DirectorioPaciente {

    Vector<Paciente> listaPacientes;

    public DirectorioPaciente() {

        listaPacientes = new Vector<Paciente>();
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
