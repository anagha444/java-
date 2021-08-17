package movies;
import java.io.*;
import java.awt.Desktop;
public class action
{
void listMovies()
{
System.out.println("The file gets exported to the File directory find your");

}
public static void main(String args[])
{
 try {
      FileWriter myWriter = new FileWriter("E:/JAVAMOVIESE/movies/action.txt");
      File file = new File("E:/JAVAMOVIESE/movies/action.txt");
      Desktop desktop = Desktop.getDesktop();
      if (file.exists()) 
      desktop.open(file);
      myWriter.write("Title:Red \n Runtime:2hr \n whereToWatch:https://www.netflix.com/in/title/81408627%22");
      myWriter.write("\nTitle:6 Underground\n Runtime:2hr \n whereToWatch:https://www.netflix.com/in/title/81001887%22");
      myWriter.write("\nTitle:Anna \n Runtime::2hr \n whereToWatch:https://www.netflix.com/in/title/81112504%22");
      myWriter.close(); 
      System.out.println("Check your directory for the top list of movies under the genre");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}
}