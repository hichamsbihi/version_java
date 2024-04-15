import java.util.Scanner;

abstract class Geometrie {
    abstract double aire();
}

class TriangleGeo extends Geometrie {
    private double base;
    private double hauteur;

    public TriangleGeo(double base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    public double aire() {
        return base * hauteur / 2;
    }
}

class CercleGeo extends Geometrie {
    private double rayon;

    public CercleGeo(double rayon) {
        this.rayon = rayon;
    }

    public double aire() {
        return Math.PI * rayon * rayon;
    }
}
private static void afficherAire(Geometrie geo) {
    double aire = 0;
    if (geo instanceof TriangleGeo) {
        aire = geo.aire();
    }
    else if (geo instanceof CercleGeo) {
        aire = geo.aire();
    }

    System.out.println("Aire de la forme géométrique : " + aire);
}


    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez les dimensions du triangle :");
        System.out.print("Base : ");
        double base = scanner.nextDouble();
        System.out.print("Hauteur : ");
        double hauteur = scanner.nextDouble();
        TriangleGeo tri = new TriangleGeo(base, hauteur);

        System.out.println("Entrez les dimensions du cercle :");
        System.out.print("Rayon : ");
        double rayon = scanner.nextDouble();
        CercleGeo circ = new CercleGeo(rayon);

        System.out.println("Aire du triangle : " + tri.aire());
        System.out.println("Aire du cercle : " + circ.aire());

        afficherAire(tri);
        afficherAire(circ);
    }




