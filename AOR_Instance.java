//calculate area of ractange using nstance variable

class AOR_Instance {
int length;
int breath;
double area;
public void calculate_area()
{
    area = length*breath;
    System.out.println("Area of Ractangle\n" +area);
}

    public static void main(String args[])
    {
        AOR_Instance A1 = new AOR_Instance();
        A1.length=4;
        A1.breath=6;
        A1.calculate_area();
    }
}