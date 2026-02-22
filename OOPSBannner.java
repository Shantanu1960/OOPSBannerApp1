public class OOPSBannner {
    public static void main(String[] args) {
        // UC4: String Array to store all lines of the OOPS banner
        String[] bannerLines = new String[7];
        
        // Populate array with each line using String.join()
        bannerLines[0] = String.join("", "  *****   ", "  *****   ", "****** ", "   *******  ");
        bannerLines[1] = String.join("", " *     *  ", " *     *  ", "**    **", " **      ");
        bannerLines[2] = String.join("", "*       * ", "*       * ", "**    **", " **        ");
        bannerLines[3] = String.join("", "*       * ", "*       * ", "****** ", "   ******* ");
        bannerLines[4] = String.join("", "*       * ", "*       * ", "**        ", "       ** ");
        bannerLines[5] = String.join("", " *     *  ", " *     *  ", "**        ", "       ** ");
        bannerLines[6] = String.join("", "  *****   ", "  *****   ", "**        ", " ******* ");
        
        // Enhanced for-each loop to iterate through array and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}