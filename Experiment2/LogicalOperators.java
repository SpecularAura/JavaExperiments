class LogicalOperators
{
    public static void main(String args[])
    {
        boolean a = false;
        boolean b = false;
        System.out.println("A | B | !A  | A && B  | A || B ");
        for(int i = 0; i < 4; i++)
        {
            if( i == 2){a = !a;}
            System.out.printf("%d | %d |  %d  |    %d    |    %d  \n", a ? 1 : 0, b ? 1 : 0, (!a ? 1 : 0), (a && b ? 1 : 0), (a || b ? 1 : 0));
            b = !b;
        }
    }
}