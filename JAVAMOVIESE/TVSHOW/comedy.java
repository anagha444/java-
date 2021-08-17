package TVSHOW;
import java.io.*;
import java.awt.Desktop;
public class comedy
{
void listtvshows()
{
System.out.println("The file gets exported to the File directory find your");

}
public static void main(String args[])
{

 try {
      FileWriter myWriter = new FileWriter("E:/JAVAMOVIESE/TVSHOW/comedy.txt");
      File file = new File("E:/JAVAMOVIESE/TVSHOW/comedy.txt");
      Desktop desktop = Desktop.getDesktop();
      if (file.exists()) 
      desktop.open(file);
      myWriter.write("\nTitle:I am not okay with this \n whereToWatch:https://www.netflix.com/in/title/80244781%22");
      myWriter.write("\nTitle:Alexa and Katie\n whereToWatch:https://www.netflix.com/in/title/80174285%22");
      myWriter.write("\nTitle:The good place\n whereToWatch :https://www.netflix.com/in/title/80113701%22");

      myWriter.close(); 
      System.out.println("Check your directory for the top list of tv shows under the genre");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}
}