package mt2.command.ex1;

public class nextChannel implements Command
{
    private TV tv;

    public nextChannel(TV tv)
    {
        this.tv = tv;
    }

    public void execute()
    {
        tv.incChannel();
    }
}
