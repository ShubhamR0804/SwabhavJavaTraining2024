package com.techlabs.state.model;

public class OrderedState implements IPacketState {

	@Override
    public void next(Packet packet) {
        packet.setState(new ReceivedState());
    }

    @Override
    public void previous(Packet packet) {
        System.out.println("The packet is in its initial state.");
    }

    @Override
    public void current(Packet packet) {
        System.out.println("The packet is currently Ordered.");
    }

}
