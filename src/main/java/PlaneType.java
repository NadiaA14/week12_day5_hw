public enum PlaneType {
    SMALL(50, 200),
    BIG(100, 400),
    CRAZY_BIG(1000, 5000);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
