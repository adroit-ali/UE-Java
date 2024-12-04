public class DistanceBySpeed {
    private static int distance(int speed, int time){
        return speed*time;
    }
    public static void main(String[] args){
        int distance = distance(5,3);
        System.out.println("Distance Travelled by the Vehicle is "+distance);
    }
}
