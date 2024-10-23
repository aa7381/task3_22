public class deliverytruck extends Truck
{
      private String deliverytype ;

    public deliverytruck(String Licenseplate, double Carage, int amountofwheels, String Steeringshape, double Pollutantemissionspermin,int numberoftrailers ,double Maximumloadingweight, String deliverytype) {
        super(Licenseplate, Carage, amountofwheels, Steeringshape, Pollutantemissionspermin, numberoftrailers,Maximumloadingweight);
        this.deliverytype = deliverytype;
    }
    public String gedeliverytype() {
        return   deliverytype;
    }

    public void setdeliverytype(String  deliverytype) {
        this.deliverytype=deliverytype;
    }

    @Override
    public String toString() {
        return "deliverytype{" + " deliverytype=" +  deliverytype + '}';
    }
}