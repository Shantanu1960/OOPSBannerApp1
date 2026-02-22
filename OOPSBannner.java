public class OOPSBannner {
    public static void main(String[] args) {
       
        String line1 = String.join("", "  *****   ", "  *****   ", "****** ", "   *******  ");
        System.out.println(line1);
        
        
        String line2 = String.join("", " *     *  ", " *     *  ", "**    **", " **      ");
        System.out.println(line2);
        
       
        String line3 = String.join("", "*       * ", "*       * ", "**    **", " **        ");
        System.out.println(line3);
        
        // Line 4 - Middle of letters
        String line4 = String.join("", "*       * ", "*       * ", "****** ", "   ******* ");
        System.out.println(line4);
        
        // Line 5
        String line5 = String.join("", "*       * ", "*       * ", "**        ", "       ** ");
        System.out.println(line5);
        
        // Line 6
        String line6 = String.join("", " *     *  ", " *     *  ", "**        ", "       ** ");
        System.out.println(line6);
        
        // Line 7 - Bottom borders of all letters
        String line7 = String.join("", "  *****   ", "  *****   ", "**        ", " ******* ");
        System.out.println(line7);
    }
}