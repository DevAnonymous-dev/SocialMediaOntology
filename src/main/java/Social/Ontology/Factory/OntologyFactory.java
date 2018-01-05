package Social.Ontology.Factory;

import Social.Ontology.Mapping.GooglePlusOntology;
import Social.Ontology.Mapping.TwitterOntology;
import Social.Ontology.Mapping.YouTubeOntology;

public class OntologyFactory {
	 //use getShape method to get object of type shape 
	   public  Social.Ontology.Mapping.OntologyMapping getOntology(String ontologyName){
	      if(ontologyName== null){
	         return null;
	      }		
	      if(ontologyName.equalsIgnoreCase("Twitter")){
	         return new TwitterOntology();
	         
	      } else if(ontologyName.equalsIgnoreCase("YouTube")){
	         return new YouTubeOntology();
	         
	      } else if(ontologyName.equalsIgnoreCase("GoolePlus")){
	         return new GooglePlusOntology();
	      }
	      
	      return null;
	   }
}
