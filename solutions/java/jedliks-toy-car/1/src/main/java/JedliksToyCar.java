public class JedliksToyCar {
    private int battery = 100;
    private int driven_meters=0;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + driven_meters + " meters";
    }

    public String batteryDisplay() {
        if (battery == 0) {
            return "Battery empty";
        }
        return "Battery at " + battery + "%";
    }

    public void drive() {
        if (battery > 0){
            driven_meters += 20;
            battery -= 1;
       
       }
    }
}
