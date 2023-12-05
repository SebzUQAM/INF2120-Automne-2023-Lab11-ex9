import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class Livre implements Comparable<Livre> {
    private static Integer lastId = -1;
    private Integer id;

    private String titre;
    private String isbn;
    private Double prix;

    public Livre(String titre, String isbn, Double prix) {
        this.titre = titre;
        this.isbn = isbn;
        this.prix = prix;
        id = ++lastId;
    }

    public static ArrayList<Livre> listStart() {
        String isbn;
        ArrayList<Livre> list = new ArrayList<>(nomsLivres.length);
        for (String nom : nomsLivres){
            Optional<Livre> oLivre = list.stream().filter((livre) -> { return livre.titre.compareTo(nom) == 0; }).findFirst();
            if(oLivre.isPresent()){
                isbn = oLivre.get().isbn;
            }else {
                isbn = generateRandomISBN();
            }
            list.add(new Livre(nom, isbn, genererPrixAleatoire()));
        }
        return list;
    }

    public Integer getId() {
        return id;
    }

    public Double getPrix() {
        return prix;
    }

    public String getTitre() {
        return titre;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    @Override
    public int compareTo(Livre livre) {
        return isbn.compareTo(livre.isbn);
    }

    @Override
    public String toString() {
        return "Livre{" +
                ", titre='" + titre + '\'' +
                ", isbn='" + isbn + '\'' +
                ", prix=" + prix +
                '}';
    }

    private static String generateRandomISBN() {
        Random random = new Random();
        StringBuilder isbn = new StringBuilder("ISBN-13: ");
        for (int i = 0; i < 13; i++) {
            isbn.append(random.nextInt(10));
        }
        return isbn.toString();
    }

    public static double genererPrixAleatoire() {
        double prixMin = 5;
        double prixMax = 50;

        Random random = new Random();
        double prix = prixMin + (prixMax - prixMin) * random.nextDouble();
        return (double) Math.round(prix*100) / 100.0;
    }

    private static String[] nomsLivres = {
            "L'Étranger",
            "Le Seigneur des Anneaux",
            "1984",
            "Fahrenheit 451",
            "Orgueil et Préjugés",
            "Le Petit Prince",
            "Harry Potter à l'école des sorciers",
            "Les Misérables",
            "Guerre et Paix",
            "Crime et Châtiment",
            "Le Maître et Marguerite",
            "Chroniques de Narnia",
            "Le Hobbit",
            "Le Rouge et le Noir",
            "Moby Dick",
            "Le Parfum",
            "Les Hauts de Hurlevent",
            "Frankenstein",
            "Les Raisins de la colère",
            "La Ferme des animaux",
            "Anna Karénine",
            "Les Trois Mousquetaires",
            "Le Comte de Monte-Cristo",
            "Le Nom de la rose",
            "Voyage au centre de la Terre",
            "Dracula",
            "Don Quichotte",
            "La Bible",
            "Le Vieil Homme et la Mer",
            "Vingt mille lieues sous les mers",
            "Les Aventures de Sherlock Holmes",
            "Oliver Twist",
            "Le Portrait de Dorian Gray",
            "Madame Bovary",
            "La Divine Comédie",
            "L'Odyssée",
            "Les Fleurs du mal",
            "Les Quatre Filles du docteur March",
            "Le Tour du monde en quatre-vingts jours",
            "Candide",
            "La Guerre des mondes",
            "Le Journal d'Anne Frank",
            "Le Médecin malgré lui",
            "Le Fantôme de l'Opéra",
            "Jane Eyre",
            "Robinson Crusoé",
            "L'Île au trésor",
            "Gatsby le Magnifique",
            "Les Liaisons dangereuses",
            "Autant en emporte le vent",
            "La Chartreuse de Parme",
            "L'Assommoir",
            "La Machine à explorer le temps",
            "L'Homme invisible",
            "Le Meilleur des mondes",
            "Le Château",
            "Le Procès",
            "Le Silmarillion",
            "Les Piliers de la Terre",
            "L'Alchimiste",
            "Le Clan des Otori",
            "Millénium",
            "La Crypte des capucins",
            "Au Bonheur des Dames",
            "Le Paradoxe de Fermi",
            "La Stratégie Ender",
            "Le Code Enigma",
            "Fondation",
            "La Servante écarlate",
            "Le Pendule de Foucault",
            "La Part de l'autre",
            "Fahrenheit 451",
            "Neuromancien",
            "Silo",
            "Ubik",
            "La Planète des singes",
            "La Nuit des temps",
            "Chroniques martiennes",
            "La Longue Terre",
            "Ravage",
            "La Voix du feu",
            "La Lignée",
            "Les Enfants de D'Hara",
            "Le Trône de fer",
            "La Roue du temps",
            "La Voie des ombres",
            "Le Livre des martyrs",
            "Le Souffle de Midas",
            "Le Couteau du partage",
            "Le Grand Livre",
            "Les Piliers de la création",
            "Le Dieu dans l'ombre",
            "La Tombe",
            "Les Enfants de Hurin",
            "La Prophétie des Andes",
            "La Quête d'Ewilan",
            "L'Œil du monde",
            "La Trilogie de Bartiméus",
            "La Passe-miroir",
            "La Trilogie de l'Empire",
            "La Tour sombre"
    };

}
