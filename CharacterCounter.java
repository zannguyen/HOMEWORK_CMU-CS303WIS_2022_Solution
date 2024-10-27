public class CharacterCounter {
    public static int countCharacter(String input, char target) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "programming in java";
        char target = 'a';
        System.out.println("Count of 'a': " + countCharacter(input, target));
    }
}
