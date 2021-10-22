public class Shoes implements Groom{
    @Override
    public void maleGrooming() {
        System.out.println("\nHere is your shoe grooming tips");
        System.out.println("------------------------------------------");
        System.out.println("1. Lace up conservative shoes are the most appropriate");
        System.out.println("2. Choose black, brown or burgundy shoes. Shoe color should match your trousers or be of a darker color");

        System.out.println("3. Shoe should be in good condition and polished");

        System.out.println("4. Socks should match the color of your suit and cover your calves");
        System.out.println("5. belts should be in good condition and match the color of your shoes");
        System.out.println("------------------------------------------\n");


    }

    @Override
    public void femaleGrooming() {
        System.out.println("\nHere is your shoe grooming tips");
        System.out.println("------------------------------------------");
        System.out.println("1. Shoes should be pump or sling backs,do not wear shoes with open toes, open heels, ankle straps");
        System.out.println("2. Shoes should be of good quality leather");
        System.out.println("3. Shoes color should be darker than your trousers");
        System.out.println("4. Heels should be 1-2 inches, higher heels should be saved for after hours");
        System.out.println("------------------------------------------\n");

    }
}
