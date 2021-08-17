package movies;
import java.util.*;
public class Genre extends Romantic
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
C.main(null);
System.out.println("COMEDY IT IS");
break;
case "Romance":
case "romance":
Romantic R = new Romantic();
R.main(null);
break;
case "Horror":
case "horror":
horror h = new horror();
h.main(null);
break;
case "thriller":
case "Thriller":
thriller T = new thriller();
T.main(null);
break;
case "action":
case "Action":
action a = new action();
a.main(null);
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