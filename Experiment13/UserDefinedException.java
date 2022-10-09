import java.util.Scanner;

class TemperatureTooLowException extends Exception
{
    TemperatureTooLowException(String msg)
    {
        super(msg);
    }
}

class UserDefinedException 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        try
        {
            double temperature = s.nextInt();
            if(temperature < 4.00)
            {
                throw new TemperatureTooLowException("Temperature is Less than 4 degree");
            }
            else
            {
            System.out.println("Input Temperature = "+temperature);
            } 
        }
        catch(TemperatureTooLowException obj)
        {
            System.out.println("Exception Caught");
            System.out.println(obj);
        }
    }
}