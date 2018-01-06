package Social.Ontology.Mapping;

import java.io.File;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.vocabulary.RDF;

public interface OntologyMapping {
	
	public OntModel mapptoOntology(String socialMedia);
	public boolean instanciateOntology (File file);
	public boolean loadOntology (RDF data);
		
}
