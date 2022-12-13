package ma.fstt.endpoint;

import javax.xml.ws.Endpoint;

import ma.fstt.Ws.StationJpaImp;
public class StationEndPoint {
public static void main(String[] args) {
		Endpoint.publish("http://localhost:7777/ws/Station",new StationJpaImp() );
System.out.println("rrrrrrrrrrrrr");
	}
}