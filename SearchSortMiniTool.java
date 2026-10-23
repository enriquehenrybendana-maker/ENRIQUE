import java.util.Arrays;

public class SearchSortMiniTool {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88, 76, 95, 80};
        int target = 92;
        int index = -1;

        // Linear search
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Target " + target + " found at index " + index);
        } else {
            System.out.println("Target " + target + " not found.");
        }

        // Sort a copy so the original order remains unchanged.
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        System.out.println("Original array: " + Arrays.toString(scores));
        System.out.println("Sorted array: " + Arrays.toString(sortedScores));
    }
}