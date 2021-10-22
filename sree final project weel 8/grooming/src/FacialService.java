public class FacialService extends GroomingPlanDecorator{
    private GroomingEstimator ge;
    public FacialService(GroomingEstimator ge){
        this.ge = ge;
    }

    @Override
    public int getCost() {
        return ge.getCost()+20;
    }

    @Override
    public String getGroomingType() {
        return ge.getGroomingType()+" | Facial";
    }
}
