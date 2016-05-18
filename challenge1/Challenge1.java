import java.math.BigInteger;

class Challenge1 {
    Challenge1() {
    }

    public static void main(String[] var0) {
        for(int var1 = 0; var1 <= 101; ++var1) {
            BigInteger var2 = BigInteger.valueOf((long)var1);
            if(var2.isProbablePrime(1)) {
                System.out.println(var1);
            }
        }

    }
}
