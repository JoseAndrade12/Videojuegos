public class Main {

    public static void main(String[] args) {

        Videojuego videojuego1 = new Videojuego();
        Videojuego videojuego2 = new Videojuego();
        Videojuego videojuego3 = new Videojuego();

        videojuego1.nombre = "Minecraft";
        videojuego1.genero = "Supervivencia";
        videojuego1.version = "1.21";
        videojuego1.activo = false;

        videojuego2.nombre = "FIFA 26";
        videojuego2.genero = "Deportes";
        videojuego2.version = "26.0";
        videojuego2.activo = false;

        videojuego3.nombre = "Valorant";
        videojuego3.genero = "Disparos";
        videojuego3.version = "10.05";
        videojuego3.activo = false;

        System.out.println("VIDEOJUEGO 1");
        videojuego1.mostrarInformacion();

        System.out.println("\n VIDEOJUEGO 2 ");
        videojuego2.mostrarInformacion();

        System.out.println("\nVIDEOJUEGO 3");
        videojuego3.mostrarInformacion();

        System.out.println("\n PRUEBA ");

        videojuego1.iniciar();

        System.out.println("\nEstado de los videojuegos:");
        videojuego1.mostrarInformacion();
        videojuego2.mostrarInformacion();
        videojuego3.mostrarInformacion();

        videojuego1.cerrar();

        System.out.println("\nVersión del videojuego 2:");
        videojuego2.mostrarVersion();
    }
}