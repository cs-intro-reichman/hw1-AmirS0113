// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
		public static void main(String[] args) {
            int middle; 
			int num =Integer.parseInt(args[0]);;
			int x = (int) (Math.random() *num)+1;
            int y = (int) (Math.random() *num)+1;
            int z = (int) (Math.random() *num)+1;
            System.out.println(x+" "+z+" "+y);
            int min = Math.min (x, Math.min(y, z));
            int max = Math.max (x, Math.max(y, z));
            if (min != x && max != x) middle = x;
            else if (min != y && max != y) middle = y;
            else middle =z;
            System.out.println(min+" "+middle+" "+max);
	}
}
