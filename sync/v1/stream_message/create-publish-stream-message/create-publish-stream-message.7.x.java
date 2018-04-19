// Install the Java helper library from twilio.com/docs/java/install

import com.twilio.Twilio;
import com.twilio.rest.sync.v1.service.syncstream.StreamMessage;

public class Example {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "your_auth_token";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        StreamMessage streamMessage = StreamMessage.creator(
                "ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
                "MyStream",
                new java.util.HashMap<String, Object>()
                {{
                put("id", "bob");
                put("x", "256");
                put("y", "42");
                }})
            .create();

        System.out.println(streamMessage.getSid());
    }
}