class A{
DirectedExpect addRespExpect(
        final GlobalTxnRecord txn,
        final PktNodeInfo fromNode,
        final PktNodeInfo toNode,
        final String description,
        final RoutedPacket pkt,
        final BitVector matchBits,
        final BitVector checkBits,
        final PacketHandler destHandler)
    {
        final DirectedExpect expect = new DirectedExpect(expectMgr, txn,
            fromNode, toNode, description, pkt, matchBits, destHandler);
        expect.setCheckPacket(checkBits);
        expect.activate();
        return expect;
    }
}