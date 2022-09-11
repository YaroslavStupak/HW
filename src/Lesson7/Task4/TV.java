package Lesson7.Task4;

public class TV extends TVDevice{
    private int volumeLevel;
    private int channelNumber;

    public void powerOn() {
        if (isOn = false) {
            this.isOn = true;
        } else {
            System.out.println(modelName + " is already ON");
        }
    }

    public void powerOff() {
        if (isOn = true) {
            this.isOn = false;
        } else {
            System.out.println(modelName + " is already OFF");
        }
    }

    public void setChannel(int channel) {
        this.channelNumber = channel;
    }

    public int currentChannel() {
        return channelNumber;
    }

    public void upVolume() {
        this.volumeLevel += 5;
    }

    public void downVolume() {
        this.volumeLevel -= 5;
    }

    public void mute() {
        this.volumeLevel = 0;
    }
}
