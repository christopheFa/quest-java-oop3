package fr.wildcodeschool.quest;

public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();

        Eagle hawkeye = new Eagle("Eye Cherry");
        // TODO : uncomment the following code in order to test it
        hawkeye.takeOff();
        hawkeye.flyUpward(120);
        hawkeye.flyUpward(30);
        hawkeye.glide();
        hawkeye.flyDownward(140);
        hawkeye.landing();
        hawkeye.flyDownward(9);
        hawkeye.landing();
    }
}
