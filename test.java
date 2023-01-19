public class Variables{
    public static void main(String[] args) { 
        int sum = Add(200, 222); 
        System.out.println("The Sum is: "+ sum);
    }
    public static int Add(int firstNumber, int SecondNumber){
        int sum = firstNumber+SecondNumber; 
        return sum; 
    }
}