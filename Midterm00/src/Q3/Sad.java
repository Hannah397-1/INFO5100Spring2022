package Q3;

public class Sad extends Moody {
    public Sad(String name) {
        super(name);
    }

    @Override
    public String getMood() {
        return "waah" + "boo hoo" + "weep" + "sob";
    }

    @Override
    public void expressFeelings() {
        System.out.println(this.getName() + "cries a lot");
    }

    @Override
    public String toString() {
        return "name='" + name + ": I feel sad today.";
    }
}
