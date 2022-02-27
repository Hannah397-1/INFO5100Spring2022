package Q5;

public class Camera {

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
