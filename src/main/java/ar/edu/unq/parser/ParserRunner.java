package ar.edu.unq.parser;

import ar.edu.unq.parser.antlr4.FlechaLexer;
import ar.edu.unq.parser.antlr4.FlechaListener;
import ar.edu.unq.parser.antlr4.FlechaParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ParserRunner {

    public String run(String input) {
        return walk(input);
    }

    private String walk(String input) {

        FlechaParser parser = getParser(input);
        FlechaListenerParser listener = getListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        ParseTree tree = parser.program();
        walker.walk(listener,tree);
        return listener.getOutput();
    }

    private FlechaParser getParser(String input) {
        FlechaLexer lexer = new FlechaLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FlechaParser parser = new FlechaParser(tokens);
        return parser;
    }

    private FlechaListenerParser getListener() {
        return new FlechaListenerParser();
    }
}
