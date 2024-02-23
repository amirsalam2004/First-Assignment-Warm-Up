public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public long factorial(int n) {
        int factorial_number=1;
        for(int i=1;i<=n;i++)
            factorial_number*=i;
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
        char[][] triangle=new char[rows][];
        for(int i=1;i<=rows;i++){
            triangle[i-1]=new char[i];
            for(int j=0;j<i;j++){
                triangle[i-1][j]='*';
            }
        }
        return triangle;
    }


    public static void main(String[] args) {
        //salam
    }

}