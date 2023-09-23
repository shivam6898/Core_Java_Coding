package Java_Coding;

class StringReverse {

    public static void main(String[] args) {
        String str = "shivam";
        int length =str.length();
        StringBuilder reverse = new StringBuilder();
        for (int i = length-1; i>=0; i--) {
            reverse.append(str.charAt(i));
        }
        System.out.println(reverse);

        //2
        String rev="";
        char[] ch=str.toCharArray();
        for (int i = str.length()-1; i>=0 ; i--) {
            rev=rev+ch[i];
        }
        System.out.println(rev);
    }
}
