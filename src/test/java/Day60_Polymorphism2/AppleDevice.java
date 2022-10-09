package Day60_Polymorphism2;

public class AppleDevice {
    public void use() {
        System.out.println("APPLEDEVICE | RUN");
    }
}
class Mac extends AppleDevice {

    public void use() {
        System.out.println("MAC RUN");
    }

    public void code() {
        System.out.println("Mac is coding....");
    }
}
class Ipad extends AppleDevice {
    public void use() {
        System.out.println("IPAD RUN");
    }

    public void draw() {
        System.out.println("Drawing is Ipad....");
    }
}
class AppleWatch extends AppleDevice {
    public void use() {
        System.out.println("AppleWatch RUN");
    }

    public void wear() {
        System.out.println("Wearing is AppleWatch....");
    }
}
class AppleStore{
    public static void main(String[] args) {
        AppleDevice mac = new AppleDevice();
        mac.use();// APPLEDEVICE | RUN

        AppleDevice mac1 = new Mac();
        mac1.use();// MAC RUN
        // mac1.code();

        Mac mac2 = new Mac();
        mac2.use();// MAC RUN
        mac2.code();// Mac is coding....

        AppleDevice watch = new AppleWatch();
        watch.use();// AppleWatch RUN
    }
        }
