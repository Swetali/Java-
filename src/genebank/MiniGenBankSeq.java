package genebank;

public class MiniGenBankSeq extends SequenceLoader {

	
		private String locus;
		private String accession;
		private String definition;
		private String source;
		
		//getter and setter 
		
		public String getlocus () {
			return locus;
		}
		
		public String setlocus (String newlocus) {
			return locus = newlocus;
		}
		
		public String getaccession () {
			return accession;
		}
		
		public String setaccession (String newaccession) {
			return accession = newaccession;
		}
		
		public String getdefinition () {
			return definition;
		}

		public String setdefinition (String newdefinition) {
			return definition = newdefinition;
		}
		
		public String getsource () {
			return source;
		}
		
		public String setsource (String newsource) {
			return source = newsource;
				
		}
		
		//Constructors 
		// No arguments 
		
		public MiniGenBankSeq() {
			
			
			
		}
		
		// two arguments 
		
		public MiniGenBankSeq (String newlocus, String newaccession) {
			
			
			
			setlocus(newlocus);
			setaccession(newaccession);
		}
		
		//four arguments
		
		public MiniGenBankSeq (String newlocus, String newaccession, String newdefinition, String newsource) {
			
			
			
			setlocus(newlocus);
			setaccession(newaccession);
			setdefinition(newdefinition);
			setsource(newsource);
			
		}
		
		//override
		
		@Override
		
		public String toString() {
			return "locus:" +locus+",accession:" +accession+",definition:" +definition+",source:" +source;
		}
		
	
	}


