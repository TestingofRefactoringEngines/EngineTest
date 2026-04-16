 interface Nameable {

    @NotNull String getName();

}
 record User(String name) implements Nameable {

    @Override
    public @NotNull String getName() {
        return name;
    }

}