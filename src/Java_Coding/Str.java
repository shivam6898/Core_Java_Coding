package Java_Coding;

public class Str {
    public static void main(String[] args) {
        String s = "  abc  def ";
        s = s.trim();
        System.out.println("trim string: " +s);
        System.out.println("lenght string: " +s.length());

        //split
        String str1 = "springboot";
        String[] strArr = str1.split("");
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]);
        }

        //swap string without using third variable
        String a = "Apple";
        String b = "Banana";
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("After swap:" + a + " " + b);

        //remove particular character from string
        String fruit = "Apple_Banana";
        System.out.println(fruit.replaceAll("_", "-"));

        //count the character in string
        System.out.println(fruit.chars().map(c -> (char) c).filter(c -> (char) c == 'p').count());
        System.out.println(fruit.chars().filter(c -> (char) c == 'p').count());


    }
}
