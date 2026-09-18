package secao4;

public class TestClass {

    public static void main(String args[]) {
        
        //Create an instance of ComputeMethods, 
        //invoke the 3 methods and dispay their results
        ComputeMethods methods = new ComputeMethods();

        double celsius = methods.fToC(100.4);
        double hypotenuse = methods.hypotenuse(6, 9);
        int diceSum = methods.roll() + methods.roll();

        System.out.println("Temp in celsius is " + celsius);
        System.out.println("Hypotenuse is " + hypotenuse);
        System.out.println("The sum of the dice values is " + diceSum);
    }
}
