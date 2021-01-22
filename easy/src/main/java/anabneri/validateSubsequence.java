package anabneri;

import java.util.List;

public class validateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrIndex = 0;
        int seqIndex = 0;

        while (arrIndex < array.size() && seqIndex < sequence.size()) {
            if(array.get(arrIndex).equals(sequence.get(seqIndex))) {
                seqIndex++;
            }
            arrIndex++;
        }
        return seqIndex == sequence.size();
    }
}
