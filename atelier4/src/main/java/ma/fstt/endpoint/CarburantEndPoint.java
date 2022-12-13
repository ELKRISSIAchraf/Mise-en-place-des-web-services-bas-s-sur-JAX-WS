package ma.fstt.endpoint;

import javax.xml.ws.Endpoint;

import ma.fstt.Ws.CarburantJpaImp;


public class CarburantEndPoint {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7777/ws/Carburant",new CarburantJpaImp() );
System.out.println("rrrrrrrrrrrrr");
	}
}
