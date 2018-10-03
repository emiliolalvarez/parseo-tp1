package ar.edu.unq.parser;


import ar.edu.unq.parser.antlr4.FlechaLexer;
import ar.edu.unq.parser.antlr4.FlechaListener;
import ar.edu.unq.parser.antlr4.FlechaParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {

    public static void main(String[] args) throws Exception {
        String content = readFile("test01.input");
        FlechaLexer lexer = new FlechaLexer(CharStreams.fromString(content));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FlechaParser parser = new FlechaParser(tokens);
        ParseTree tree = parser.program();
        FlechaListener listener = new FlechaListenerParser();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,tree);
    }

    static String readFile(String path) throws IOException {
        ClassLoader classLoader = Main.class.getClassLoader();
        File file = new File(classLoader.getResource(path).getFile());
        byte[] encoded = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
        return new String(encoded);
    }
}
