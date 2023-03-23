package Proyecto;

import java.util.Vector;

public class Biblioteca {
    public String nombre;
    Vector coleccionLibros;
   
public Biblioteca(String nombre) {
        this.nombre = nombre;
        coleccionLibros = new Vector();

}
public void añadirLibro(Libro libro) {
    coleccionLibros.add(libro); 
     }

    public void listarLibros() {
        for (int i = 0; i < coleccionLibros.size(); i++) {
            Libro libro = (Libro) coleccionLibros.elementAt(i); 
        libro.imprimir();
        System.out.println("-----------------------------------------");
        }
        }

        
}


