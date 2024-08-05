package com.techlabs.state.model;

public class ReceivedState implements IPacketState {
    @Override
    public void next(Packet packet) {
        packet.setState(new DeliveredState());
    }

    @Override
    public void previous(Packet packet) {
        packet.setState(new OrderedState());
    }

    @Override
    public void current(Packet packet) {
        System.out.println("The packet is currently Received.");
    }

}
