package Lesson11.HomeWor17;

public abstract class Actions {

    private Integer calls;
    private Integer sms;
    private Integer traficInthernet;
    private Integer version;

    public Actions(Integer calls, Integer sms, Integer traficInthernet, Integer version) {
        this.calls = calls;
        this.sms = sms;
        this.traficInthernet = traficInthernet;
        this.version = version;
    }

    public Integer getCalls() {
        return calls;
    }

    public Integer getSms() {
        return sms;
    }

    public Integer getTraficInthernet() {
        return traficInthernet;
    }

    public Integer getVersion() {
        return version;
    }

}
