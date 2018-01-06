package Social.Ontology.Mapping;


import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.Ontology;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.sparql.vocabulary.FOAF;


public class MyOntology  {

	public OntModel  buildOntology() {

		// Create an empty ontology model
		OntModel ontModel = ModelFactory.createOntologyModel();
		String ns = new String("http://www.socialmedia.com/myOntology#");
		String baseURI = new String("http://www.socialmedia.com/myOntology");
		Ontology onto = ontModel.createOntology(baseURI);

		// create classes
		//create publication and subclass
		// use existing property of the ontology to complete the construction of the new ontology
		// Import SIOC ontology
		String SIOC = "http://rdfs.org/sioc/ns#";
		ontModel.setNsPrefix("sioc", SIOC);
		OntClass Publication = ontModel.createClass(SIOC + "Post");
		OntClass Text= ontModel.createClass(ns + "Text");
		OntClass Image= ontModel.createClass(ns + "Image");
		OntClass Video= ontModel.createClass(ns + "Video");
		OntClass Audio= ontModel.createClass(ns + "Audio");
           Publication.addSubClass(Text);
           Publication.addSubClass(Video);
           Publication.addSubClass(Image);
           Publication.addSubClass(Audio);

		// create Actor and subclass of Actor
       //Integrate SIOC and FOAF ontology
		OntClass Actor = ontModel.createClass(SIOC + "Actor");
		OntClass Person = ontModel.createClass(FOAF.Person + "Person");
		OntClass Page = ontModel.createClass(FOAF.page + "Page");
		OntClass Group = ontModel.createClass(FOAF.Group + "Person");
		OntClass Event = ontModel.createClass(ns+ "Event");
		
		Page.addSuperClass(Actor);
		Person.addSuperClass(Actor);
		Group.addSuperClass(Actor);
		Event.addSuperClass(Actor);
		
          
          //create Popularity class for publication
          OntClass Popularity_Metrics= ontModel.createClass(ns + "Popularity_Metrics");
          OntClass Contextual_Metrics= ontModel.createClass(ns + "Contextual_Metrics");
          OntClass Content_Metrics= ontModel.createClass(ns + "Content_Metrics");

          OntClass Video_Content= ontModel.createClass(ns + "Video_Content");
          OntClass Image_Content= ontModel.createClass(ns + "Image_Content");
          OntClass Audio_Content= ontModel.createClass(ns + "Audio_Content");
          OntClass Text_Content= ontModel.createClass(ns + "Text_Content");
          
   
          Popularity_Metrics.addSubClass(Content_Metrics);
          Popularity_Metrics.addSubClass(Contextual_Metrics);
         
          Content_Metrics.addSubClass(Video_Content);
          Content_Metrics.addSubClass(Image_Content);
          Content_Metrics.addSubClass(Audio_Content);
          Content_Metrics.addSubClass(Text_Content);
          
          
          
          
          OntClass Publication_Metadata= ontModel.createClass(ns + "Publication_Metadata");
          OntClass FeedBack_Metadata= ontModel.createClass(ns + "FeedBack_Metadata");
          
          Contextual_Metrics.addSubClass(Publication_Metadata);
          Contextual_Metrics.addSubClass(FeedBack_Metadata);
          
          OntClass Metadata_After_Uplaod= ontModel.createClass(ns + "Metadata_After_Uplaod");
          OntClass Metadata_Before_Uplaod= ontModel.createClass(ns + "Metadata_Before_Uplaod");
        
          Publication_Metadata.addSubClass(Metadata_After_Uplaod);
          Publication_Metadata.addSubClass(Metadata_Before_Uplaod);
          
          OntClass Implicit_FeedBack= ontModel.createClass(ns + " Implicit_FeedBack");
          OntClass Explicit_FeedBack= ontModel.createClass(ns + "Explicit_FeedBack");
          
          FeedBack_Metadata.addSubClass(Implicit_FeedBack);
          FeedBack_Metadata.addSubClass(Explicit_FeedBack);
          
          
          //create Popularity class for actor
          OntClass Actor_Popularity= ontModel.createClass(ns + "Actor_Popularity");
          Contextual_Metrics.addSubClass(Actor_Popularity);
          
          OntClass Actor_Metadata= ontModel.createClass(ns + "Actor_Metadata");
          OntClass Actor_Activity= ontModel.createClass(ns + "Actor_Activity");
          OntClass Actor_Connectivity= ontModel.createClass(ns + "Actor_Connectivity");
          
          Actor_Popularity.addSubClass(Actor_Metadata);
          Actor_Popularity.addSubClass(Actor_Activity);
          Actor_Popularity.addSubClass(Actor_Connectivity);
          
     	 // write the model in Turtle
     	 ontModel.write(System.out, "RDF/XML-ABBREV");
     	 return ontModel;
		
	}

	

}
