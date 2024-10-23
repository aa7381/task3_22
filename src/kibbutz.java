public class kibbutz
{
    private Vehicle[] Vehicle ;
    private int vehiclecount ;

    public kibbutz()
    {
        Vehicle = new Vehicle[500];
        vehiclecount = 0 ;
    }
    public void addvehicle(Vehicle vehicle)
    {
        if(vehiclecount < 500)
        {
            Vehicle[vehiclecount] =vehicle ;
        }
    }
    private Vehicle[] getvehicleabove15withsteeringwheel()
    {
        Vehicle[]  result  = new Vehicle[vehiclecount];
        int count = 0 ;
        for(int i = 0 ; i<vehiclecount ; i++) {
            if (Vehicle[i].getCarage() > 15 && Vehicle[i].getSteeringshape().equals("הגה"))
            {
               result[count] = Vehicle[i];
               count++;
            }

        }
        return result ;
    }
    private int countcarandlightvehiclewithsteeringwheel()
    {
        int count =0 ;
        for(int i =0 ; i < vehiclecount ; i++)
        {
            if(Vehicle[i] instanceof regular || Vehicle[i] instanceof light)
            {
                if(Vehicle[i].getSteeringshape().equals("הגה")){
                    count ++ ;
                }
            }
        }
        return count ;
    }
}
