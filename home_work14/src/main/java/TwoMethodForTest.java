import java.util.stream.IntStream;

public class TwoMethodForTest {

    public static int[] getSubArray(int[] mass) {
        int[] newMass = new int[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 4) {
                newMass = new int[mass.length - 1 - i];
                for (int j = 0; j < newMass.length; j++) {
                    newMass[j] = mass[i + 1 + j];
                }
            }
        }
        if (newMass.length == 0) {
            throw new RuntimeException();
        }
        return newMass;
    }

    public static boolean isHaveNumbers(int[] mass) {
        return IntStream.of(mass).anyMatch(x -> x == 4) && IntStream.of(mass).anyMatch(y -> y == 1);
    }


}
