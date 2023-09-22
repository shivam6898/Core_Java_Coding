package Java_Coding;

class StringReverse {
	public static void main(String[] args) {
		String str="shivam";
		String rev="";
		char[] ch=str.toCharArray();
		for (int i = str.length()-1; i>=0 ; i--) {
			rev=rev+ch[i];  
		}
		System.out.println(rev);
	}
}