import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a13d4de6-3083-4f2d-bd6a-444db13472c8")
public class ETUDIANT {
    @objid ("e7ee390f-e7b6-4b09-a28d-7b667b482288")
    public String Matricule;

    @objid ("77324a79-2aa2-4291-9439-82c0db376a37")
    protected String Nom;

    @objid ("7b8ee0a7-950a-4981-8ccf-70719fdb6f45")
    protected String Prénom;

    @objid ("d61ab870-6c3b-4aa2-96fd-6dc01fb04c80")
    public List<ELECTION> intervenir = new ArrayList<ELECTION> ();

    @objid ("1aa853b4-4cd2-476c-8779-e3ba1a2801db")
    public Compte ;

    @mdl.prop
    @objid ("eca8cd37-c7f6-4c90-8817-c583618ba5ce")
    private ETUDIANT ;

    @mdl.propgetter
    public ETUDIANT get() {
        // Automatically generated method. Please do not modify this code.
        return this.;
    }

    @mdl.propsetter
    public void set(ETUDIANT value) {
        // Automatically generated method. Please do not modify this code.
        this. = value;
    }

    @objid ("f12056a8-4823-430c-b981-c0f8876ef414")
    public ETUDIANT(String matricule, String data) {
    }

    @objid ("65c6201a-1b24-4f3a-8c6e-f5de2e1f3d7d")
    protected void finalize() {
    }

    @objid ("f6d005a6-eefc-4ccd-9cbc-946323c2f257")
    public void Demande_inscription(String info_personelles) {
    }

    @objid ("3811e6a4-32d5-49a4-9fbb-0669aa564b29")
    private void Effectuer_vote() {
    }

    @objid ("2410962c-0c24-4b11-8c55-422ace29337f")
    public void Deposer_candidature() {
    }

    @objid ("fc050dd3-861a-47d6-8178-39b593414739")
    public void ReéssayerAuthentification() {
    }

    @objid ("850ad8a2-2723-4c1a-9e4c-1389f0264d02")
    public void Connexion() {
    }

    @objid ("1b776982-494f-48e0-abfb-56c8d4306b77")
    public void Proclamer_resultats() {
    }

}
