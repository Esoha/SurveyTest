public class Novel extends Book
{
  private String genre;
    
    public Novel()
  {
     //super();
  
    // System.out.println ("The genre of the novel is " + genre);    
  }
  
  public Novel (String bookTitle, String bookIsbn)
  {   
       super(bookTitle, bookIsbn);
       genre = "non-fiction"; 
  }
  
  public Novel (String bookTitle, String bookIsbn, String bookGenre)
  {
      super(bookTitle, bookIsbn);
       genre = bookGenre;           
  }
  
  public void setGenre(String bookGenre)
  {
      genre = bookGenre; 
  }
  
  public String getGenre ()
  {
      return genre; 
  }
  
  public String toString()
  {
     return genre;
  }
  
  
  
}
