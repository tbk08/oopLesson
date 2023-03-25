package Car;

public class Car {
    String marka;
    String color;
    double motor;
    int year;
    int fuel;//100km qansha ketedi
    int fuelV;//binzobak kolemi
    double fuelDarejesi;//binzobakta qansha benzin bar

    double massa;

    void zapravka(int benzin) {
        fuelDarejesi = fuelDarejesi + benzin;
    }

    //100km-10l
    //1km-0,1l
    //15km-0,1*15=1,5;

    void rasxod(double nesheKmjurdi) {
        fuelDarejesi = fuelDarejesi - (nesheKmjurdi / 100) * fuel;
    }
    //Alt+Insert
    public Car(String marka, String color, double motor, int year, int fuel, int fuelV, double massa,double fuelDarejesi) {
        this.marka = marka;
        this.color = color;
        this.motor = motor;
        this.year = year;
        this.fuel = fuel;
        this.fuelV = fuelV;
        this.massa = massa;
        this.fuelDarejesi = fuelDarejesi;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", color='" + color + '\'' +
                ", motor=" + motor +
                ", year=" + year +
                ", fuel=" + fuel +
                ", fuelV=" + fuelV +
                ", fuelDarejesi=" + fuelDarejesi +
                ", massa=" + massa +
                '}';
    }
}
