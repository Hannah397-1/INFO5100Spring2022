package Q3;

public class Happy extends Moody{
    public Happy(String name) {
        super(name);
    }

    @Override
    public String getMood() {
        return "heeehee....hahahah...HAHAHA!!";
    }

    @Override
    public void expressFeelings() {
        System.out.println(this.getName()+"laughs a lot");
    }

    @Override
    public String toString() {
        return
                "name='" + name + ": I feel happy today!";
    }
}
