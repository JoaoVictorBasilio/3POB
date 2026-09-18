package secao3;

public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte
        short shortValue = 128;
        System.out.println((byte) shortValue);

        byte byteValue = 127;
        //Add 1 to this variable and print it
        byteValue++;
        System.out.println(byteValue);

        //Add 1 to this variable again and print it again
        byteValue++;
        System.out.println(byteValue);
    }    
}
