/**
 * Created by willmetz on 5/18/16.
 */
public class ChallengeOne {

    public static void main( String[] args )
    {
        for( int i = 1; i < 101; i++ ){
            if( isPrime(i) ) {
                System.out.println( String.valueOf(i) );
            }
        }
    }

    public static boolean isPrime( int num )
    {
        if( num == 1 || num == 2 ) {
            return true;
        }

        for( int i = 2; i <= (num/2); i++ ) {
            if( num % i == 0 ) {
                return false;
            }
        }

        return true;
    }

}