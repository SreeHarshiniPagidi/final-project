public class NailService extends GroomingPlanDecorator{
    private GroomingEstimator ge;
    public NailService(GroomingEstimator ge){
        this.ge = ge;
    }

    @Override
    public int getCost() {
        return ge.getCost()+10;
    }

    @Override
    public String getGroomingType() {
        return ge.getGroomingType()+" | Nail";
    }
}
