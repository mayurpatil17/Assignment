package Day4;

public class string_Digitsum7 {
	public static void main(String[] args) {
		String s1="14abc9kj";
   
        int sum = 0;
        for (int i = 0; i < s1.length(); i++)
        {
            char ch = s1.charAt(i);
            if (Character.isDigit(ch))
            {
            	
              int b = Integer.parseInt(String.valueOf(ch));
                
                sum = sum +b;
            }
        }
        if (sum !=0)
        {
            System.out.println(sum);
        }
        else
            System.out.println(0);
    }

}
