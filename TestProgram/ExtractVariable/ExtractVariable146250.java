 class LambdaTest
    {

        //~ Methods ------------------------------------------------------------

        public void foo(Class<?> cls)
        {
            Stream.of(cls.getMethods())
                  .filter(method ->
                          Collection.class.isAssignableFrom(
                              method.getReturnType())
                          || Map.class.isAssignableFrom(method.getReturnType()))
                  .collect(Collectors.<Method>toList());
        }
    }