package Social.Ontology.Demo;

import Social.Ontology.Factory.OntologyFactory;
import Social.Ontology.Mapping.OntologyMapping;


public class OntologyDemo {
	public static void main (String [] args){
		
		OntologyFactory ontologyFactory = new OntologyFactory();

	      //get an object of Circle and call its draw method.
	     OntologyMapping ontology = ontologyFactory.getOntology("Twitter");

	      //call draw method of Circle
	     ontology.mapptoOntology("Twitter");
	     

	
	}

}
