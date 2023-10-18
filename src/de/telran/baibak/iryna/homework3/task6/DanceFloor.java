package de.telran.baibak.iryna.homework3.task6;

public class DanceFloor implements Dancable {

    String typeDance;

    public DanceFloor(String typeDance) {
        this.typeDance = typeDance;
    }
    @Override
    public void dance() {
        System.out.println("Я танцую " + typeDance);
    }

    public static void main(String[] args) {
        Dancable firstDancer = new Dancer("буги-вуги");
        Dancable secondDancer = new PopDancer("поп");
        Dancable thirdDancer = new RockDancer("рок");
        Dancable fourthDancer = new StripDancer("стрип");
        Dancable fifthDancer = new HipHopDancer("хип-хоп");
        Dancable sixthDancer = new BlusDancer("блюз");
        Dancable[] dance = new Dancable[6];
        dance[0] = firstDancer;
        dance[1] = secondDancer;
        dance[2] = thirdDancer;
        dance[3] = fourthDancer;
        dance[4] = fifthDancer;
        dance[5] = sixthDancer;
        for (int i = 0; i < dance.length; i++) {
            dance[i].dance();

        }


    }
}
