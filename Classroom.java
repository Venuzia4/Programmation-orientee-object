
public class Classroom {

    public static void main(String[] args) {

        Wilder venuzia = new Wilder("Venuzia", true);
        System.out.println("firstname:" + venuzia.getFirstname());

        System.out.println(" Venuzia aware state was :" + String.valueOf(venuzia.isAware()));
        venuzia.setAware(true);
        System.out.println(" Now  his aware state is :" + String.valueOf(venuzia.isAware()));

        System.out.println(venuzia.whoAmI());
        

        Wilder elodie = new Wilder("Elodie");
        Wilder lala = elodie;
        lala.setFirstname("Lala");
        System.out.println("firstname:" + elodie.getFirstname());

        System.out.println(lala.whoAmI());

    }

}