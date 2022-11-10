package random;

import java.util.HashMap;

public class check {
    public static void main(String[] args) {
        HashMap<String, String> camera = new HashMap<>();
        String[] photos = new String[5];
        photos[0] = "NIK001071122";
        photos[1] = "NIK003041123";
        photos[2] = "NIK002101122";
        photos[2] = "CAN002101122";

        camera.put(photos[0].substring(3, 6), photos[0].substring(6));
        camera.put(photos[1].substring(3, 6), photos[1].substring(6));
        camera.put(photos[2].substring(3, 6), photos[2].substring(6));
        //System.out.println(camera);
        //System.out.println(camera.keySet());
        //System.out.println();
        //System.out.println(camera.get(photos[0].substring(3, 6)));
        //System.out.println(camera.get(photos[0].substring(3, 6)));


        String arrayName = (photos[0].substring(0,3));
        System.out.println("\"" + arrayName + "\"");
        for (String key : camera.keySet()) {
            System.out.print(key + "-");
            System.out.print(camera.get(key).substring(0,2) + "/" + camera.get(key).substring(2,4) +"/"+ camera.get(key).substring(4));
            System.out.println();
        }
    }
}
