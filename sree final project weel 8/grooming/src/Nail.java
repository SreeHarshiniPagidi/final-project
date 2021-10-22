public class Nail implements Groom{
    @Override
    public void maleGrooming() {
        System.out.println("\nHere is your nail grooming tips");
        System.out.println("------------------------------------------");
        System.out.println("1. Clip nails short, along their shape");
        System.out.println("2. A healthy body ensures healthy nails");
        System.out.println("3. Brittle or discolored nails show up deficiencies or disease conditions");
        System.out.println("------------------------------------------\n");

    }

    @Override
    public void femaleGrooming() {
        maleGrooming();
    }
}
