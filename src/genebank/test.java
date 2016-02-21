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

public class test extends MiniGenBankSeq {

	public static void main(String[] args) {
		MiniGenBankSeq test100000 = new MiniGenBankSeq();
		long nanoseconds = test100000.testConcatenate(100000);
		double seconds = nanoseconds / (double)1000000000; 
		System.out.println("concatenating 100,000 took " + seconds + " seconds");

		MiniGenBankSeq test10000 = new MiniGenBankSeq();
		long nanoseconds10K = test10000.testConcatenate(10000);
		double seconds10k = nanoseconds10K / (double)1000000000; 
		System.out.println("concatenating took 10,000 " + seconds10k + " seconds");
		
		
		MiniGenBankSeq test1000 = new MiniGenBankSeq();
		long nanoseconds1k = test1000.testConcatenate(1000);
		double seconds1k = nanoseconds1k / (double)1000000000; 
		System.out.println("concatenating took 1000" + seconds1k + " seconds");
		
		MiniGenBankSeq test100 = new MiniGenBankSeq();
		long nanoseconds100 = test100.testConcatenate(100);
		double seconds100 = nanoseconds100 / (double)1000000000; 
		System.out.println("concatenating took 100" + seconds100 + " seconds");
		
		MiniGenBankSeq test10 = new MiniGenBankSeq();
		long nanoseconds10 = test10.testConcatenate(10);
		double seconds10 = nanoseconds10 / (double)1000000000; 
		System.out.println("concatenating took 10" + seconds10 + " seconds");
	
		
	}
		

}
