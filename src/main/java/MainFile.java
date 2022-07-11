import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainFile {
//    public static void main(String[] args) throws IOException {
//
//        // Jobupdate.JobUpdateBean message = Jobupdate.JobUpdateBean.newBuilder().setReceivedOn(122).setDesc("Test")
//        //         .build();
//
//        // // System.out.println("Message In Byte " + message);
//
//        // // proto marshal the message
//        // // byte[] bytes = message.toByteArray();
//        // // System.out.println("Message In Byte " + bytes);
//
//        // System.out.println(message.toString());
//
//        // Jobupdate.JobUpdateBean message2 = null;
//        // try {
//        //     message2 = Jobupdate.JobUpdateBean.parseFrom(message.toByteString());
//        // } catch (InvalidProtocolBufferException e) {
//        //     throw new RuntimeException(e);
//        // }
//        // // System.out.println(message2.toString());
//        // // System.out.println(message2.getReceivedOn());
//        // // System.out.println(message2.getDesc());
//
//        // proto unmarshal the message
//        Jobupdate.JobUpdateBean test;
//        byte[] bytes2 = Files.readAllBytes(Paths.get("src/main/java/test.txt"));
//        try {
//            test = Jobupdate.JobUpdateBean.parseFrom(bytes2);
//            System.out.println("getReceivedOn " + test.toString());
//            System.out.println("getReceivedOn Working "+ test.getReceivedOn());
//            System.out.println("getDesc Working " +test.getDesc());
//        } catch (InvalidProtocolBufferException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static void main(String[] args) throws IOException {

        SimpleMessageOuterClass.SimpleMessage Message1 = SimpleMessageOuterClass.SimpleMessage.newBuilder()
                .setName("Yash Chauhan")
                .setEmail("iyashjayesh@gamil.com")
                .setAge(21)
                .setIsAProgrammer(true).build();

        // now here we'll set the message proto model to the new message model and see the data is set or not
        SimpleMessageOuterClass.SimpleMessage Message2;
        Message2 = SimpleMessageOuterClass.SimpleMessage.parseFrom(Message1.toByteArray());

        System.out.println("Name From Message: " + Message2.getName());
        System.out.println("Email From Message: " + Message2.getEmail());
        System.out.println("Age From Message: " + Message2.getAge());
        System.out.println("IsAProgrammer From Message: " + Message2.getIsAProgrammer());
    }
}
