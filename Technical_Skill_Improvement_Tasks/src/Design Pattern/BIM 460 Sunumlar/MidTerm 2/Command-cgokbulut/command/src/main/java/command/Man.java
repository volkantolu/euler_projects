package command;

public class Man
{
    public static void main(String[] args)
    {
        TV television = new TV();
        Command goNext = new  nextChannel(television);
        Command goPrev = new  previousChannel(television);

        remoteController c = new remoteController(goNext,goPrev);

        c.channelUp();         c.channelUp();       c.channelUp();
        c.channelUp();         c.channelDown();     c.channelUp();
        c.channelUp();         c.channelUp();       c.channelUp();
        c.channelUp();         c.channelUp();       c.channelDown();
        c.channelDown();       c.channelDown();     c.channelUp();
        c.channelDown();       c.channelUp();       c.channelUp();
        c.channelUp();         c.channelUp();       c.channelUp();
        c.channelUp();         c.channelUp();       c.channelUp();
        c.channelUp();         c.channelUp();       c.channelUp();
        c.channelUp();         c.channelDown();     c.channelUp();
        c.channelUp();         c.channelUp();       c.channelUp();
        c.channelUp();         c.channelUp();       c.channelUp();
    }
}
