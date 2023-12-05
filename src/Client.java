import java.util.ArrayList;

public class Client implements Comparable<Client> {
    private static Integer lastId = -1;
    private Integer id;
    private String nom;

    public Client(String nom) {
        this.nom = nom;
        id = ++lastId;
    }

    public static ArrayList<Client> listStart() {
        String[] names = {
                "Alice Archambault", "Bob Binette", "Charles Chartrand", "Diane Dupont", "Émilie Émond",
                "François Fontaine", "Gabrielle Gagnon", "Henriette Hébert", "Isabelle Ivanov", "Jacques Jolicoeur",
                "Karine Lambert", "Louis Leclerc", "Manon Martin", "Nicolas Nadeau", "Olivier Ouellet", "Patricia Pelletier",
                "Quentin Quirion", "Roxanne Roy", "Sébastien St-Pierre", "Thérèse Tremblay", "Ulysse Urbain", "Valérie Vincent",
                "William Wilson", "Xavier Xavier", "Yvette Yvon", "Zacharie Zanetti", "Adèle Aubry", "Benoît Bélanger",
                "Camille Caron", "David Dupuis", "Élodie Éthier", "Fabrice Fournier", "Geneviève Gauthier", "Hélène Héroux",
                "Isabelle Lavoie", "Jérôme Joubert", "Kévin Kowalski", "Léa Lefebvre", "Mathieu Mercier", "Noémie Nault",
                "Olivier O'Donnell", "Pascale Poirier", "Rachel Rousseau", "Simon Simard", "Tania Thibault", "Ulysse Upton",
                "Véronique Vachon", "William Wallace", "Xavier Xavier", "Yasmine Yergeau", "Zacharie Zéphirin", "Adrien Allard",
                "Béatrice Bergeron", "Christiane Chabot", "Daniel Desjardins", "Élise Élie", "François Fortin", "Gabrielle Girard",
                "Henri Héroux", "Isabelle Jacques", "Julien Jolivet", "Karine Kérouac", "Lucie Lefebvre", "Maxime Martin",
                "Nathalie Nadeau", "Olivier Olivier", "Patricia Proulx", "Quentin Quevillon", "Rachel Rousseau", "Sébastien St-Laurent",
                "Théo Thibodeau", "Ursule Urquhart", "Valérie Villeneuve", "William Windsor", "Xavier Xanthopoulos", "Yann Yelle",
                "Zacharie Zuccarello", "Aline Archambault", "Bernard Beaulieu", "Caroline Caron", "Denis Dubois", "Ève Émond",
                "Félix Fortier", "Geneviève Gagné", "Hubert Huard", "Isabelle Imbeault", "Jean Joly", "Karine Kavanagh",
                "Luc Lavoie", "Marie Martel", "Nicolas Nolin", "Odette Ouellet", "Pascal Poirier", "Quentin Quirion",
                "Rachel Robert", "Sébastien St-Pierre", "Thérèse Tremblay", "Ulysse Upton", "Valérie Vincent", "William Wilson",
                "Xavier Xavier", "Yves Yvon"
        };
        ArrayList<Client> list = new ArrayList<>(names.length);
        for (String name : names) {
            list.add(new Client(name));
        }
        return list;
    }

    @Override
    public int compareTo(Client client) {
        return id.compareTo(client.id);
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
