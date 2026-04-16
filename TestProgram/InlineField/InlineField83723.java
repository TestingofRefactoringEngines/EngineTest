class BracketTextExtractor {
    public static String extractTextInBrackets(String input) {
        Pattern pattern = Pattern.compile("\\[(.*?)\\]");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static void main(String[] args) {
        String asd = "[this_text_with_braces_should_be_selected]aaaaaaaaaaaaa$";
        String result = extractTextInBrackets(asd);
        System.out.println(result);
    }
}    