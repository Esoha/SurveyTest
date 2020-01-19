public class Marking
  {
     //data
       private static String [] names;
       private static char [][] answers;
       private static char [] key;
       private static int [] studentsum;
       private static int [] questionsum;
       private static int [] correct;
       
       
   public static void initData ()
   {
        
        String [] names = new String [] {"Audrey", "Brian", "Elizabeth", "Ellen", 
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
        
        
    //int student = answers.length;
    //int question = answers[0].length;
   
   //int [] studentsum = new int [student];
   //int [] questionsum = new int [question];
   }
      
   
   public static void studentResults ()
   {
     
     for (int i = 0; i < answers.length; i++)
       for (int k = 0; k < answers[0].length; k++)
       if (key[k] == answers[i][k])
     correct [k]++;
        
   }
   
   
   public static void questions ()
   {
     
     for (int i = 0; i < answers[0].length; i++)
       for (int k = 0; k < answers.length; k++)
       if (key[i]== answers[k][i])
       correct [i]++; 
       
   }
   
   
  public static void printResults ()
  {
    
    
    System.out.format("Students              Questions #            Score/%d", correct);
    
    
    
    
    
    
  }
   
   
   
       public static void main (String [] args)
       {
            
          printResults();
            
            
            
            
            
            
       }
       
       
       
       
       
          
       
  }
