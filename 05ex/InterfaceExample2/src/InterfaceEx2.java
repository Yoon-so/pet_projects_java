interface PhoneInterface {
    final int TIMEOUT = 10000;
    void sendCall();
    void receiveCall();
    default void printLogo() {
        System.out.println("** Phone **");
    }
}
interface MobilePhoneInterface extends PhoneInterface {
    void sendSMS();
    void receiveSMS();
}
interface MP3Interface {
    public void play();
    public void stop();
}
class PDA {
    public int calculate(int x, int y) {
        return x + y;
    }
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
    @Override
    public void sendCall() {
        System.out.println("Call is sent.");
    }

    @Override
    public void receiveCall() {
        System.out.println("Call is received.");
    }

    @Override
    public void sendSMS() {
        System.out.println("SMS is sent.");
    }

    @Override
    public void receiveSMS() {
        System.out.println("SMS is received.");
    }

    @Override
    public void play() {
        System.out.println("Music is playing.");
    }

    @Override
    public void stop() {
        System.out.println("Music is stopped.");
    }
    public void schedule() {
        System.out.println("Schedule is set.");
    }
}
public class InterfaceEx2 {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.printLogo();
        phone.sendCall();
        phone.play();
        System.out.println("3 + 5 = " + phone.calculate(3, 5));
        phone.schedule();
    }
}
