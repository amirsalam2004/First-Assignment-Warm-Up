public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public long factorial(int n) {
        int factorial_number=1;
        for(int i=1;i<=n;i++)
            factorial_number*=i;g
        return factorial_number;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
        if(n==1 || n==2)
            return(1);
        return(fibonacci(n-1)+fibonacci(n-2));
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows) {
        // TODO
        return null;
    }


    public static void main(String[] args) {
        //salam
    }

}