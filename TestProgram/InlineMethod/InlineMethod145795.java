 class Example
{
    public static void main(String[] args)
    {
        int x = 2;
        System.out.println(getString(x + 2, " suffix"));
    }

    private static String getString(int number, String suffix)
    {
        return "prefix " + number + suffix;
    }
}