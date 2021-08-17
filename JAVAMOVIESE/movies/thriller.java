package movies;
import java.awt.Desktop;
import java.io.*;
public class thriller
{
void listMovies()
{
System.out.println("The file gets exported to the File directory find your");

}
public static void main(String args[])
{
 try {
      FileWriter myWriter = new FileWriter("E:/JAVAMOVIESE/movies/thriller.txt");
      File file = new File("E:/JAVAMOVIESE/movies/thriller.txt");
      Desktop desktop = Desktop.getDesktop();
      if (file.exists()) 
      desktop.open(file);
      myWriter.write("MOVIES");
      myWriter.write("\nTitle:RUN ON \n Runtime:2hr \n whereToWatch:https://www.netflix.com/in/title/81318872");
      myWriter.write("\nTitle: Extinction\n Runtime:2hr \n whereToWatch:https://www.netflix.com/in/title/80236421");
      myWriter.write("\nTitle:Mirage \n Runtime::2hr \n whereToWatch:https://www.netflix.com/in/title/80991158");
      myWriter.close(); 
      System.out.println("Check your directory for the top list of movies under the genre");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}
}