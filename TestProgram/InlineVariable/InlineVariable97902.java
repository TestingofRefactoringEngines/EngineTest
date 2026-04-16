class A{
  private static void checkModifierIsNotAllowedImpl(@NotNull GrModifierList modifierList,
                                                    @NotNull @GrModifier.GrModifierConstant String modifier,
                                                    @Nullable String message,
                                                    @NotNull AnnotationHolder holder, 
                                                    final boolean explicit) {
    final boolean has = explicit ? modifierList.hasModifierProperty(modifier) : modifierList.hasExplicitModifier(modifier);
    if (has) {
      PsiElement toHighlight = PsiUtil.findModifierInList(modifierList, modifier);
      if (toHighlight == null) toHighlight = modifierList;
      final Annotation annotation = holder.createErrorAnnotation(toHighlight, message);
      annotation.registerFix(new GrModifierFix((PsiMember)modifierList.getParent(), modifierList, modifier, true, false));
    }
  }
}