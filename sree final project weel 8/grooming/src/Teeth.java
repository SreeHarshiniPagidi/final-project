public class Teeth implements Groom{
    @Override
    public void maleGrooming() {
        System.out.println("1. Brush teeth twice a day and rinse well after every meal");
        System.out.println("2. Remember to rinse your mouth after every meal");
        System.out.println("3. For those who smoke it is important to you rinse your mouth after every\n" +
                "smoke and use a mouth freshner");
        System.out.println("------------------------------------------\n");
    }

    @Override
    public void femaleGrooming() {
        maleGrooming();
    }
}
