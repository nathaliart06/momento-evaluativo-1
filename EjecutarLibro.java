public class EjecutarLibro {
    public static void Main(String[] args){

        Libro libro1= new Libro("el alquimista", "paulo coelo"null, "12345", "400")
        Libro libro2= new Libro("el alquimista", "paulo coelo"null, "12345", "400)

        System.out.println(libro1.titulo + "disponible" + libro1.estaDisponible());
        System.out.println(libro2.titulo + "disponible" + libro2.estaDisponible());

        libro1.prestar();
        libro1.prestar();

        System.out.println("Sigue" + libro2.titulo + "disponible" + libro2.estaDisponible);
        System.out.println(" --Devoluciones --");
        
        libro1.devolver();
        System.out.println("Estado del " + libro1.titulo + ":" + libro1.estaDisponible);
    }

}
