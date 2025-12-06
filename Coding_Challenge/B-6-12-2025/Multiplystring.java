import java.math.BigInteger;

public class Multiplystring {

    public String multiply(String num1, String num2) {
        BigInteger n = new BigInteger(num1);
        BigInteger k = new BigInteger(num2);
        BigInteger l = n.multiply(k);
        return l.toString();
    }

    public static void main(String[] args) {
        Multiplystring obj = new Multiplystring();

        String num1 = "123456789";
        String num2 = "987654321";

        String result = obj.multiply(num1, num2);
        System.out.println("Result: " + result);
    }
}
