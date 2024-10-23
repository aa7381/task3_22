public class Heavy extends Vehicle
{
    private int  numberoftrailers ;




    public Heavy(String Licenseplate, double Carage, int amountofwheels, String Steeringshape, double Pollutantemissionspermin,int  numberoftrailers) {
        super(Licenseplate, Carage, amountofwheels , Steeringshape , Pollutantemissionspermin);
        this. numberoftrailers =  numberoftrailers;

    }

    public int getTrailers() {
        return  numberoftrailers;
    }

    public void setTrailers(int numberoftrailers) {
        this.numberoftrailers= numberoftrailers;
    }

    @Override
    public double exhaust() {
        return super.exhaust() + (500 * numberoftrailers);
    }

    @Override
    public String toString() {
        return "Heavy{" + "numberoftrailers=" + numberoftrailers + '}';
    }
}
