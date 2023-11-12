package serveur;

import jakarta.xml.ws.Endpoint;

import service.BanqueService;

public class ServeurJWS {
    public static void main(String[] args) {
        // Définir l'URL à laquelle le service web sera publié
        String url = "http://localhost:8084/BanqueService";
        //// Créer une instance du service de la banque
        BanqueService banqueService = new BanqueService();
        // Publiez le service à l'URL spécifiée
        Endpoint.publish(url, banqueService);
        /*
        La méthode Endpoint.publish(url, banqueService); est utilisée pour rendre le service de la banque accessible via
        le protocole HTTP à l'adresse définie par la variable url.
        La publication du service à cette URL permet aux clients distants d'accéder aux fonctionnalités du service
        de la banque à travers des requêtes web.
         */


        // Afficher un message indiquant que le service web a été publié avec succès à une adresse spécifique
        System.out.println("Service web BanqueService publié à l'adresse : " + url);
    }
}
/*
    Cette classe vise à rendre le service bancaire accessible,
    et favoriser la communication client-serveur.
 */