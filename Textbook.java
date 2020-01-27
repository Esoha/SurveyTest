public class Textbook extends Book
{
  private String course;
  
  public Textbook()
  {
    
    
  }
  
  public Textbook (String bookTitle, String bookIsbn)
  {
       super(bookTitle, bookIsbn);
       course = "MATH 1240";   
  }
  
  public Textbook (String bookTitle, String bookIsbn, String bookCourse)
  {
       super(bookTitle, bookIsbn);
       course = bookCourse;   
       
  }
  
  public void setCourse (String bookCourse)
  {
    course = bookCourse;
  }
  
  public String getCourse () 
  {
    return course; 
  }

  
  public String toString ()
  {
   
      return course;
  }

}
