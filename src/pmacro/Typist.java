package pmacro;

import java.awt.Robot;
import java.util.ArrayList;

public class Typist
{
	Robot rob;

	public Typist()
	{
		try
		{
			rob = new Robot();
			rob.setAutoDelay(250);
		}catch(Exception e)
		{e.printStackTrace();}
	}
//format: keys, time delays:[p/r/t,<key>/<ms>]
	public void type(ArrayList<Command> commands)
	{
		for(Command cmd : commands)
		{
			switch(cmd.getCmdType())
			{
				case Command.PRESS:
					rob.keyPress(cmd.getValue());
					break;
				case Command.RELEASE:
					rob.keyRelease(cmd.getValue());
					break;
				case Command.DELAY:
					rob.delay(cmd.getValue());
					break;
			}
		}
	}
}