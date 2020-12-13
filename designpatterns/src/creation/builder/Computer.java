package creation.builder;

public class Computer {

    //必选
    private String cpu;
    //必选
    private String ram;
    //可选
    private int usbCount;
    //可选
    private String keyboard;
    //可选
    private String display;

    public Computer(Builder builder){
        this.cpu = builder.getCpu();
        this.ram = builder.getRam();
        this.usbCount = builder.getUsbCount();
        this.keyboard = builder.getKeyboard();
        this.display = builder.getDisplay();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Computer{");
        sb.append("cpu='").append(cpu).append('\'');
        sb.append(", ram='").append(ram).append('\'');
        sb.append(", usbCount=").append(usbCount);
        sb.append(", keyboard='").append(keyboard).append('\'');
        sb.append(", display='").append(display).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public int getUsbCount() {
        return usbCount;
    }

    public void setUsbCount(int usbCount) {
        this.usbCount = usbCount;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
