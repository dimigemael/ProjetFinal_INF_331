import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b385f1a5-cc8d-43be-9140-6d36de5c06bc")
class ADMINISTRATEUR {
    @objid ("fd3ebfd5-a24e-454f-ad6b-00bd2a497ed4")
    private String Admin_ID;

    @objid ("446dec69-db6e-4793-ba7c-1c8d6cd2f7fc")
    public List<ELECTION> Parametrer = new ArrayList<ELECTION> ();

    @objid ("f1f22287-03d4-432f-8e85-98103ae1757c")
    public Compte ;

    @objid ("ddbb8739-354d-4db9-81b1-a1824e908feb")
    public CANDIDATURE valider;

    @objid ("58d7ea73-9c70-469e-823e-651537263a16")
    public void ReéssayerAuthentification(String login, String password) {
    }

    @objid ("6ad24870-2dc5-4ecf-8154-d0ad8114458f")
    public void validerCompte(String matricule) {
    }

}
