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
import java.io.StringWriter;

public class StringWriterMiniGenBankSeq extends MiniGenBankSeq{

	@Override 
	public void concatenate(String Stringwriter, int time) {
		StringWriter sw = new StringWriter();
		for(int i=0; i<=time; i++){
			System.out.println("Concatenating using Stringwriter; time "+ i + "of"+time);
			sw.append(Stringwriter);
		}
		sequence = sw.toString();
		

	}

}
