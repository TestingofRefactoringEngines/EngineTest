class A{
  public boolean isConsideredFinal(int cl) {
    return haveSeenAllExpectedAtCl(cl, countExpectedDirectlyAtCl());
  }

  private boolean haveSeenAllExpectedAtCl(int cl, int countExpectedDirectlyAtCl) {
    return cl == cl()
        && countSeenDirectlyAtCl() == countExpectedDirectlyAtCl;
  }
}