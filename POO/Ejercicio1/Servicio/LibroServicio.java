package POO.Ejercicio1.Servicio;

import POO.Ejercicio1.Entidad.Libro;
import  java.util.Scanner;;

public class LibroServicio {
    Libro lib = new Libro();
    Scanner leer = new Scanner(System.in);
   
    public Libro crearLibro(){
        System.out.println("Ingrese el numero de ISBN del libro");
        lib.setIsbn(leer.nextInt());
        leer.nextLine();

        System.out.println("Ingrese el titulo del libro");
        lib.setTitulo(leer.nextLine());

        System.out.println("Ingrese el autor del libro");
        lib.setAutor(leer.nextLine());

        System.out.println("Ingrese la cantidad de paginas del libro");
        lib.setNumeroPaginas(leer.nextInt());
        leer.nextLine();

        return lib;
    }

    public void mostrarLibro(){
        System.out.println("El libro " + lib.getTitulo() + " del autor " + lib.getAutor() + "tiene " + lib.getNumeroPagina() + " paginas y su numero de ISBN es " + lib.getIsbn());
    }
}
