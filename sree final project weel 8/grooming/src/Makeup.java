public class Makeup implements Groom{
    @Override
    public void maleGrooming() {

    }

    @Override
    public void femaleGrooming() {
        System.out.println("\nHere is your makeup grooming tips");
        System.out.println("------------------------------------------");
        System.out.println("1. Makeup should be natural looking");
        System.out.println("2. Nail polish and lip color should not be too trendy or bright");
        System.out.println("3. Mild fragrance");
        System.out.println("4. Women: Stay away from extremely dark, bright reds and fluorescent colors");
        System.out.println("------------------------------------------\n");
    }
}
