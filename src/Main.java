import java.util.Scanner;

sealed interface Forme {
    double aire();
}

record Triangle(double base, double hauteur) implements Forme {
    public double aire() {
        return base * hauteur / 2;
    }
}

record Cercle(double rayon) implements Forme {
    public double aire() {
        return Math.PI * rayon * rayon;
    }
}
private static void afficherAire(Forme forme) {
    double aire = switch (forme) {
        case Triangle t -> t.aire();
        case Cercle c -> c.aire();
        default -> 0;
    };

    System.out.println("Aire de la forme géométrique : " + aire);
}



    public void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez les dimensions du triangle :");
        System.out.print("Base : ");
        double base = scanner.nextDouble();
        System.out.print("Hauteur : ");
        double hauteur = scanner.nextDouble();
        Triangle tri = new Triangle(base, hauteur);

        System.out.println("Entrez les dimensions du cercle :");
        System.out.print("Rayon : ");
        double rayon = scanner.nextDouble();
        Cercle circ = new Cercle(rayon);

        System.out.println(STR."Aire du triangle : \{tri.aire()}");
        System.out.println(STR."Aire du cercle : \{circ.aire()}");

        afficherAire(tri);
        afficherAire(circ);
    }




