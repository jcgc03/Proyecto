package Proyecto;

public class Main {
    public static void main(String args[]) {  
        Biblioteca biblioteca1 = new Biblioteca("Biblioteca Nacional");
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "Sudamericana", "858.67/M566");
        biblioteca1.añadirLibro(libro1);
        Libro libro2 = new Libro("Rayuela", "Julio Cortázar", 1963, "Sudamericana", "863.55/J667");
        biblioteca1.añadirLibro(libro2);
        Libro libro3 = new Libro("La tia Julia y el escribidor", "Mario Vargas Llosa", 1977, "Seix Barral", "868.23/L567");
        biblioteca1.añadirLibro(libro3);
        biblioteca1.listarLibros();
        
 }
}

