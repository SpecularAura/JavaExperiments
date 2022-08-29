import java.util.Scanner;
class FarenheitToCelsius
{
    public static int toCelsius(int farenheit)
    {
        return (farenheit - 32) * 5 / 9;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Farenheit: ");
        int fahrenheit = sc.nextInt();
        int celsius = toCelsius(fahrenheit);
        System.out.print("The temperature in Celsius: " + celsius);
    }
}