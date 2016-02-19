package genebank;

public class testSW {

	public static void main(String[] args) {
		StringWriterMiniGenBankSeq mySampleSW = new StringWriterMiniGenBankSeq();
		long nanoseconds = mySampleSW.testConcatenate(10);
		double seconds = nanoseconds / (double)1000000000; 
		System.out.println("concatenating using StringBuilder took " + seconds + " seconds");


	}

}
