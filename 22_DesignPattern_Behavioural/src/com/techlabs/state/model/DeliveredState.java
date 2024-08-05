package com.techlabs.state.model;

public class DeliveredState implements IPacketState {
    @Override
    public void next(Packet packet) {
        System.out.println("The packet is already Delivered.");
    }

    @Override
    public void previous(Packet packet) {
        packet.setState(new ReceivedState());
    }

    @Override
    public void current(Packet packet) {
        System.out.println("The packet is currently Delivered.");
    }

}
