class RegexMatcher {
    private Pattern pattern;

    public RegexMatcher(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    public Pattern getPattern() {
        return pattern;
    }

    public boolean matchLine(String line) {
        return getPattern().matcher(line).matches();
    }

    public static void main(String[] args) {
        RegexMatcher matcher = new RegexMatcher("\\d+");
        String testLine = "123";
        boolean result = matcher.matchLine(testLine);
        System.out.println(result);
    }
}    