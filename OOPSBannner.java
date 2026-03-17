public class OOPSBannner {
    
    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;
        
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        
        public char getCharacter() {
            return character;
        }
        
        public String[] getCharacterPattern() {
            return pattern;
        }
    }
    
    private static String[] buildO() {
        return new String[] {
            String.join("", "  ", "*****", "   "),
            String.join("", " ", "*     *", "  "),
            String.join("", "", "*       *", " "),
            String.join("", "", "*       *", " "),
            String.join("", "", "*       *", " "),
            String.join("", " ", "*     *", "  "),
            String.join("", "  ", "*****", "   ")
        };
    }

    private static String[] buildP() {
        return new String[] {
            String.join("", "******", " "),
            String.join("", "**", "    ", "**"),
            String.join("", "**", "    ", "**"),
            String.join("", "******", " "),
            String.join("", "**", "        "),
            String.join("", "**", "        "),
            String.join("", "**", "        ")
        };
    }

    private static String[] buildS() {
        return new String[] {
            String.join("", "   ", "*******", "  "),
            String.join("", " ", "**", "      "),
            String.join("", " ", "**", "        "),
            String.join("", "   ", "*******", " "),
            String.join("", "       ", "**", " "),
            String.join("", "       ", "**", " "),
            String.join("", " ", "*******", " ")
        };
    }

    public static void main(String[] args) {
        CharacterPatternMap patternO = new CharacterPatternMap('O', buildO());
        CharacterPatternMap patternO2 = new CharacterPatternMap('O', buildO());
        CharacterPatternMap patternP = new CharacterPatternMap('P', buildP());
        CharacterPatternMap patternS = new CharacterPatternMap('S', buildS());

        CharacterPatternMap[] characters = {patternO, patternO2, patternP, patternS};

        for (int lineIndex = 0; lineIndex < 7; lineIndex++) {
            StringBuilder bannerLine = new StringBuilder();
            
            for (CharacterPatternMap charPattern : characters) {
                bannerLine.append(charPattern.getCharacterPattern()[lineIndex]);
            }
            
            System.out.println(bannerLine.toString());
        }
    }
}