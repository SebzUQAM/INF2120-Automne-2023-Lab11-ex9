import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Bibliotheque {
    private List< Client > clients;
    private List< Livre > livres;
    private List< Emprunt > emprunts;
    public static final long LIMITE_PAR_CLIENT = 5;

    public Bibliotheque(ArrayList<Client> clients, ArrayList<Livre> livres, ArrayList<Emprunt> emprunts) {
        this.clients = clients;
        this.livres = livres;
        this.emprunts = emprunts;
    }

    public boolean estEmprunte( Livre livre ){
        return  emprunts.stream()
                .anyMatch((x) -> x.getLivre().getID() == livre.getID() );
    }

    public long nombreEmprunt( Client client ){

        return 0;
    }

    public void emprunter( Client client, Livre livre )
            throws LivreDejaEmprunte, ClientAtteintLimite{

    }

    public void afficherLivresDisponibles(){

    }

    public Object[] listeEmprunt( Client client ){

        return new Object[0];
    }

    public double valeurInventaire(){

        return 0;
    }

    public void devaloriser( double perte ){

    }
}
