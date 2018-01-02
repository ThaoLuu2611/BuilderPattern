public class Book {
  
  private String title;
  private String author;
  private String genre;
  private String ISBN;
  private String publishDate;
  
  public static class Builder
  {
      private String title;
      private String author;
      private String genre;
      private String publishDate;
      private String ISBN = "000000000";
      Office office;
      
      public Builder(String title, String author)
      {
          this.title = title;
          this.author = author;
      }
      
      
      public Builder genre (String val)
      {
          this.genre = val;
          return this;
      }
      
      public Builder publishDate(String val)
      {
          this.publishDate = val;
          return this;
      }
      
      public Builder ISBN(String val)
      {
          this.ISBN = val;
          return this;
      }
      
      public Book build()
      {
          return new Book(this);
      }
  }
  
  public Book(Builder builder)
  {
      title = builder.title;
      author = builder.author;
      genre = builder.genre;
      publishDate = builder.publishDate;
      ISBN = builder.ISBN;
  }
  
  public String toString()
  {
      return "Title: " + title + ", author: " + author + ", genre: " + genre.toString() + ", publish year: "
                  + publishDate + ", ISBN: " + ISBN;
  }
  
}