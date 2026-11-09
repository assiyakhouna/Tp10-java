package ma.projet;

public class TestTriplet {
    public static void main(String[] args) {

        // Triplet de nombres entiers
        Triplet<Integer> tInt = new Triplet<>(1, 2, 3);
        tInt.affiche();

        // Triplet de chaînes de caractères
        Triplet<String> tStr = new Triplet<>("A", "B", "C");
        tStr.affiche();

        // Utilisation du getter
        System.out.println("Second élément de tInt : "
                + tInt.getSecond());
    }
}

