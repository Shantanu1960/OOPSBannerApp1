public class OOPSBannner {
    public static void main(String[] args) {
        // UC5: Inline array initialization using String.join() calls
        String[] bannerLines = new String[] {
            String.join("", "  *****   ", "  *****   ", "****** ", "   *******  "),
            String.join("", " *     *  ", " *     *  ", "**    **", " **      "),
            String.join("", "*       * ", "*       * ", "**    **", " **        "),
            String.join("", "*       * ", "*       * ", "****** ", "   ******* "),
            String.join("", "*       * ", "*       * ", "**        ", "       ** "),
            String.join("", " *     *  ", " *     *  ", "**        ", "       ** "),
            String.join("", "  *****   ", "  *****   ", "**        ", " ******* ")
        };
        
        // Enhanced for-each loop to iterate through array and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}