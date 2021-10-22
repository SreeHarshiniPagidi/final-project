public class ManicureService extends GroomingPlanDecorator{
    private GroomingEstimator ge;
    public ManicureService(GroomingEstimator ge){
        this.ge = ge;
    }

    @Override
    public int getCost() {
        return ge.getCost()+30;
    }

    @Override
    public String getGroomingType() {
        return ge.getGroomingType()+" | Manicure";
    }
}
