import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws LivreDejaEmprunte, ClientAtteintLimite {
        ArrayList<Client> clients = Client.listStart();
        ArrayList<Livre> livres = Livre.listStart();
        Bibliotheque bibliotheque = new Bibliotheque(clients, livres, Emprunt.listStart());

        bibliotheque.emprunter(clients.get(0), livres.get(0));
        bibliotheque.emprunter(clients.get(0), livres.get(1));
        bibliotheque.emprunter(clients.get(0), livres.get(2));
        System.out.println( bibliotheque.estEmprunte(livres.get(3)) );
        bibliotheque.emprunter(clients.get(1), livres.get(3));
        System.out.println( bibliotheque.estEmprunte(livres.get(3)) );// On a deux livre Fahrenheit 451
        bibliotheque.emprunter(clients.get(1), livres.get(4));
        System.out.println( bibliotheque.estEmprunte(livres.get(4)) );
        System.out.println( bibliotheque.nombreEmprunt(clients.get(0)) );
        System.out.println( bibliotheque.nombreEmprunt(clients.get(1)) );

        bibliotheque.afficherLivresDisponibles();

        System.out.println(Arrays.toString(bibliotheque.listeEmprunt(clients.get(0))));

        System.out.println(bibliotheque.valeurInventaire());
        bibliotheque.devaloriser(0.1);
        System.out.println(bibliotheque.valeurInventaire());
    }
}