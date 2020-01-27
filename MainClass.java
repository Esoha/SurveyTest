public class MainClass
{
   public static void main (String[] args)
   {
      // Book obj1 = new Book();
       
       Textbook obj2 = new Textbook("Fundamentals of Calculus", "ISBN 72487124","MATH 1240" );
       
       Novel obj3 = new Novel("Crime and Punishment", "ISBN 97249012974", "psychological fiction");
        
       
        System.out.println ("The title of the textbook is " + obj2.getTitle());
        System.out.println ("The ISBN of the textbook is " + obj2.getIsbn());
        System.out.println ("The course of the textbook is " + obj2.getCourse());
        
        System.out.println ("The title of the novel is " + obj3.getTitle()); 
        System.out.println ("The isbn of the novel is " + obj3.getIsbn());
        System.out.println ("The genre of the novel is " + obj3.getGenre());
        
   }
     
     
     
     
}
