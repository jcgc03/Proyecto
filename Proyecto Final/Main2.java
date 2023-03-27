public class Main2 {
    public static void main(String[] args) {
        System.out.println("MEDICAMENTOS:");

        Medicamento medicamento1 = new Medicamento("01", "Acetaminofen", 8, 1000);
        medicamento1.añadirMedicamento(medicamento1);

        Medicamento medicamento2 = new Medicamento("02", "Ibuprofeno", 12, 700);
        medicamento1.añadirMedicamento(medicamento2);

        Medicamento medicamento3 = new Medicamento("03", "Aspirina", 24, 2000);
        medicamento1.añadirMedicamento(medicamento3);

        medicamento1.listarMedicamento();

        System.out.print("Ingrese el codigo del medicamento que desea buscar: ");
        medicamento1.buscarMedicamento();
    }
}
