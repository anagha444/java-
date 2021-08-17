package movies;
import java.io.*;
import java.awt.Desktop;
public class Romantic
{
void listMovies()
{
System.out.println("The file gets exported to the File directory find your");

}
public static void main(String args[])
{
 try {
      FileWriter myWriter = new FileWriter("E:/JAVAMOVIESE/movies/Romance.txt");
      File file = new File("E:/JAVAMOVIESE/movies/Romance.txt");
      Desktop desktop = Desktop.getDesktop();
      if (file.exists()) 
      desktop.open(file);
      myWriter.write("Title:Holidate \n Runtime:2hr \n whereToWatch:https://www.netflix.com/in/title/81034553");
      myWriter.write("\nTitle: Five feet apart Holidate \n Runtime:2hr \n whereToWatch:https://www.netflix.com/in/title/80236271");
      myWriter.write("\nTitle:Kabir singh \n Runtime:2hr \n whereToWatch:https://www.netflix.com/in/title/81107545");
      myWriter.close(); 
      System.out.println("Check your directory for the top list of movies under the genre");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}
}