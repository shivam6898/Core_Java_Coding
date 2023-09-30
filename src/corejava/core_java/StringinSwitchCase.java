package corejava.core_java;

public class StringinSwitchCase
{ 
   public static void main(String[] args) 
   { 
       String fruit = "Apple"; 
       switch(fruit) 
       { 
           case "Mango": 
               System.out.println("Sweet"); 
               break; 
           case "Apple": 
               System.out.println("Delicious"); 
               break; 
           case "Orange": 
               System.out.println("Luscious"); 
               break; 
           default: 
               System.out.println("Not a fruit"); 
       }   
   }
}