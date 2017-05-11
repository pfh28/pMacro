package pmacro;

public class Command
{
    public static final int PRESS = 0;
    public static final int RELEASE = 1;
    public static final int DELAY = 2;

    private int cmdType;
    private int value;

    public Command(int cmdType, int value)
    {
        this.cmdType = cmdType;
        this.value = value;
    }

    public int getCmdType()
    {
        return Math.abs(cmdType);
    }

    public int getValue()
    {
        return value;
    }
}
