package TVSHOW;
import java.awt.Desktop;
import java.io.*;
public class action
{
void listtvshows()
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
      myWriter.write("Title:Undercover \n whereToWatch:https://www.netflix.com/in/title/80192098%22");
      myWriter.write("\nTitle:Cursed\n whereToWatch:https://www.netflix.com/in/title/80199393%22");
      myWriter.write("\nTitle:Titans\n whereToWatch:https://www.netflix.com/in/title/80218200%22");

      myWriter.close(); 
      System.out.println("Check your directory for the top list of tv shows under the genre");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}
}