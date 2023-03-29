public class Main {
        public static void main(String[] args) {

                Cita cita1 = new Cita("30-MARZO-2023", "3:00 PM", "Urologia", 4, "Clinica de los remedios", "Calle 1B",
                                null,
                                null, null);

                Cita cita2 = new Cita("15-ABRIL-2023", "6:00 PM", "Cardiologia", 4, "Clinica Valle del Lili",
                                "Calle 3B", null,
                                null, null);

                System.out.println("MEDICOS: ");
                Medico newMedico = new Medico("Ramiro", "Perez", "127481948", "137349", "Calle 13", "311612148",
                                "RamiPerez@gmail.com", "Urologo");
                Medico newMedico2 = new Medico("David", "Sterling", "197481944", "231435", "Calle 13-2", "315432216",
                                "DavSteli@gmail.com", "Cardiologo");

                DirectorioMedico directorio1 = new DirectorioMedico();
                directorio1.añadirMedico(newMedico);
                // directorio1.listarMedico();
                directorio1.añadirMedico(newMedico2);
                directorio1.listarMedico();

                System.out.println("PACIENTES: ");

                Paciente newPaciente = new Paciente("Pedro", "Garcia", "1112098876", "12/03/1997", "Calle 1B",
                                "3154323457",
                                "pedritoalimaña@gmail.com");
                Paciente newPaciente2 = new Paciente("Charles", "Gomez", "123409878", "19/11/1970", "Calle 7B",
                                "3205289342",
                                "charlitoGomez@gmail.com");
                DirectorioPaciente directorio2 = new DirectorioPaciente();
                directorio2.añadirPaciente(newPaciente);
                // directorio2.listarPaciente();
                directorio2.añadirPaciente(newPaciente2);
                directorio2.listarPaciente();
                System.out.println("---------------------------------------------------------------");

                cita1.setPaciente(newPaciente);
                cita1.setMedico(newMedico);
                cita1.asignarCita();
                System.out.println("---------------------------------------------------------------");
                cita2.setPaciente(newPaciente2);
                cita2.setMedico(newMedico2);
                cita2.asignarCita();
                System.out.println("---------------------------------------------------------------");
                cita2.cancelarCita();

        }
}