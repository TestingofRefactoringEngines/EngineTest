class RefactoringDemo
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("example");
        analyzeFile(file);
    }
    
    private static void analyzeFile(final File file) throws
java.io.FileNotFoundException
    {
        Scanner scanner = new Scanner(file);
        
        while(scanner.hasNext())
        {
            String nextLine = scanner.nextLine();
            System.out.println(nextLine);
        }
    }

}