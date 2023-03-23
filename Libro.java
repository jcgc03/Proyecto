package Proyecto;

    public class Libro {
        public String titulo; 
        public String autor;
        public int añoPublicacion;
        public String editorial;
        public String referenciaBibliografica;
    
    public Libro(String titulo, String autor, int añoPublicacion, String editorial, String referenciaBibliografica) {
            this.titulo = titulo;
            this.autor = autor;
            this.añoPublicacion = añoPublicacion;
            this.editorial = editorial;
            this.referenciaBibliografica = referenciaBibliografica;
    }
    
    public void imprimir(){
        System.out.println("TITULO = " + titulo);
        System.out.println("AUTOR = "+ autor);
        System.out.println("AÑO DE PUBLICACIÓN = "+  añoPublicacion);
        System.out.println("EDITORIAL = "+ editorial);
        System.out.println("REFERENCIA BIBLIOGRAFICA = "+referenciaBibliografica);
    }
    
        
    }

