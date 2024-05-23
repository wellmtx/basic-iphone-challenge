package features.implementations;

import features.Phone;

public class Calls implements Phone {

    @Override
    public void call(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void answer() {
        System.out.println("Answering call");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting voice mail");
    }
}
