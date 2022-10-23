public class Car {
    public String brand;
    public String model;
    public float engineVolume;
    public String color;
    public int productionYear;
    public String productionCountry;
    public Car (String brand, String model, float engineVolume,String color, int productionYear, String
            productionCountry) {
        this.brand = ValidationUtils.validOrDefault(brand,"default");
        this.model = ValidationUtils.validOrDefault(model,"default");
        this.productionCountry = ValidationUtils.validOrDefault(productionCountry,"default");
        this.color = ValidationUtils.validOrDefault(color,"белый");
        if (engineVolume > 0.0f) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5f;
        }
        if (productionYear >= 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }
    }
    @Override
    public String toString() {
        return brand + ' ' + model +
                ", объём двигателя - " + engineVolume +
                " л, цвет кузова - " + color + ", " + productionYear +
                " года выпуска, " +
                " страна сборки - " + productionCountry + ".";
    }
}
