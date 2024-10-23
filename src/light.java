public class light extends Vehicle
{
    private boolean  hasengine ;




    public light(String Licenseplate, double Carage, int amountofwheels, String Steeringshape, double Pollutantemissionspermin,boolean  hasengine) {
        super(Licenseplate, Carage, amountofwheels , Steeringshape , Pollutantemissionspermin);
    }

    public boolean gethasengine() {
        return  hasengine;
    }

    public void sethasengine(boolean  hasengine) {
        this. hasengine=  hasengine;
    }

    @Override
    public String toString() {
        return "light{" + "hasengine=" + hasengine + '}';
    }
}
