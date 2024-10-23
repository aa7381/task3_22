public class Truck extends Heavy
{
    private double  Maximumloadingweight;




    public Truck(String Licenseplate, double Carage, int amountofwheels, String Steeringshape, double Pollutantemissionspermin,int numberoftrailers ,double Maximumloadingweight) {
        super(Licenseplate, Carage, amountofwheels , Steeringshape , Pollutantemissionspermin , numberoftrailers);
        this.Maximumloadingweight = Maximumloadingweight ;
    }

    public double  getMaximumloadingweight() {
        return Maximumloadingweight;
    }

    public void  setMaximumloadingweight(double  Maximumloadingweight) {
        this.  Maximumloadingweight=   Maximumloadingweight;
    }
    public double exhaust() {
        return super.exhaust() * 1.5;
    }

    @Override
    public String toString() {
        return "Truck{" + "Maximumloadingweight=" +  Maximumloadingweight + '}';
    }
}


