package ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Usando cada elemento de la enumeración Vestuario
        for (Vestuario prenda : Vestuario.values()) {
            System.out.println("Tipo de prenda: " + prenda.getNombre());
            System.out.println("Descripción: " + prenda.getDescripcion());
            System.out.println("Número de existencias: " + prenda.getNumeroest());
            System.out.println("Descripción detallada: " + prenda.DescripcionPrenda());
            System.out.println("------------------------------");
        }
    }
}

