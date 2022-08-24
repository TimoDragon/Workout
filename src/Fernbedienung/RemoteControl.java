package Fernbedienung;

public class RemoteControl {
    private int currentChannel;
    private String[] channels;

    public RemoteControl() {
        currentChannel = 0;
        channels = new String[31];
        for (int i = 0; i < channels.length; i++) {
            channels[i] = i + "";
        }
    }

    public void up() {
        if (currentChannel < 30) {
            currentChannel++;
        }
        else {
            currentChannel = 0;
        }
    }

    public void down() {
        if (currentChannel > 0) {
            currentChannel--;
        }
        else {
            currentChannel = 30;
        }
    }

    public String getChannelName() {
        return channels[currentChannel];
    }

    public void saveChannelName(String name) {
        channels[currentChannel] = name;
    }
}