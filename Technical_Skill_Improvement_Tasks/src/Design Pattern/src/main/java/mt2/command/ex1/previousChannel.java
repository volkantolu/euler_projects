package mt2.command.ex1;

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
