public class familycar extends regular
{
    private boolean  hasbabyseat ;




    public familycar(String Licenseplate, double Carage, int amountofwheels, String Steeringshape, double Pollutantemissionspermin,boolean  hasbabyseat ,int  numberofpassengers) {
        super(Licenseplate, Carage, amountofwheels , Steeringshape , Pollutantemissionspermin , numberofpassengers);
        this.  hasbabyseat =   hasbabyseat;

    }

    public boolean gethasbabyseat() {
        return   hasbabyseat;
    }

    public void sethasbabyseat(boolean  hasbabyseat) {
        this.hasbabyseat=hasbabyseat;
    }

    @Override
    public String toString() {
        return "familycar{" + " hasbabyseat=" +  hasbabyseat + '}';
    }
}
