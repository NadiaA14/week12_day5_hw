public class Plane {

    private int capacity;
    private int weight;
    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
        planeType.getCapacity();
        planeType.getWeight();
    }

    public int getCapacity() {
        return planeType.getCapacity();
    }

    public int getWeight(){
        return planeType.getWeight();
    }
}
