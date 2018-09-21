package com.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.ws.EMMSimulator;
 
public class EMMSimulatorClient {
 
	public static void main(String[] args) throws Exception {
 
		URL url = new URL("http://localhost:9999/emmsimulator?wsdl");
 
        //1st argument service URI, refer to wsdl document above
		//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://www.csapi.org/schema/parlayx/payment/reserve_amount_charging/v2_0/local", "EMMSimulatorImplService");
 
        Service service = Service.create(url, qname);
 
        EMMSimulator simulator = service.getPort(EMMSimulator.class);
    
    }
 
}
