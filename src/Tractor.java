public class Tractor extends Heavy
{
    private String  trailertypes ;




    public Tractor(String Licenseplate, double Carage, int amountofwheels, String Steeringshape, double Pollutantemissionspermin,int numberoftrailers ,String  trailertypes) {
        super(Licenseplate, Carage, amountofwheels , Steeringshape , Pollutantemissionspermin , numberoftrailers);
        this.trailertypes = trailertypes ;
    }

    public String  getytrailertypes() {
        return   trailertypes;
    }

    public void  settrailertypes(String  trailertypes) {
        this.  trailertypes=   trailertypes;
    }

    @Override
    public String toString() {
        return "Tractor{" + " trailertypes=" +  trailertypes + '}';
    }
}


