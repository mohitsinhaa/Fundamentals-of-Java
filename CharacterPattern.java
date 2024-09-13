public class CharacterPattern {
    public static void main(String args[]) {
        int i, j;
        char ch = 'A';
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 4-i+1; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }

    }

}
