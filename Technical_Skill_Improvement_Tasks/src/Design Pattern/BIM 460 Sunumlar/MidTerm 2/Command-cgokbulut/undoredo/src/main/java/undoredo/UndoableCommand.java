package undoredo;

interface UndoableCommand extends Command
{
    public void undo();
    public void redo();
}
