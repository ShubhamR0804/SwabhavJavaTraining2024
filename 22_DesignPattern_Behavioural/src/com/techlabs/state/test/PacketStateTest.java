package com.techlabs.state.test;

import com.techlabs.state.model.Packet;

public class PacketStateTest {

	 public static void main(String[] args) {
	        Packet packet = new Packet();

	        // Initial state
	        packet.printCurrentStatus();

	        // Move to Received state
	        packet.goToNextState();
	        packet.printCurrentStatus();

	        // Move to Delivered state
	        packet.goToNextState();
	        packet.printCurrentStatus();

	        // Try to move to next state from Delivered (should not change)
	        packet.goToNextState();
	        packet.printCurrentStatus();

	        // Move back to Received state
	        packet.goToPreviousState();
	        packet.printCurrentStatus();

	        // Move back to Ordered state
	        packet.goToPreviousState();
	        packet.printCurrentStatus();
	    }
}
