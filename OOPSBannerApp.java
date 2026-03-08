public class OOPSBannerApp {

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap createO() {
        String[] pattern = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
        return new CharacterPatternMap('O', pattern);
    }

    public static CharacterPatternMap createP() {
        String[] pattern = {
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
        return new CharacterPatternMap('P', pattern);
    }

    public static CharacterPatternMap createS() {
        String[] pattern = {
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
        return new CharacterPatternMap('S', pattern);
    }

    public static void main(String[] args) {

        CharacterPatternMap o = createO();
        CharacterPatternMap p = createP();
        CharacterPatternMap s = createS();

        CharacterPatternMap[] word = {o, o, p, s};

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap c : word) {
                line.append(c.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}
