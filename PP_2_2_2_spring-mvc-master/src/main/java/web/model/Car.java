package web.model;

public class Car {
    private String model;
    private String stateNum;
    private String vehRegCertificate;

    public Car() {
    }

    public Car(String model, String stateNum, String vehRegCertificate) {
        this.model = model;
        this.stateNum = stateNum;
        this.vehRegCertificate = vehRegCertificate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStateNum() {
        return stateNum;
    }

    public void setStateNum(String stateNum) {
        this.stateNum = stateNum;
    }

    public String getVehRegCertificate() {
        return vehRegCertificate;
    }

    public void setVehRegCertificate(String vehRegCertificate) {
        this.vehRegCertificate = vehRegCertificate;
    }
}
