import java.util.Scanner;

public class Test {
    static Scanner input=new Scanner(System.in);
    GroomFactory gf=new GroomFactory();
    public static void main(String[] args) {

        groomStart();


    }
    static void groomStart(){
        System.out.println("Choose from the following");
        System.out.println("1.Grooming recommendation");
        System.out.println("2.Grooming Services");
        System.out.println("3.Grooming Rotten");
        System.out.println("4.Exit");
        System.out.print("Choice: ");
        int choice=input.nextInt();

        if(choice==1){
            GroomFactory gf=new GroomFactory();
            selectGender(gf);
        }else if (choice==2){
            System.out.println();
            chooseExpert();
        }
        else if(choice==3)
        {

        }
        else if (choice==4){
            System.exit(1);
        }
        groomStart();
    }


        static void chooseExpert(){

            System.out.println("Choose your expert");
            System.out.println("1.Beginner");
            System.out.println("2.Senior");
            System.out.println("3.Master");
            System.out.println("4.back");
            System.out.print("Choice: ");
            int choice=input.nextInt();

            System.out.println();
            if(choice==1){
               GroomingEstimator ge=new GroomingExpert();
               addServices(ge);
            }else if (choice==2){
                GroomingEstimator ge=new SeniorGroomingExpert();
                addServices(ge);
            }else if (choice==3){
                GroomingEstimator ge=new MasterGroomingExpert();
                addServices(ge);
            }
            else if (choice==4){
                System.exit(1);

            }
            chooseExpert();
        }
    static void addServices( GroomingEstimator ge){

        System.out.println("Select service");
        System.out.println("1.Nail");
        System.out.println("2.Haircut");
        System.out.println("3.Massage");
        System.out.println("4.Makeup");
        System.out.println("5.Manicure");
        System.out.println("6.Facial");
        System.out.println("7.Back");
        System.out.print("Choice: ");
        int choice=input.nextInt();



        if(choice==1){
            ge=new NailService(ge);
            System.out.println("Nail service added");
        }else if(choice==2){
            ge=new HairCutService(ge);
            System.out.println("Haircut service added");
        }else if (choice==3){
            ge=new MassageService(ge);
            System.out.println("Massage service added");
        }else if (choice==4){
            ge=new MakeupService(ge);
            System.out.println("Makeup service added");
        }else if (choice==5){
            ge=new ManicureService(ge);
            System.out.println("Manicure service added");
        }else if (choice==6){
            ge=new FacialService(ge);
            System.out.println("Facial service added");
        }
        else if (choice==7){
            chooseExpert();
        }

        System.out.println("\nDo you want to add more?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Choice: ");
        int select=input.nextInt();
        if(select==1){
            addServices(ge);
        }else if(select==2){
            System.out.println(ge.getGroomingType()+" | Price : "+ge.getCost());
            groomStart();
        }










    }


    static void selectGender(GroomFactory gf){
        System.out.println("Select gender");
        System.out.println("1.Male");
        System.out.println("2.Female");
        System.out.println("3.Exit");
        System.out.print("Choice: ");
        int choice=input.nextInt();
        if(choice==1){
            System.out.println();
            showMaleGrooming(gf);
        }else if (choice==2){
            System.out.println();

            showFemaleGrooming(gf);

        }else if (choice==3){
            System.exit(1);

        }else {
            selectGender(gf);
            System.out.println();
        }
    }
    static void showMaleGrooming(GroomFactory gf){
        Scanner input=new Scanner(System.in);



        System.out.println("Type of grooming");
        System.out.println("1.Hair");
        System.out.println("2.Nail");
        System.out.println("3.Shoes");
        System.out.println("4.Teeth");
        System.out.println("5.Uniform");
        System.out.println("6.back");

        System.out.print("Choice: ");
        int choice=input.nextInt();

        if(choice==1){
            Groom person= gf.getGroom("Hair");
            person.maleGrooming();
        }else if(choice==2){
            Groom person= gf.getGroom("Nail");
            person.maleGrooming();
        }else if (choice==3){
            Groom person= gf.getGroom("Shoes");
            person.maleGrooming();
        }else if (choice==4){
            Groom person= gf.getGroom("Teeth");
            person.maleGrooming();
        }else if (choice==5){
            Groom person= gf.getGroom("Uniform");
            person.maleGrooming();
        }else if (choice==6){
            System.out.println();
           selectGender(gf);

        }
        showMaleGrooming(gf);




    }

    static void showFemaleGrooming(GroomFactory gf){
        Scanner input=new Scanner(System.in);

        System.out.println("Type of grooming");
        System.out.println("1.Hair");
        System.out.println("2.Nail");
        System.out.println("3.Shoes");
        System.out.println("4.Teeth");
        System.out.println("5.Uniform");
        System.out.println("6.Makeup");
        System.out.println("7.back");

        System.out.print("Choice: ");
        int choice=input.nextInt();

        if(choice==1){
            Groom person= gf.getGroom("Hair");
            person.femaleGrooming();
        }else if(choice==2){
            Groom person= gf.getGroom("Nail");
            person.femaleGrooming();

        }else if (choice==3){
            Groom person= gf.getGroom("Shoes");
            person.femaleGrooming();
        }else if (choice==4){
            Groom person= gf.getGroom("Teeth");
            person.femaleGrooming();

        }else if (choice==5){
            Groom person= gf.getGroom("Uniform");
            person.femaleGrooming();

        }else if (choice==6){
            Groom person= gf.getGroom("makeup");
            person.femaleGrooming();

        }else if (choice==7){
            System.out.println();
            selectGender(gf);
        }
        showFemaleGrooming(gf);

    }
}
