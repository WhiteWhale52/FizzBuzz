package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3,5 ));
    }

    public static int multiples(int n, int a, int b) {
        int numberOfMultiplesOfaOrb = 0;
        int i = 1;
        while(i<n){
            boolean DBa = i % a == 0;
            boolean DBb = i % b == 0;

            if (DBa || DBb) numberOfMultiplesOfaOrb++;
            i++;
        }
        return numberOfMultiplesOfaOrb;
    }

    public static int multiples() {
        return multiples(1000, 3,5);
    }
}
