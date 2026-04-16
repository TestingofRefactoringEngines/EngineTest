class A{
 static String guessTestDataName(PsiMethod method) {
    String testName = getTestName(method);
    if (testName == null) return null;
    PsiClass psiClass = method.getContainingClass();
    if (psiClass == null) return null;
    PsiMethod prevSiblingOfType = PsiTreeUtil.getPrevSiblingOfType(method, PsiMethod.class);
    PsiMethod[] methods = psiClass.getAllMethods();
    for (PsiMethod psiMethod : methods) {
<sel>
      List<String> strings = collectTestDataByExistingFiles(psiMethod);
      if (strings != null && !strings.isEmpty()) {
        String s = strings.get(0);
        return new File(new File(s).getParent(), testName + "." + FileUtilRt.getExtension(new File(s).getName())).getPath();
      }
</sel>
    }
    return null;
  }
}