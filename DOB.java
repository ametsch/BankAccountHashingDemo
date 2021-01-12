package Ch8Classes;

public class DOB {
    private byte day, month;
    private short year;
    public DOB(byte day, byte month, short year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "DOB{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public byte getDay() {
        return this.day;
    }

    public byte getMonth() {
        return this.month;
    }

    public short getYear() {
        return this.year;
    }
}
