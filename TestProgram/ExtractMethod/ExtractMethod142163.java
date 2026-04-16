class A{
default BitSet test(final List<T> items) {
    try {
      return ourPredicatesCache.get(Pair.create(this, items), () -> {
        final BitSet result = new BitSet(items.size());
        for (int i = 0; i < items.size(); i++) {
          result.set(i, test(items.get(i)));
        }
        return result;
      });
    } catch (final ExecutionException e) {
      Logs.error(e);
      throw new RuntimeException(e);
    }
  }  
}