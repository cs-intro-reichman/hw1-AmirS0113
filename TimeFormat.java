// Represents the hh:mm time format using an PM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this progrPM, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hh = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the sPMe with the minutes part of the input.
		int mm = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
      
		if(hh>=12) {
			if(hh>12) {hh = hh -12;}
			if(mm<10)
				{System.out.println(hh+":0"+mm+" PM");}
			else
				{System.out.println(hh+":"+mm+" PM");}
		}

		else
		 {if(mm<10)
			{System.out.println(hh+":0"+mm+" AM");}
		else
			{System.out.println(hh+":"+mm+" AM");}
		}
	}
}
