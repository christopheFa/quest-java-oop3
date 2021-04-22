package fr.wildcodeschool.quest;

public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!isFlying() && this.altitude == 0) {
            setFlying(true);
            System.out.printf("%s takes off in the sky.%n", this.getName());
        }
    }

    @Override
    public int flyUpward(int meters) {
        if (isFlying()) {
            setAltitude(Math.min(getAltitude() + meters, 325));
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), getAltitude());
        }
        return getAltitude();
    }

    @Override
    public int flyDownward(int meters) {
        if (isFlying()) {
            setAltitude(Math.max(getAltitude() - meters, 0));
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), getAltitude());
        }
        return getAltitude();
    }

    @Override
    public void glide() {
        if (isFlying() && getAltitude() > 0) {
            System.out.printf("%s It glides into the air.%n", this.getName());
        } else {
            System.out.printf("%s is on the land, it can't glides.%n", this.getName());
        }
    }

    @Override
    public void landing() {
        if (isFlying() && getAltitude() < 2) {
            setFlying(false);
            System.out.printf("%s lands on the ground.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't lands.%n", this.getName());
        }
    }
}
