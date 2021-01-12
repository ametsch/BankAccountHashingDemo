package Ch8Classes;

public class Address {
    private String street, city, state, unit;
    private long number, zip;

    public Address(long number, String street, String city, String state, long zip){
        this.number = number;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.unit = null;
    }

    public Address(long number, String street, String city, String state, long zip, String unit){
        this(number, street, city, state, zip);
        this.unit = unit;
    }


//setters
    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    //getters

    public String getStreet() {
        return this.street;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getUnit() {
        return this.unit;
    }

    public long getNumber() {
        return this.number;
    }

    public long getZip() {
        return this.zip;
    }
    //toString
    @Override
    public String toString() {
        if(unit != null){
            return this.number+" "+this.street+" "+this.unit+"\n"+
                    this.city+", "+this.state+" "+this.zip;
        }else{
            return this.number+" "+this.street+"\n"+
                    this.city+", "+this.state+" "+this.zip;
        }
    }

}
