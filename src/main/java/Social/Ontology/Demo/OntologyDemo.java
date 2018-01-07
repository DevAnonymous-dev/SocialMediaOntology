package Social.Ontology.Demo;

import com.hp.hpl.jena.ontology.OntModel;

import Social.Ontology.Factory.OntologyFactory;
import Social.Ontology.Mapping.MyOntology;
import Social.Ontology.Mapping.OntologyMapping;


public class OntologyDemo {
	public static void main (String [] args){
		
		OntologyFactory ontologyFactory = new OntologyFactory();

	     OntologyMapping ontology = ontologyFactory.getOntology("Twitter");
	     MyOntology myontology = new 	MyOntology ();
		 OntModel model= myontology.buildOntology() ;
	     ontology.mapptoOntology("Twitter",model);
	     

	
	}

}
