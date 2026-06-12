import java.net.InetAddress;

public class InetAddressTutorial {
    public static void main(String[] args) {
        try {
            InetAddress add = InetAddress.getLocalHost();
            InetAddress a = InetAddress.getByName("www.google.com");
            InetAddress[] ap = InetAddress.getAllByName("www.youtube.com");
            System.out.println("IP Address : "+add);
            System.out.println("IP Address of google : "+a);
            for(InetAddress as : ap){
                System.out.println("Multipal IP : "+as);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
