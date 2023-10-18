package de.telran.baibak.iryna.cw2;

public class SmartPhone extends Phone {

    String internetProvider;
    Calculator calc;
    public SmartPhone(String internetProvider) {
        super("", "", 1);
        this.internetProvider = internetProvider;
        this.calc = new Calculator();
    }

    @Override
    public void receiveCall(String whoCall) {
        System.out.println("уважаемый владелец смартфона");
        super.receiveCall(whoCall);

    }

    void googleInInternet() {
        System.out.println("я гуглю в телефоне через " + this.model);
    }
    public Calculator getCalc() {
        return  calc;
    }

}
