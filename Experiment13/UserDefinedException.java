import java.util.Scanner;

class TemperatureTooLowException extends Exception
{
    double temperature;
    TemperatureTooLowException(double temperature)
    {
        super("Temperature is less than " + temperature + " degrees");
        this.temperature = temperature;
    }
}

class UserDefinedException 
{
    public static void checkTemperature(double temperature, double threshold) throws TemperatureTooLowException
    {
        if(temperature < threshold)
        {
            throw new TemperatureTooLowException(threshold);
        }
    }
    public static double inputTemperature() throws TemperatureTooLowException
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature: ");
        double temperature = sc.nextDouble();
        checkTemperature(temperature, 4);
        return temperature;
    }
    public static void main(String args[])
    {
        try
        {
            double temperature = inputTemperature();
            System.out.println("The temperature read is: " + temperature); 
        }
        catch(TemperatureTooLowException obj)
        {
            System.out.println("Exception Caught: ");
            System.out.println(obj);
        }
    }
}