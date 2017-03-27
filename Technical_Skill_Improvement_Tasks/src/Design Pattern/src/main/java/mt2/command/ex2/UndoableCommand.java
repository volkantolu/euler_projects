package mt2.command.ex2;

interface UndoableCommand extends Command
{
    public void undo();
    public void redo();
}
