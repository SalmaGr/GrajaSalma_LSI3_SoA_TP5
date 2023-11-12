package metier;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
    public class Compte {
        int code, solde ;
        @XmlTransient
        Date dateCreation;
        public Compte(int code, int solde, Date dateCreation) {
            super();
            this.code = code;
            this.solde = solde;
            this.dateCreation = dateCreation;
        }
        public Compte() {

        }
        public int getCode() {
            return code;
        }
        public void setCode(int code) {
            this.code = code;
        }
        public int getSolde() {
            return solde;
        }
        public void setSolde(int solde) {
            this.solde = solde;
        }
        public Date getDateCreation() {
            return dateCreation;
        }
        public void setDateCreation(Date dateCreation) {
            this.dateCreation = dateCreation;
        }

    }
