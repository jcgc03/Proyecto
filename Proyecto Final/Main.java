public class Main {
    public static void main(String[] args) {

        Cita cita1 = new Cita(null, null, "General", 1, "Valle del Lili", "Calle 1B");
        Medico medico1 = new Medico("Ramiro", "Perez", "127481948", "137349", "Calle 13", "311612148",
                "RamiPerez@gmail.com", "Urologo");
        medico1.añadirMedico(medico1);
        medico1.listarMedico();

        Paciente paciente1 = new Paciente("Pedro", "Garcia", "1112098876", "12/03/1997", "Calle 1B", "3154323457",
                "pedritoalimaña@gmail.com");
        paciente1.añadirPaciente(paciente1);
        paciente1.listarPaciente();

        Medicamento medicamento1 = new Medicamento("121209", "Acetaminofen", 8, 1000);
        medicamento1.añadirMedicamento(medicamento1);
        medicamento1.listarMedicamento();
        medicamento1.buscarMedicamento();
    }
}