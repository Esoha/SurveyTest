/****    
 * Name: Zhuldyz Ilyassova
 * Student Number: T00650013
 * Assignment #1: 1 D and 2 D Arrays
 * Due Date:  January 21, 2020
 * Program Description:  Exam test with score output for all students who taken exam
 ****/ 

import java.util.*;
public class Demo
  {
     //data
      // private static String [] names;
      // private static char [][] answers;
       private static char [] key;
       private static int [] studentsum;
       private static int [] questionsum;
      // private static char [] num;
       
       
       public static  String [] names = new String [] {"Audrey", "Brian", "Elizabeth", "Ellen", 
                           "Gregory", "Harold", "Lewis", "Kevin", "Kieran", 
                           "Michael", "Peter", "Wayne", "Yang", "Zachary"};
       public static int num = 10;
       public static char [][] answers = {{'F','T','T','F','T','F','T','T','F','T'},
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
      
      System.out.printf("%5s%27s%18s/%1d\n", "Students", "Questions#", "Score", num);
      
      System.out.printf("%17d%3d%3d%3d%3d%3d%3d%3d%3d%3d\n", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      
      System.out.printf("%10s%3s\n", names[1],answers[0][1]);
     
        
      }
        
               
          
   
   
       public static void main (String [] args)
       {
          printResults(); 
          
            
                   
            
       }
       
       
       
       
       
          
       
  }
