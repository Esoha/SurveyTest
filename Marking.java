/****    
 * Name: Zhuldyz Ilyassova
 * Student Number: T00650013
 * Assignment #1: 1 D and 2 D Arrays
 * Due Date:  January 21, 2020
 * Program Description:  Exam test with score output for all students who taken exam
 ****/ 
public class Marking
  {
     //data
       private static String [] names = new String[14];
       private static char [][] answers = new char[14][10];
       private static char [] key = new char[10];
       private static int [] studentsum = new int[10];
       private static int [] questionsum = new int [14];
       
       
       
   public static void initData ()
   {
        
        
     String [] names = {"Audrey", "Brian", "Elizabeth", "Ellen", 
                           "Gregory", "Harold", "Lewis", "Kevin", "Kieran", 
                           "Michael", "Peter", "Wayne", "Yang", "Zachary"};
        
        char [] key = {'F','T','F','F','T','F','F','T','F','T'};
        
        char [][] answers = {{'F','T','T','F','T','F','T','T','F','T'},
                             {'F','T','F','T','F','T','T','T','F','F'},
                             {'F','T','T','F','T','T','T','T','T','T'},
                             {'T','T','F','F','T','F','F','T','T','T'},
                             {'T','T','F','T','T','T','F','F','T','F'},
                             {'T','T','T','T','T','T','T','T','T','T'},
                             {'F','T','F','F','F','T','F','T','F','T'},
                             {'T','F','T','F','T','F','T','F','T','F'},
                             {'T','T','T','F','F','T','T','F','T','F'},
                             {'F','F','F','F','F','F','F','F','F','F'},
                             {'T','F','T','T','F','T','T','F','T','F'},
                             {'F','T','F','F','T','T','F','F','F','T'},
                             {'F','T','F','T','F','T','F','T','F','T'},
                             {'T','F','T','F','T','T','F','T','F','T'}
        };
        
        
    
   }
      
   
   public static void studentResults ()
   {
     
     for (int i = 0; i < answers.length; i++)
       for (int k = 0; k < answers[i].length; k++)
     {
       if (key[k] == answers[i][k])
     studentsum [k]++;
     }
        
   }
   
   
   public static void questions ()
   {
     
     for (int i = 0; i < answers[i].length; i++)
       for (int k = 0; k < answers.length; k++)
     {
       if (key[i]== answers[k][i])
       questionsum [i]++; 
     }
    
       
   }
   
   public static void printResults()
   {
     
      System.out.printf("%5s%27s%18s/%1d\n", "Students", "Questions#", "Score", studentsum.length);
      
      System.out.printf("%17d%3d%3d%3d%3d%3d%3d%3d%3d%3d\n", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
        for(int i = 0; i < answers.length; i++)
       {
        System.out.printf("%-12s",names[i]);
        
        
      
        }
   }
     
     
     
   
   
   
   
       public static void main (String [] args)
       {
         initData();
         printResults(); 
          
            
            
            
            
            
            
       }
       
       
       
       
       
          
       
  }

    
  
