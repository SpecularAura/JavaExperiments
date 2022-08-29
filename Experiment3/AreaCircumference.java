import java.util.Scanner;
class AreaCircumference
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle");
        int radius = sc.nextInt();
        double area = Math.PI*Math.pow(radius, 2);
        double circumference = 2*Math.PI*radius;
        System.out.println("The circumference is " + circumference +" and the Area is "+ area);
    }
}