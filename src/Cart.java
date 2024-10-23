public class Cart extends light
{
    private double  loadingtime;




    public Cart(String Licenseplate, double Carage, int amountofwheels, String Steeringshape, double Pollutantemissionspermin,boolean  hasengine,double  loadingtime) {
        super(Licenseplate, Carage, amountofwheels , Steeringshape , Pollutantemissionspermin,hasengine);
        this.loadingtime=loadingtime;
    }

    public double  getloadingtime() {
        return  loadingtime;
    }

    public void setloadingtime( double  loadingtime) {
        this.loadingtime=loadingtime;
    }
    public double exhaust() {
        return super.exhaust() * 1;
    }

    @Override
    public String toString() {
        return "Cart{" + "Thereisabasket=" +loadingtime + '}';
    }
    public static int totalpassengerswithoutdriver(Vehicle[]vehicles)
    {
        int totalpassengers = 0 ;
        for(Vehicle vehicle : vehicles)
        {
            if(vehicle instanceof regular)
            {
                totalpassengers +=((regular)vehicle).getnumberofpassengers() -1 ;
            }
            else if (vehicle instanceof Bicycle)
            {
                totalpassengers++;
            }
        }
        return totalpassengers;
    }

}
