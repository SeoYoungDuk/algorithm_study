import java.util.stream.Collectors;

public class 비밀지도 {
    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(solution(5, arr1, arr2));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n + 1];

        for (int i = 0; i < n; i++) {
            int result = arr1[i] | arr2[i];
            String binary = Integer.toBinaryString(result);
            binary = addZero(n, binary);
            answer[i] = binary.chars().mapToObj(it -> it == '1' ? "#" : " ").collect(Collectors.joining());
        }

        return answer;
    }

    private static String addZero(int totalSize, String addedString) {
        int defSize = totalSize - addedString.length();
        return "0".repeat(defSize) + addedString;
    }
}
