package model;

import java.util.List;

public class InventoryMap {
    private List<Rice> riceList;
    private List<Pulse> pulsesList;
    private List<Wheat> wheatList;

    public List<Rice> getRiceList() {
        return riceList;
    }

    public void setRiceList(List<Rice> riceList) {
        this.riceList = riceList;
    }

    public List<Pulse> getPulsesList() {
        return pulsesList;
    }

    public void setPulsesList(List<Pulse> pulsesList) {
        this.pulsesList = pulsesList;
    }

    public List<Wheat> getWheatList() {
        return wheatList;
    }

    public void setWheatList(List<Wheat> wheatList) {
        this.wheatList = wheatList;
    }

    @Override
    public String toString() {
        return "InventoryMap{" +
                "riceList=" + riceList +
                ", pulsesList=" + pulsesList +
                ", wheatList=" + wheatList +
                '}';
    }
}
