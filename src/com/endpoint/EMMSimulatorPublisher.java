package com.endpoint;

import javax.xml.ws.Endpoint;
import com.ws.EMMSimulatorImpl;

public class EMMSimulatorPublisher {

	public static void main(String[] args) {
		   Endpoint.publish("http://localhost:9999/emmsimulator", new EMMSimulatorImpl());
	    }
}
