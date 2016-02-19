package genebank;

public class testSB {

	public static void main(String[] args) {
		StringBuilderMiniGenBankSeq mySampleSB = new StringBuilderMiniGenBankSeq();
		long nanoseconds = mySampleSB.testConcatenate(100);
		double seconds = nanoseconds / (double)1000000000; 
		System.out.println("concatenating using StringBuilder took " + seconds + " seconds");

	}

}
