import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //int numPuntos = Punto.numeroPuntos();
        //List<Punto> listaPuntos = Punto.ingresarPuntos(numPuntos);
        List<Double> listaDistancias = Punto.calcularDistancias(Util.listaPuntos);
        double mayor = Punto.obtenerMayor(listaDistancias);
        double mayor2 = Punto.obtenerMayor2(listaDistancias);
        double menor = Punto.obtenerMenor(listaDistancias);
        double menor2 = Punto.obtenerMenor2(listaDistancias);
        System.out.println("La distancia mayor es: "+mayor);
        System.out.println("La distancia mayor2 es: "+mayor2);
        System.out.println("La distancia menor es: "+menor);
        System.out.println("La distancia menor2 es: "+menor2);

    }
}