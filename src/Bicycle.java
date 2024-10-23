public class Bicycle extends light
{
    private boolean  Thereisabasket;




    public Bicycle(String Licenseplate, double Carage, int amountofwheels, String Steeringshape, double Pollutantemissionspermin,boolean  hasengine,boolean  Thereisabasket) {
        super(Licenseplate, Carage, amountofwheels , Steeringshape , Pollutantemissionspermin,hasengine);
        this.Thereisabasket=Thereisabasket;
    }

    public boolean  getThereisabasket() {
        return  Thereisabasket;
    }

    public void setThereisabasket(boolean  Thereisabasket) {
        this.Thereisabasket= Thereisabasket;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "Thereisabasket=" + Thereisabasket + '}';
    }
}
