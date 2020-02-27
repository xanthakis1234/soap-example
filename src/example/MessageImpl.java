package example;

import javax.jws.WebService;

@WebService(endpointInterface = "example.Message")
public class MessageImpl implements Message{
    public String getUpperCaseMessage(String message){
        return message.toUpperCase();
    }
}
