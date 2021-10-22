public abstract class GroomingEstimator {
    String groomingType;

    public String getGroomingType(){
        return groomingType;
    }
    public abstract int getCost();
}
