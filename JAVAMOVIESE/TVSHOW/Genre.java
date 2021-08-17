package TVSHOW;
import java.util.*;
public class Genre extends Romance
{
char genre;
Scanner GG = new Scanner(System.in);
public void dis()
{
System.out.println("You landed into Genre picker");
}
public void choice()throws Exception
{
System.out.println("/////--////GENRE's are Listed below please select one//////-////");
System.out.println("\n COMedy\nRomance\nThriller\nHorror");
String genre = GG.nextLine();
switch(genre)
{
case "comedy":
case "Comedy":
Comedy C = new Comedy();
C.listtvshows();
System.out.println("COMEDY IT IS");
break;
case "Romance":
case "romance":
Romance R = new Romance();
R.listtvshows();
//System.out.println("Romance it is");
break;
case "Horror":
case "horror":
horror h =new horror();
h.listtvshows();
break;
case "thriller":
case "Thriller":
thriller T = new thriller();
T.listtvshows();
System.out.println("Thriller");
break;
case "action":
case "Action":
action a = new action();
a.listtvshows();
default: System.out.println("Illegal  choice "+genre);
throw new Exception("What alienated script is that");
}
}
public static void main(String args[])
{
Genre a = new Genre();
try{
a.choice();
}catch(Exception e){System.out.println("[-_-]");
}
}
}
