class Book{
    
    private int id;
    private String title;
    private String author;
    
    Book(int id,String title,String author){
    
    this.id = id;
    this.title = title;
    this.author = author;
    
    }
    
    public int getId(){
     return id;
     }
     
     public String getTitle(){
     return title;
     }
     
     public String getAuthor(){
     return author;
     }
     
     public void setId(int id){
     this.id = id;
     }
     
     public void setTitle(String title){
     this.title = title;
     }
     
     public void setAuthor(String author){
     this.author = author;
     }
     
     @Override
     public String toString() {
         return "Book{" +  "ID='" + id + '\''
                 + "title='" + title + '\'' +
                 ", author='" + author + '\'' +
                 '}';
     }
 }
 
 public class DisplayInfo{
     
      public static void main(String args[]){
      
      Book book = new Book(1,"New Ways","R.K.Sharma");
      book.setAuthor("S.V.Singh");
      System.out.println(book.toString());
      }
      
      }
