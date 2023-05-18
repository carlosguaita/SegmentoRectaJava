import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static int numeroPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nùmero de puntos que desa ingresar: ");
        int numPuntos = sc.nextInt();
        return numPuntos;
    }

    public static List<Punto> ingresarPuntos(int numPuntos){
        Scanner sc = new Scanner(System.in);
        List<Punto> listaPuntos = new ArrayList<>();
        for (int i=0; i<numPuntos;i++){
            System.out.println("Ingrese la componente X del punto "+i);
            double x=sc.nextDouble();
            System.out.println("Ingrese la componente Y del punto "+i);
            double y=sc.nextDouble();
            listaPuntos.add(new Punto(x,y));
        }
        return listaPuntos;
    }

    public static List<Double> calcularDistancias(List<Punto> listaPuntos){
        List<Double> distancias =  new ArrayList<>();
        for(int i =0; i<listaPuntos.size()-1;i++){
            for(int j=i+1;j<listaPuntos.size();j++){
                Punto punto1 = listaPuntos.get(i);
                Punto punto2 = listaPuntos.get(j);
                double distancia = punto1.calcularDistancia(punto2);
                System.out.println("d1: "+distancia);
                distancias.add(distancia);
            }
        }
        return distancias;
    }

    public static double obtenerMayor(List<Double> listaDistancias){
        double mayor=0;
        for(int i=0; i<listaDistancias.size();i++){
            if (i==0){
                mayor=listaDistancias.get(i);
            } else if (listaDistancias.get(i)>=mayor) {
                mayor=listaDistancias.get(i);
            }
        }
        return mayor;
    }

    public static double obtenerMayor2(List<Double> listaDistancias){
        double mayor = listaDistancias.stream()
                .mapToDouble(x->x)
                .max()
                .orElseThrow(NoSuchElementException::new);
        return mayor;
    }

    public static double obtenerMenor(List<Double> listaDistancias){
        double mayor=0;
        for(int i=0; i<listaDistancias.size();i++){
            if (i==0){
                mayor=listaDistancias.get(i);
            } else if (listaDistancias.get(i)<=mayor) {
                mayor=listaDistancias.get(i);
            }
        }
        return mayor;
    }

    public static double obtenerMenor2(List<Double> listaDistancias){
        double mayor = listaDistancias.stream()
                .mapToDouble(x->x)
                .min()
                .orElseThrow(NoSuchElementException::new);
        return mayor;
    }

    public double calcularDistancia(Punto punto2){
        double d = Math.sqrt(Math.pow(this.x-punto2.getX(),2)+Math.pow(this.y-punto2.getY(),2));
        return d;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
