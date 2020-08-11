import java.io.File;
import java.net.Socket;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import bot.botscript.RepeatableBuffer;
import bot.botscript.Script;
import bot.botscript.build.LexicalAnalyzer;
import bot.botscript.build.SyntacticParser;
import bot.botscript.build.Token;
import bot.botscript.build.grammar.GrammarParser;
import bot.botscript.lang.runtime.ScriptRuntime;
import bot.botscript.lang.runtime.rs.GenericRSPS;

/**
 *
 * @author Bot
 *
 */
public class Test {

	public static void main(String... args) throws Exception {
		final List<String> obj = Files.readAllLines(new File("test.bot").toPath());
		final List<Token> tokens = new LexicalAnalyzer().evaluate(obj.toArray(new String[obj.size()]));
		final ScriptRuntime runtime = new GenericRSPS();
		SyntacticParser syntacticParser = new SyntacticParser(runtime, tokens);
		// syntacticParser.parse(runtime);
		Script script = syntacticParser.parse(runtime);
		runtime.run(script);
	}
}
