package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {
   @WebMethod
   // Méthode pour effectuer une conversion

   public double conversion(@WebParam double montant) {
        return montant*3.3;
    }

    @WebMethod
    // Méthode pour obtenir une liste de comptes

    public List<Compte> getComptes(){
        List<Compte> comptes = new ArrayList<Compte>();
        comptes.add(new Compte(1, 2000, new Date()));
        comptes.add(new Compte(2, 240, new Date()));
        comptes.add(new Compte(3, 2400, new Date()));
        return comptes;

    }
    public static void main(String[] args) {
        BanqueService bs =  new BanqueService();
        System.out.println(bs.conversion(10)+ "Euro");
    }
}
/*
@WebService: Indique que la classe BanqueService est une classe de service web.
@WebMethod: Indique que la méthode annotée est exposée en tant que méthode web dans le service web.
@WebParam: Spécifie qu'un paramètre de méthode est un paramètre web et peut être associé à un élément de message XML.
Ces annotations sont utilisées pour définir le comportement du service web et de ses méthodes lors de l'utilisation de la spécification JAX-WS.
 */