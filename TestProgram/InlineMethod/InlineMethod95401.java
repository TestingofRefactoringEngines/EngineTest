class Bug {
    class Model<Row extends java.util.List> {
        Row getObjectAtRow(){
            return new java.util.HashSet<Row>().iterator().next();
        }
    }
    class UI<Clazz extends java.util.ArrayList>{
        public final Clazz[] getBeginAndEndSelections()
        {
          return (Clazz[])java.lang.reflect.Array.newInstance
(tableModel_.getObjectAtRow().getClass(),1);
        }  
    }
    Model<java.util.ArrayList> tableModel_;
    void foo(){
          new UI<java.util.ArrayList>().getBeginAndEndSelections();        
    }
}