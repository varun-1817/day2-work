
public class palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num=1221;
         int temp, r,sum=0 ;
         temp = num;
         while (num>0) {
        	 r=num%10;
        	 sum=(sum*10+r);
        	 num=num/10;
        	 
         }
         if(temp==sum)
        	 System.out.println("palindrome number");
         else
        	 System.out.println("not palindrome");
	}

}
