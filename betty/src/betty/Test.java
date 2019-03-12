package betty;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47) ;
		Map<Integer,Integer> m =new HashMap<>(); 
      for(int i =0 ; i<10000; i++  );{
      int r  = rand.nextInt(20);
      Integer freqs = m.get(r);
      if(freqs == null)
    	  freq = 1;
	}
      else {
    	 freq = freq+1;
      }
      }
	}


