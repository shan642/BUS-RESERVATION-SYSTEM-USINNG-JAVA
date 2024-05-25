package busresevation;

public class Bus {
    private int bus_no;
    private boolean ac;
    private int capacity;
    Bus(int busno, boolean ac, int capacity) {
        this.bus_no = busno;
        this.ac = ac;
        this.capacity = capacity;
    }
    public int getBus_no() {
        return bus_no;
    }
    public void setBus_no(int no) {
        bus_no = no;
    }
    public boolean isAc() {
        return ac;
    }
    public void setAc(boolean ac) {
        this.ac = ac;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
   public void displayBusinfo()
    {
        System.out.println("bus no: " + bus_no+", ac: " + ac+", capacity: " + capacity);
    }
}
