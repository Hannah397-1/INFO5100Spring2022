public class Q5 {
    public static void main(String[] args) {
        Camera c1 = Camera.getInstance();
        c1.setName("Canon 370");
        System.out.println(c1.getName());
        System.out.println(c1.toString());

        Camera c2 = Camera.getInstance();
        System.out.println(c2.getName());
        System.out.println(c2.toString());
    }
}
class Camera {

    private Camera(){

    }


    private static  Camera _instance;
    private static Object obj = new Object();

    private static String name = "";
    public static Camera getInstance(){

        if(_instance == null){
            synchronized (obj){
                if(_instance == null){
                    _instance = new Camera();
                }
            }
        }

        return _instance;
    }

    public String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }


}
