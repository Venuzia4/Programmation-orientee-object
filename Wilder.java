public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname) {
        this.firstname = firstname;
        this.aware = true;
    }
    public Wilder(String firstname,boolean aware){
        this.firstname=firstname;
        this.aware=true;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public  String whoAmI() {
        if(aware){

        return "Je m'appelle " + this. getFirstname() + " je suis " + this.isAware();

        }else{

        return "Je m'appelle " + this. getFirstname() + " je ne suis pas" + this.isAware();

        }

        
    

    }
}
