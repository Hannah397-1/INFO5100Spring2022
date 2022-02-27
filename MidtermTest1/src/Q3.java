public class Q3 {
    public static void main(String[] args) {
        Psychiatrist doctor = new Psychiatrist();
        Happy tom = new Happy("Tom");
        Sad jerry = new Sad("Jerry");
        doctor.examine(tom);
        doctor.observe(tom);

        doctor.examine(jerry);
        doctor.observe(jerry);
    }
}
class Psychiatrist {

    public void examine(Moody moody){
        System.out.println("How are you feeling today?");
        moody.queryMood();
        System.out.println(moody.getMood());

    }

    public void observe(Moody moody){

        moody.expressFeelings();
    }

    @Override
    public String toString() {
        return "Psychiatrist{" +
                '\'' +
                '}';
    }

}
abstract class Moody {
    String name;

    public Moody(String name) {
        this.name = name;
    }

    abstract String getMood();
    abstract void expressFeelings();
    public void queryMood(){
        System.out.println(this.toString());
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Sad extends Moody {
    public Sad(String name) {
        super(name);
    }

    @Override
    public String getMood() {
        return "waah" + " boo hoo" + " weep" + " sob";
    }

    @Override
    public void expressFeelings() {
        System.out.println(this.getName() + " cries a lot");
    }

    @Override
    public String toString() {
        return name + ": I feel sad today.";
    }
}
class Happy extends Moody{
    public Happy(String name) {
        super(name);
    }

    @Override
    public String getMood() {
        return "heeehee....hahahah...HAHAHA!!";
    }

    @Override
    public void expressFeelings() {
        System.out.println(this.getName()+" laughs a lot");
    }

    @Override
    public String toString() {
        return name + ": I feel happy today!";
    }
}

