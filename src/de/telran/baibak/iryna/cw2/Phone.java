package de.telran.baibak.iryna.cw2;



public class Phone {
    public String number;
    protected String model;
    int weight;


    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void receiveCall(String whoCall) {
       System.out.println("Звонит ");
   }

   public  String getModel(){
       return "Телефонная модель " + model;
   }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static void main(String[] args) {
        Phone phoneTest = new Phone("1", "", 1);
        phoneTest.receiveCall("Петя");
        String str = "nhgvasd";
    }

}





