public class Hair implements Groom{
    @Override
    public void maleGrooming() {
        System.out.println("\nHere is your hair grooming tips");
        System.out.println("------------------------------------------");
        System.out.println("1. Not fall over the ears, eyebrows  or even touch the back of the collar");
        System.out.println("2. Will always present a neat appearance");
        System.out.println("3. Facial hair should be neatly trimmed(Moustache, Sideburns)");
        System.out.println("------------------------------------------\n");

    }

    @Override
    public void femaleGrooming() {
        System.out.println("\nHere is your hair grooming tips");
        System.out.println("------------------------------------------");
        System.out.println("1. Tie your hair in a neat hairstyle with hair pulled back from face");
        System.out.println("2. Hair if longer than jawline should be tied into a bun");
        System.out.println("3. Should be well groomed with neat appearance at all the times");
        System.out.println("4. Hair holding devices should be plain and of natural colors");
        System.out.println("------------------------------------------\n");
    }
}
