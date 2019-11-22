public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }

    public int getPlaneTypeCapacity(){
        return this.planeType.getCapacity();
    }

    public int getPlaneTypeWeight(){
        return this.planeType.getWeight();
    }
}
