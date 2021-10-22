import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingPatterns
{
    @Test
    public void DecoratorTesting()
    {
        GroomingEstimator groomingEstimator=new SeniorGroomingExpert();
        groomingEstimator=new NailService(groomingEstimator);
        groomingEstimator=new HairCutService(groomingEstimator);
        assertEquals("Senior Grooming expert | Nail | Haircut | Price : 50",groomingEstimator.getGroomingType()+" | Price : "+groomingEstimator.getCost());
    }

    @Test
    public void FactoryTesting()
    {
        GroomFactory groomFactory=new GroomFactory();
        Groom groom=groomFactory.getGroom("nail");
        assertEquals(groom instanceof Nail,true);
    }
}
