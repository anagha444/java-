package movies;
import java.io.*;
import java.awt.Desktop;
public class horror
{
void listmovies()
{
System.out.println("The file gets exported to the File directory find your");
}
public static void main(String args[])
{

 try {
      FileWriter myWriter = new FileWriter("E:/JAVAMOVIESE/movies/horror.txt");
      File file = new File("E:/JAVAMOVIESE/movies/horror.txt");
      Desktop desktop = Desktop.getDesktop();
      if (file.exists()) 
      desktop.open(file);
      myWriter.write("\nTitle:Bulbbul \n whereToWatch:https://www.netflix.com/in/title/81029150");
      myWriter.write("\nTitle:Girl on the third floor\n whereToWatch :https://www.netflix.com/in/title/81082119");
      myWriter.write("\nTitle:Eli\n whereToWatch :https://www.netflix.com/in/title/80206910");
      myWriter.close(); 
      System.out.println("Check your directory for the top list of movies");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}
}
 