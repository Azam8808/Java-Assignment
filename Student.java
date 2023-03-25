
public class Student {
    int rollNumber;
    String name;
    double height;
    public void talk()
    {
        System.out.println("My name is\n" +name);
        System.out.println("My rollNumber is\n" +rollNumber);
        System.out.println("My height is\n" +height);
    }
 public static void main (String args[])
 {
    Student azam = new Student ();
    azam.rollNumber = 111;
    azam.name = "Azam";
    azam.height = 5.4;
    azam.talk();
 }

}