import java.io.Serializable;

/**
 * Created by pquintero on 12/11/16.
 */
public class sst implements Serializable {
    private String type;
    private String latitude;
    private String longitude;
    private String measurementDate;
    private String valueMeasurement;
    private String zoneX;
    private String zoneY;
    private String neighbor_1;
    private String neighbor_2;
    private String neighbor_3;
    private String neighbor_4;
    private String neighbor_5;
    private String neighbor_6;
    private String neighbor_7;
    private String neighbor_8;

    /*
    public sst(String[] fields) {
        this.type = fields[0];
        this.latitude = Double.parseDouble(fields[1]);
        this.longitude = Double.parseDouble(fields[2]);
        this.measurementDate = fields[3];
        this.valueMeasurement = Double.parseDouble(fields[4]);
        this.zoneX = Integer.parseInt(fields[5]);
        this.zoneY = Integer.parseInt(fields[6]);
        this.neighbor_1 = Double.parseDouble(fields[7]);
        this.neighbor_2 = Double.parseDouble(fields[8]);
        this.neighbor_3 = Double.parseDouble(fields[9]);
        this.neighbor_4 = Double.parseDouble(fields[10]);
        this.neighbor_5 = Double.parseDouble(fields[11]);
        this.neighbor_6 = Double.parseDouble(fields[12]);
        this.neighbor_7 = Double.parseDouble(fields[13]);
        this.neighbor_8 = Double.parseDouble(fields[14]);
    }
    */
    public sst(String[] fields) {
        this.type = fields[0];
        this.latitude = (fields[1]);
        this.longitude = (fields[2]);
        this.measurementDate = fields[3];
        this.valueMeasurement = (fields[4]);
        this.zoneX = (fields[5]);
        this.zoneY = (fields[6]);
        this.neighbor_1 = (fields[7]);
        this.neighbor_2 = (fields[8]);
        this.neighbor_3 = (fields[9]);
        this.neighbor_4 = (fields[10]);
        this.neighbor_5 = (fields[11]);
        this.neighbor_6 = (fields[12]);
        this.neighbor_7 = (fields[13]);
        this.neighbor_8 = (fields[14]);
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getMeasurementDate() {
        return measurementDate;
    }

    public void setMeasurementDate(String measurementDate) {
        this.measurementDate = measurementDate;
    }

    public String getValueMeasurement() {
        return valueMeasurement;
    }

    public void setValueMeasurement(String valueMeasurement) {
        this.valueMeasurement = valueMeasurement;
    }

    public String getZoneX() {
        return zoneX;
    }

    public void setZoneX(String zoneX) {
        this.zoneX = zoneX;
    }

    public String getZoneY() {
        return zoneY;
    }

    public void setZoneY(String zoneY) {
        this.zoneY = zoneY;
    }

    public String getNeighbor_1() {
        return neighbor_1;
    }

    public void setNeighbor_1(String neighbor_1) {
        this.neighbor_1 = neighbor_1;
    }

    public String getNeighbor_2() {
        return neighbor_2;
    }

    public void setNeighbor_2(String neighbor_2) {
        this.neighbor_2 = neighbor_2;
    }

    public String getNeighbor_3() {
        return neighbor_3;
    }

    public void setNeighbor_3(String neighbor_3) {
        this.neighbor_3 = neighbor_3;
    }

    public String getNeighbor_4() {
        return neighbor_4;
    }

    public void setNeighbor_4(String neighbor_4) {
        this.neighbor_4 = neighbor_4;
    }

    public String getNeighbor_5() {
        return neighbor_5;
    }

    public void setNeighbor_5(String neighbor_5) {
        this.neighbor_5 = neighbor_5;
    }

    public String getNeighbor_6() {
        return neighbor_6;
    }

    public void setNeighbor_6(String neighbor_6) {
        this.neighbor_6 = neighbor_6;
    }

    public String getNeighbor_7() {
        return neighbor_7;
    }

    public void setNeighbor_7(String neighbor_7) {
        this.neighbor_7 = neighbor_7;
    }

    public String getNeighbor_8() {
        return neighbor_8;
    }

    public void setNeighbor_8(String neighbor_8) {
        this.neighbor_8 = neighbor_8;
    }
}
