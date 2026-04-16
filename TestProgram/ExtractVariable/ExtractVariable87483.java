 class Base {
   public class inner {}
}

 class Derrived extends Base {
   public void foo() {
       inner bar = new inner();
   }
}
