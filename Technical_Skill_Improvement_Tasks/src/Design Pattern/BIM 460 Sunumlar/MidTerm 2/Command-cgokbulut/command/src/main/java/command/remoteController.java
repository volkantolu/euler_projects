package command;

public class remoteController
{
    private Command channelUpCommand;
    private Command channelDownCommand;

    public remoteController(Command channelUpCommand,Command channelDownCommand)
    {
        this.channelUpCommand   =  channelUpCommand;
        this.channelDownCommand =  channelDownCommand;
    }

    public void channelUp()
    {
        channelUpCommand.execute();
    }

    public void channelDown()
    {
        channelDownCommand.execute();
    }

}
