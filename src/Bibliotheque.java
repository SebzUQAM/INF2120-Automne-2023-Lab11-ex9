import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List< Client > clients;
    private List< Livre > livres;
    private List< Emprunt > emprunts;
    public static final long LIMITE_PAR_CLIENT = 5;

    public Bibliotheque(
            ArrayList<Client> clients
            , ArrayList<Livre> livres
            , ArrayList<Emprunt> emprunts
    ) {
        this.clients = clients;
        this.livres = livres;
        this.emprunts = emprunts;
    }

    public boolean estEmprunte( Livre livre ){
        long nombreEmprunts = emprunts.stream().filter((e) -> { return e.getLivre().compareTo(livre) == 0; }).count();
        long nombreLivres = livres.stream().filter((e) -> { return e.compareTo(livre) == 0; }).count();
        return nombreEmprunts == nombreLivres;
    }

    public long nombreEmprunt( Client client ){

        return emprunts.stream().filter((e) -> { return e.getClient().compareTo(client) == 0; }).count();
    }

    public void emprunter( Client client, Livre livre ) throws LivreDejaEmprunte, ClientAtteintLimite{
        if(nombreEmprunt(client) >= LIMITE_PAR_CLIENT){
            throw new ClientAtteintLimite();
        }else if(estEmprunte(livre)) {
            throw new LivreDejaEmprunte();
        }else{
            Emprunt emprunt = new Emprunt(client,livre);
            emprunts.add(emprunt);
        }
    }

    public void afficherLivresDisponibles(){
        livres.stream()
                .filter((livre) -> {
                    return emprunts.stream()
                            .noneMatch((emprunt) -> {
                                return emprunt.getLivre().getId().compareTo(livre.getId()) == 0;
                            }); })
                .forEach((livre) -> { System.out.println(livre); });
    }

    public Object[] listeEmprunt( Client client ){

        return emprunts.stream()
                .filter((emprunt) -> { return emprunt.getClient().compareTo(client) == 0; })
                .toArray();
    }

    public double valeurInventaire(){
        return livres.stream()
                .mapToDouble((livres) -> {return livres.getPrix(); })
                .sum();
    }

    public void devaloriser( double perte ){
        livres.stream().forEach((livre) -> { livre.setPrix(livre.getPrix() * (1 - perte)); });
    }
}
