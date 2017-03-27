package mt2.command.ex1;

public class TV
{
    String[] channels = {"AV","TRT 1","TRT 2","TRT 3", "TRT 4", "KANAL D", "ATV", "SHOW TV","STAR","TNT","CNBC-E","FLASH",
            "NTV","NATIONAL GEOGRAPHIC","TV 8","FOX","CINE 5","E2","DREAM TV","HABER TURK"};
    int currentChannelNumber=0;

    public void incChannel()
    {
        currentChannelNumber++;
        if (currentChannelNumber==20) currentChannelNumber=0;
        System.out.println("The channel number incremented. You are at "+currentChannelNumber+
                ". channel: " + channels[currentChannelNumber]);
    }

    public void decChannel()
    {
        currentChannelNumber--;
        if (currentChannelNumber==-1) currentChannelNumber=19;
        System.out.println("The channel number decremented. You are at "+currentChannelNumber+
                ". channel: " + channels[currentChannelNumber]);
    }

}