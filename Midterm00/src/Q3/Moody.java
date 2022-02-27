package Q3;

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
