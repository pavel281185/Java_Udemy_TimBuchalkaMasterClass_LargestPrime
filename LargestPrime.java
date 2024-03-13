public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number < 2){
            return -1;
        }
        if(number == 2){
            return 2;
        }
        int i = number;
        while(i > 1){
            if(number % i == 0){
                boolean isPrime = true;
                int j = i - 1;
                while (j > 1){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                    j--;
                }
                if(isPrime){
                    return i;
                }
            }
            i--;
        }
        return -1;
    }
}
