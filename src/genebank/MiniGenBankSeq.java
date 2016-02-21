/*
 * Author: Swetali Patel
 * Course: BIF812
 * Instructor: Marek Laskowski
 * Declaration: I declare that the attached assignment is wholly my own work
 * in accordance with Seneca Academic Policy.  No part of this
 * assignment has been copied manually or electronically from any
 * other source (including web sites) or distributed to other students. 
 * Swetali Patel 072650146 
 */

package genebank;

public class MiniGenBankSeq extends SequenceLoader {

	// declaring the private variables
		private String locus;
		private String accession;
		private String definition;
		private String source;
		
		/*getter and setter, the purpose of getters and setters is to return the value that is already set in the setters 
		* or return uninitialised if no value has been set.
		*/
		
		public String getlocus () {
			if (locus==null){
				return "Uninitialized";
			}
			else {
			return locus;
		    }
		}
		
		public String setlocus (String newlocus) {
			return locus = newlocus;
		}
		
		public String getaccession () {
			if (accession==null){
				return "Uninitialized";
			}
			else{
			return accession;
			}
		}
		
		public String setaccession (String newaccession) {
			return accession = newaccession;
		}
		
		public String getdefinition () {
			if (definition==null){
				return "Uninitialized";
			}
			else{
			return definition;
		    }
		}

		public String setdefinition (String newdefinition) {
			return definition = newdefinition;
		}
		
		public String getsource () {
			if (source==null){
				return "Uninitialzed";
			}
			else{
			return source;
		    }
		}
		
		public String setsource (String newsource) {
			return source = newsource;
				
		}
		
		//Constructors 
		// No arguments 
		
		public MiniGenBankSeq() {
			
			
			
		}
		
		// two arguments, this constructor contains arguments for variables locus and accession and the rest of two are left as null
		
		public MiniGenBankSeq (String newlocus, String newaccession) {
			
			
			
			setlocus(newlocus);
			setaccession(newaccession);
		}
		
		
		
		/*four arguments, this constructor contains arguments for variables locus, accession, definition and source.
		 * *None of the arguments are left as null.
		 * */
		
		
		public MiniGenBankSeq (String newlocus, String newaccession, String newdefinition, String newsource) {
			
			
			
			setlocus(newlocus);
			setaccession(newaccession);
			setdefinition(newdefinition);
			setsource(newsource);
			
		}
		
		/*override, this method is used to return a string that contains the objects information
		 * which is then printed through the main method 
		 */
		
		@Override
		
		public String toString() {
			return "locus:" +locus+",accession:" +accession+",definition:" +definition+",source:" +source;
		}
		
	
	}


