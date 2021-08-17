package movies;
import java.io.*;
import java.awt.Desktop;
public class Comedy
{
void listMovies()
{
System.out.println("The file gets exported to the File directory find your");
}
public static void main(String args[])
{
 try {
      FileWriter myWriter = new FileWriter("E:/JAVAMOVIESE/movies/comedy.txt");
      File file = new File("E:/JAVAMOVIESE/movies/comedy.txt");
      Desktop desktop = Desktop.getDesktop();
      if (file.exists()) 
      desktop.open(file);
      myWriter.write("MOVIES");
      myWriter.write("\nTitle:Shimla Mirchi \n Runtime:2hr \n whereToWatch:https://www.netflix.com/in/title/81078032%22");
      myWriter.write("\nTitle: Yes Day\n Runtime:2hr \n whereToWatch:https://www.netflix.com/in/title/81011712%22");
      myWriter.write("\nTitle:Murder mistery\n Runtime::2hr \n whereToWatch:https://www.netflix.com/in/title/80242619%22");
      myWriter.close();
      System.out.println("Check your directory for the top list of movies under the genre");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}
}