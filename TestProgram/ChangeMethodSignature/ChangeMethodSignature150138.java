@FunctionalInterface
interface Operation<KeyT, PayloadT> {
    void perform(PayloadT payload, KeyT key);
}