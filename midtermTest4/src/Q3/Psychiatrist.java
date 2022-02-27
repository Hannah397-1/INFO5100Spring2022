package Q3;

public class Psychiatrist {
        String name;
        Moody moody;

        public Psychiatrist(String name) {
            this.name = name;
        }
        public void examine(Moody moody){
            System.out.println("How are you feeling today?");
            System.out.println(moody.toString());
            System.out.println(moody.getMood());
        }

        public void observe(Moody moody){
            moody.expressFeelings();
        }

        @Override
        public String toString() {
            return "Psychiatrist{" +
                    "name='" + name + '\'' +
                    ", moody=" + moody +
                    '}';
        }

}
