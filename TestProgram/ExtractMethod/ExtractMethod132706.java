class IntellijFail {
  int a = 1;
  public List<Pojo> things;

  void fool() {
    while(a == 1) {
      Pojo x = things.get(0); // from here

      if(x.it > 0.5) {
        break;
      }

      things.remove(x); // to here

      double y = 2 * x.it;
    }
    a = 2;
  }

  static class Pojo {
    double it;
    Pojo(double w) {
      it = w;
    }
  }
}