
package GestionPaiement;
import java.util.Date;
import GestionDonnes.Client;
import GestionTache.Tache;
/**
 *
 * @author Mathi
 */
public class Paiement {

    private int numP;
    private Date dateP;
    private float montantP;

    public Paiement(int num, Date date, int montant) {
        this.numP = num;
        this.dateP = date;
        this.montantP = montant;
    }

    public int getNumP() {
        return numP;
    }

    public Date getDateP() {
        return dateP;
    }

    public float getMontantP() {
        return montantP;
    }
<<<<<<< HEAD

=======
>>>>>>> 89d7dc9e9c2e6696a309e03012478bc7cef1ce70
}

