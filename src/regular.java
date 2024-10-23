public class regular extends Vehicle
{
    private int  numberofpassengers ;




    public regular(String Licenseplate, double Carage, int amountofwheels, String Steeringshape, double Pollutantemissionspermin, int  numberofpassengers) {
        super(Licenseplate, Carage, amountofwheels , Steeringshape , Pollutantemissionspermin);
        this. numberofpassengers = numberofpassengers;
    }

    public int getnumberofpassengers() {
        return  numberofpassengers;
    }

    public void setnumberofpassengers(int  numberofpassengers) {
        this. numberofpassengers=  numberofpassengers;
    }
    public double exhaust() {
        return super.exhaust();
    }

    public void noise()
    {
        System.out.println("the car noise is moderate");
    }
    public void hitchhikers() {
        System.out.println("the car can take 3 hitchhikers.");
    }

    @Override
    public String toString() {
        return "regular{" + "numberofpassengers=" + numberofpassengers + '}';
    }
    public static void printCarNoise(Vehicle[]vehicles)
    {
        for(Vehicle vehicle : vehicles)
        {
            if(vehicle instanceof  regular)
                ((regular) vehicle).noise();
        }
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


