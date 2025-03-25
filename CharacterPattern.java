public class CharacterPattern {
    public static void main(String[] args) {
        char ch = 'a';

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
}

