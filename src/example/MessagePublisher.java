package example;

import javafx.application.Application;
import javafx.stage.Stage;

import javax.xml.ws.Endpoint;

public class MessagePublisher{

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ws/message",  new MessageImpl());
    }

}
