public class Vehicle {
    String Licenseplate;
    double Carage;
    int amountofwheels;
    String Steeringshape;
    double Pollutantemissionspermin;


    public Vehicle(String Licenseplate, double Carage, int amountofwheels, String Steeringshape, double Pollutantemissionspermin) {
        this.Licenseplate = Licenseplate;
        this.Carage = Carage;
        this.amountofwheels = amountofwheels;
        this.Steeringshape = Steeringshape;
        this.Pollutantemissionspermin = Pollutantemissionspermin;
    }

    public String getLicenseplate() {
        return Licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        Licenseplate = licenseplate;
    }

    public double getCarage() {
        return Carage;
    }

    public void setCarage(double carage) {
        Carage = carage;
    }

    public int getAmountofwheels() {
        return amountofwheels;
    }

    public void setAmountofwheels(int amountofwheels) {
        this.amountofwheels = amountofwheels;
    }

    public String getSteeringshape() {
        return Steeringshape;
    }

    public void setSteeringshape(String steeringshape) {
        Steeringshape = steeringshape;
    }

    public double getPollutantemissionspermin() {
        return Pollutantemissionspermin;
    }

    public void setPollutantemissionspermin(double pollutantemissionspermin) {
        Pollutantemissionspermin = pollutantemissionspermin;
    }

    public Vehicle() {
        Licenseplate = "";
        Carage = 1;
        amountofwheels = 2;
        Steeringshape = "";
        Pollutantemissionspermin = 0;
    }

    public double exhaust() {
        return Pollutantemissionspermin * 60;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "Licenseplate='" + Licenseplate + '\'' + ", Carage=" + Carage + '\'' + ", amountofwheels=" + amountofwheels + '\'' + ", Steeringshape='" + Steeringshape + '\'' + ", Pollutantemissionspermin=" + Pollutantemissionspermin + '}';
    }

    public static double totaldailyemissions(Vehicle[] vehicles) {
        double totalemissions = 0;
        for (Vehicle vehicle : vehicles) {
            totalemissions += vehicle.exhaust();
        }
        return totalemissions;
    }

    public static String findvehiclewithmaxloadingtime(Vehicle[] vehicles) {
        String maxloadingvehiclenumber = "";
        double maxloadingtime = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Cart) {
                double Loadingtime = ((Cart) vehicle).getloadingtime();
                    if (Loadingtime > maxloadingtime) {
                         maxloadingtime = Loadingtime;
                         maxloadingvehiclenumber = vehicle.getLicenseplate();
                    }
            }

        }
        return maxloadingvehiclenumber;
    }
}