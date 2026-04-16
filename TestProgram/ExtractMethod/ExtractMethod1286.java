class A{
    public double amount() {
      return switch (getMovie().getPriceCode()) {
        case Movie.REGULAR -> {
          if (daysRented > 2) {
            yield regularPenalty();
          }
          yield REGULAR_BASE_AMOUNT;
        }
        default -> 0; 
      };
    }
}