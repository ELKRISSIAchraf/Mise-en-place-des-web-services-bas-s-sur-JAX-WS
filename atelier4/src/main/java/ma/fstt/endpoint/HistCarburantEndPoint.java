package ma.fstt.endpoint;

import javax.xml.ws.Endpoint;

import ma.fstt.Ws.HistCarburantJpaImp;

public class HistCarburantEndPoint {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7777/ws/HistCarburant",new HistCarburantJpaImp() );
System.out.println("rrrrrrrrrrrrr");
	}
}
