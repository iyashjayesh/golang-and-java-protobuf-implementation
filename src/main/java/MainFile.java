import java.io.IOException;

public class MainFile {
    public static void main(String[] args) throws IOException {

        SimpleMessageOuterClass.SimpleMessage Message1 = SimpleMessageOuterClass.SimpleMessage.newBuilder()
                .setName("Yash Chauhan")
                .setEmail("iyashjayesh@gamil.com")
                .setAge(21)
                .setIsAProgrammer(true).build();

        // now here we'll set the message proto model to the new message model and see
        // the data is set or not
        SimpleMessageOuterClass.SimpleMessage Message2;
        Message2 = SimpleMessageOuterClass.SimpleMessage.parseFrom(Message1.toByteArray());

        System.out.println("Name From Message: " + Message2.getName());
        System.out.println("Email From Message: " + Message2.getEmail());
        System.out.println("Age From Message: " + Message2.getAge());
        System.out.println("IsAProgrammer From Message: " + Message2.getIsAProgrammer());
    }
}
