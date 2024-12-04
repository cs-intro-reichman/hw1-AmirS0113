// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
	int currntVlaue = Integer.parseInt(args[0]);
    int years = Integer.parseInt(args[2]);
	double rate = Double.parseDouble(args[1]);
	double futureValue=Math.pow((rate/100)+1, years)*currntVlaue;
	System.out.println("After "+years+" years, $"+currntVlaue+" saved at "+rate+"% will yield $"+(int)futureValue+".");
	}
}
