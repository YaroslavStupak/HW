package Lesson7.Task4;

public class RemoteController implements Volume, Device {
    private TVDevice tvDevice;

    public void connectDevice(TVDevice TV) {
        this.tvDevice = TV;
    }

    public void disconnectDevice() {
        this.tvDevice = null;
    }

    public void powerOn() {
        this.tvDevice.powerOn();
    }

    public void powerOff() {
        this.tvDevice.powerOff();
    }

    public void setChannel(int channel) {
        this.tvDevice.setChannel(channel);
    }

    public int currentChannel() {
        this.tvDevice.currentChannel();
        return 0;
    }

    public void upVolume() {
        this.tvDevice.upVolume();
    }

    public void downVolume() {
        this.tvDevice.downVolume();
    }

    public void mute() {
        this.tvDevice.mute();
    }

}
