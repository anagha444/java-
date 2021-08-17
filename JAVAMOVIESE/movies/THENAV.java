package movies;

public class THENAV 
{
public void display()
{
System.out.println("Genre Picker");
}
public static void main(String args[])
{
Genre G = new Genre();
try{
G.choice();
}catch(Exception e){System.out.println("[-_-]");
}
}
}