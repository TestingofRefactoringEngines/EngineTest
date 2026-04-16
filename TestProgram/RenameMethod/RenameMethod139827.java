 class Test {

  {
    Season.values();
    Season.va<caret>lueOf(""); //perform rename at me
  }

  enum Season {WINTER, SPRING, SUMMER, AUTUMN}
}