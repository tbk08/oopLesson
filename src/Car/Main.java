package Car;

public class Main {
    public static void main(String[] args) {
        Car spark = new Car("Spark", "Black", 0.8, 2020, 8, 30, 2.2,15);
        System.out.println(spark);
        spark.zapravka(5);
        System.out.println(spark);
        spark.rasxod(10);
        System.out.println(spark);
    }
}
