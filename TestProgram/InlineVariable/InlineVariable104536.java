class A{
@Override
public boolean isDefault() {
    final List<GrCaseLabel> labels = findChildrenByType(GroovyElementTypes.CASE_LABEL);
    for (GrCaseLabel label : labels) {
      if (label.isDefault()) return true;
    }
    return false;  
  }
}