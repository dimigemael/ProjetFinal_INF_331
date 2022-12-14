import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7d9e3d27-e671-46ab-ad55-e74391f9fe02")
class CANDIDAT extends ETUDIANT {
    @objid ("18eb7ccd-bfa7-47f6-b35f-4ee0e5c1a4ae")
    public byte Photo_profil;

    @objid ("471e07f3-01c6-4041-ad6c-1fb7ef415737")
    public String Promesse_electorale;

    @objid ("dc787399-8f1b-4a7e-bfdf-0eb4e3105c24")
    public List<CANDIDATURE> proposer = new ArrayList<CANDIDATURE> ();

    @objid ("b11e5b64-c15f-4592-9b65-56a34e9feaa4")
    public void Retourne formulaire_candidature() {
    }

    @objid ("58e65d5e-de5f-4405-9c47-a321f5145e59")
    public void RemplirANouveau() {
    }

    @objid ("2f0fe7d7-f25a-4b9f-9694-ebcaf01f6bf3")
    public void NotificationSuccesOperation() {
    }

}
