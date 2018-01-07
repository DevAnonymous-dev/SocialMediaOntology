package Social.Ontology.Mapping;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.ontology.Ontology;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.vocabulary.RDF;

public class TwitterOntology implements OntologyMapping {
	
	public OntModel mapptoOntology(String socialMedia, OntModel ontology) {

	 OntClass publicationClass = ontology.getOntClass("http://www.socialmedia.com/myOntology#Publication");
     Individual publication1 =  ontology.createIndividual("http://www.socialmedia.com/myOntology#Publication"+ "publication1",publicationClass);
     Individual publication2 = ontology.createIndividual("http://www.socialmedia.com/myOntology#Publication"+ "publication2",publicationClass);
     Literal id = ontology.createTypedLiteral("122222", XSDDatatype.XSDstring);
     Statement stat = ontology.createStatement(publication1, ontology.getProperty("has_id"), id);
     List<Statement> statements = new ArrayList<Statement>();    
     statements.add(stat);
      ontology.add(statements);
     //just displaying here - but how do I now write/insert this into my Triple Store/TDB using AQR API?
     ontology.write(System.out, "RDF/XML-ABBREV");
	return ontology;
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

