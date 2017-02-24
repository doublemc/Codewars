package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by michalc94 on 24.02.17.
 *
 * https://www.codewars.com/kata/55de8eabd9bef5205e0000ba
 */
class Emirps {

    static long[] findEmirp(long limit) {
        int count = 0;
        long maxValue = 0;
        long sum = 0;
        long[] reversedPrimes = findReversedPrimes(limit);
        for (int i = 0; i < reversedPrimes.length; i++) {
            count++;
            sum += reversedPrimes[i];
            maxValue = reversedPrimes[i];
        }
        return new long[] {count, maxValue, sum};

    }

    static long[] findReversedPrimes(long limit) {
        long[] allPrimes = findPrimes(limit);
        List<Long> primeList = Arrays.stream(allPrimes).boxed().collect(Collectors.toList());

        List<Long> reversedPrimes = new ArrayList<>();
        for (long prime : primeList) {
            if (isPrime(getReverseLong(prime)) && !isItPalin(prime)) {
                reversedPrimes.add(prime);
            }
        }
        return reversedPrimes.stream().mapToLong(i -> i).toArray();
    }

     static long[] findPrimes(long limit) {
        List<Long> primes = new ArrayList<>();
        for (long i = 1; i < limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes.stream().mapToLong(i -> i).toArray();
    }

    private static boolean isPrime(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static long getReverseLong(long value) {
        long reverse = Long.parseLong(new StringBuilder(String.valueOf(value)).reverse().toString());
        return reverse;
    }

    private static boolean isItPalin(long prime) {
        return prime == getReverseLong(prime);
    }
}
