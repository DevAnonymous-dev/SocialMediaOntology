package Social.Ontology.Mapping;

import java.io.File;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.ontology.Ontology;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.vocabulary.RDF;

public class TwitterOntology implements OntologyMapping {
	
	
	public OntModel mapptoOntology(String socialMedia) {
		MyOntology ontology = new 	MyOntology ();
		OntModel model= ontology.buildOntology() ;
			
				
			 model.write(System.out, "RDF/XML-ABBREV");
			    
				
		return model;
	}

	public boolean instanciateOntology(File file) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean loadOntology(RDF data) {
		// TODO Auto-generated method stub
		return false;
	}


}

