package pmacro;

import pmacro.parser.MacroParser;
import java.util.ArrayList;

public class MacroMain
{
	public static void main(String[] args)
	{
		Typist typist = new Typist();
		MacroParser parser = new MacroParser();
		ArrayList<Command> cmds = parser.parseFile("test.txt");

		typist.type(cmds);
	}
}