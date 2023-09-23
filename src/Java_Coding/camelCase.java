package Java_Coding;

public class camelCase {
    public static void main(String[] args) {
        String str="hello world java";
        String[] strArr = str.split(" ");
        String camelCase = "";
        for (int i = 0; i < strArr.length; i++) {
            if (i==0){
                camelCase = strArr[i];
            }else {
                String s = strArr[i];
                camelCase = camelCase+ s.substring(0,1).toUpperCase()+s.substring(1);
            }
        }
        System.out.println(camelCase);
    }
}