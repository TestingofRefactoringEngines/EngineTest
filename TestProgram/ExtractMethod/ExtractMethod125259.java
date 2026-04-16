class A{
final boolean b = ((THashMap<Key, Value>)newData).forEachEntry(new TObjectObjectProcedure<Key, Value>() {
        @Override
        public boolean execute(Key key, Value value) {
          try {
            myStorage.addValue(key, inputId, value);
          }
          catch (StorageException ex) {
            exceptionRef.set(ex);
            return false;
          }
          return true;
        }
      });
}