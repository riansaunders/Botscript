package bot.botscript.build.node.visitor;

import bot.botscript.build.Node;
import bot.botscript.build.NodeVisitor;
import bot.botscript.build.node.SemiColon;
import bot.botscript.lang.runtime.Instruction;

/**
 *
 * @author Bot
 *
 */
public class SemiColonVisitor implements NodeVisitor {

	@Override
	public boolean visit(Node node) {
		if (!node.is(SemiColon.class)) {
			return false;
		}
		node.parser().code().instruct(new Instruction(Instruction.END));
		return true;
	}
}