class A{
   public static String replaceProcessID(String content, String processId) {
        content  = content.replaceAll(prozessInstanzIdPattern, "<base:ProzessInstanzID>" + processId +"</base:ProzessInstanzID>");
        return content;
    }
}