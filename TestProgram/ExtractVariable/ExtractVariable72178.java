class A {}
 class C
{
   b.A method()
   {
      return new b.A();
   }
   
   void failHere()
   {
      method(); //extract local variable here
   }
}