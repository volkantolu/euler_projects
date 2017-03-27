package command;

public class previousChannel implements Command
{
    private TV tv;

    public previousChannel(TV tv)
    {
        this.tv = tv;
    }

    public void execute()
    {
        tv.decChannel();
    }
}
