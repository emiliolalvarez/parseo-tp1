package ar.edu.unq.parser;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FlechaListenerParserTest {

    @Test
    public void output01() throws IOException {
        String content = FileReader.readFile("test01.input");
        ParserRunner runner = new ParserRunner();
        String output = runner.run(content);
        assertEquals(FileReader.readFile("test01.expected"), output);
    }

    @Test
    public void output02() throws IOException {
        String content = FileReader.readFile("test02.input");
        ParserRunner runner = new ParserRunner();
        String output = runner.run(content);
        assertEquals(FileReader.readFile("test02.expected"), output);
    }

    @Test
    public void output03() throws IOException {
        String content = FileReader.readFile("test03.input");
        ParserRunner runner = new ParserRunner();
        String output = runner.run(content);
        assertEquals(FileReader.readFile("test03.expected"), output);
    }

    @Test
    public void output04() throws IOException {
        String content = FileReader.readFile("test04.input");
        ParserRunner runner = new ParserRunner();
        String output = runner.run(content);
        assertEquals(FileReader.readFile("test04.expected"), output);
    }

    @Test
    public void output05() throws IOException {
        String content = FileReader.readFile("test05.input");
        ParserRunner runner = new ParserRunner();
        String output = runner.run(content);
        assertEquals(FileReader.readFile("test05.expected"), output);
    }


}