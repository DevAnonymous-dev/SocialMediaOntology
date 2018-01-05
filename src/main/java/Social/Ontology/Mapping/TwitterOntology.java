package Social.Ontology.Mapping;

import java.io.File;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.vocabulary.RDF;

public class TwitterOntology implements OntologyMapping {

	public OntModel buildOntology(String socialMedia) {
		
		//Creation of the new ontology to describe Publication
				//Create an empty ontology
				OntModel model = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
				String uriBase = "http://www.unifiedModel.com/myontology#";
				model.createOntology(uriBase);
				//Create attributes that don't exist in ontologies
				Property  ID = model.createOntProperty( uriBase+ "ID" );
				Property Language=  model.createOntProperty( uriBase+ "Language" );
				Property Source =  model.createOntProperty( uriBase+ "Source" );//The Social network source
				Property CreatedAT =  model.createOntProperty( uriBase+ "CreatedAT" );
				//Import SIOC ontology 
				//use existing property of the ontology to complete the construction of the new ontology 
				String SIOC = "http://rdfs.org/sioc/ns#";
				model.setNsPrefix("sioc",SIOC );
			    OntClass Publication	= model.createClass(SIOC + "Post");
			    Property Content =	model.createOntProperty(SIOC + "Content");//Text of the Post
				
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

