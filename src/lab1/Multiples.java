package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(3,5 ,1000 ));
    }

    private static int multiples(int a, int b, int n) {
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
}
