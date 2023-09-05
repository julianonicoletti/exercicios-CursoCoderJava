package oo.Desafios;
import java.math.BigInteger;
public class BigInteger2 {
    public static void main(String[] args) {
        BigInteger i1 = new BigInteger("111111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("222222222222222222222222222222222222222222222222222");
        BigInteger i3 = new BigInteger(i1.add(i2).toByteArray());
        System.out.println(i3);
        System.out.println(i1.multiply(i2));


    }

}
