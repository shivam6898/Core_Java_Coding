package Java_Coding;

public class Armstrongnum {
	// 153=1^3+5^3+3^3=153
	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int sum=0;
		while (temp!=0) {
			int rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
      if(num==sum)
    	 System.out.println("armstrong..");
      else
      System.out.println("not armstrong");
	}

}
