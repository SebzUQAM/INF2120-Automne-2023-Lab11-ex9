import java.util.ArrayList;

public class Emprunt {
    private Client client;
    private Livre livre;

    public Emprunt(Client client, Livre livre) {
        this.client = client;
        this.livre = livre;
    }

    public Livre getLivre() {
        return livre;
    }

    public Client getClient() {
        return client;
    }

    public static ArrayList<Emprunt> listStart() {
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "client=" + client +
                ", livre=" + livre +
                '}';
    }
}
