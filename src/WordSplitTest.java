import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;

public class WordSplitTest {
	
	private ArrayList<String> wordtest = new ArrayList<String>(); 
	private ArrayList<String> wordtrue = new ArrayList<String>();
	private String line;
	
	public void readline(String filename)
	{
		try {
			FileReader in = new FileReader(filename);
			char[] text = new char[100];
			in.read(text);
			line = new String(text);
		}
		catch(IOException e)
		{
		}
	}

	@Test
	public void testSplit1() throws IOException{
		readline("testsplit1.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("word");
		assertEquals(wordtrue, wordtest);
	}
	@Test
	public void testSplit2() throws IOException{
		readline("testsplit2.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("my");
		wordtrue.add("name");
		wordtrue.add("is");
		wordtrue.add("hyt");
		assertEquals(wordtrue, wordtest);
	}
	@Test
	public void testSplit3() throws IOException{
		readline("testsplit3.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("word");
		wordtrue.add("word");
		wordtrue.add("word");
		assertEquals(wordtrue, wordtest);
	}
	@Test
	public void testSplit4() throws IOException{
		readline("testsplit4.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("counter-productive");
		wordtrue.add("counter-productive");
		wordtrue.add("counter-productive");
		assertEquals(wordtrue, wordtest);
	}
	@Test
	public void testSplit5() throws IOException{
		readline("testsplit5.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("free-for");
		wordtrue.add("free-for-all");
		wordtrue.add("free-for-all-people");
		assertEquals(wordtrue, wordtest);
	}
	@Test
	public void testSplit6() throws IOException{
		readline("testsplit6.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("love-me");
		wordtrue.add("love");
		wordtrue.add("me");
		wordtrue.add("love");
		wordtrue.add("me");
		assertEquals(wordtrue, wordtest);
	}
	@Test
	public void testSplit7() throws IOException{
		readline("testsplit7.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("let");
		wordtrue.add("s");
		wordtrue.add("go");
		wordtrue.add("to");
		wordtrue.add("my");
		wordtrue.add("father");
		wordtrue.add("s");
		wordtrue.add("home");
		assertEquals(wordtrue, wordtest);
	}
	@Test
	public void testSplit8() throws IOException{
		readline("testsplit8.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("table");
		wordtrue.add("table");
		wordtrue.add("table-s");
		wordtrue.add("table-s");
		assertEquals(wordtrue, wordtest);
	}
	@Test
	public void testSplit9() throws IOException{
		readline("testsplit9.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("table");
		wordtrue.add("table");
		wordtrue.add("s");
		wordtrue.add("tables");
		wordtrue.add("tables-s");
		assertEquals(wordtrue, wordtest);
	}
	@Test
	public void testSplit10() throws IOException{
		readline("testsplit10.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("table");
		wordtrue.add("s-s");
		wordtrue.add("tables");
		assertEquals(wordtrue, wordtest);
	}
	@Test
	public void testSplit11() throws IOException{
		readline("testsplit11.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("s");
		wordtrue.add("s");
		wordtrue.add("s-s");
		assertEquals(wordtrue, wordtest);
	}
	@Test
	public void testSplit12() throws IOException{
		readline("testsplit12.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("see");
		wordtrue.add("you");
		wordtrue.add("again");
		wordtrue.add("see");
		wordtrue.add("you");
		wordtrue.add("again");
		wordtrue.add("see-you-again");
		assertEquals(wordtrue, wordtest);
	}
	@Test
	public void testSplit13() throws IOException{
		readline("testsplit13.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("night-mare");
		wordtrue.add("night");
		wordtrue.add("mare");
		wordtrue.add("mare");
		assertEquals(wordtrue, wordtest);
	}
	@Test
	public void testSplit14() throws IOException{
		readline("testsplit14.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("arraylist");
		wordtrue.add("string");
		wordtrue.add("new");
		wordtrue.add("arraylist");
		assertEquals(wordtrue, wordtest);
	}
	@Test
	public void testSplit15() throws IOException{
		readline("testsplit15.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("we");
		wordtrue.add("are");
		wordtrue.add("the");
		wordtrue.add("world");
		wordtrue.add("we");
		wordtrue.add("are");
		wordtrue.add("the");
		wordtrue.add("chid-ren");
		assertEquals(wordtrue, wordtest);
	}
	@Test
	public void testSplit16() throws IOException{
		readline("testsplit16.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("test");
		wordtrue.add("test-s");
		wordtrue.add("i-s");
		wordtrue.add("test-s");
		assertEquals(wordtrue, wordtest);
	}
	@Test
	public void testSplit17() throws IOException{
		readline("testsplit17.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("never");
		wordtrue.add("say");
		wordtrue.add("never-say");
		wordtrue.add("ss-asd");
		wordtrue.add("s");
		wordtrue.add("never");
		wordtrue.add("s-s");
		assertEquals(wordtrue, wordtest);
	}
	@Test
	public void testSplit18() throws IOException{
		readline("testsplit18.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("s");
		wordtrue.add("d");
		wordtrue.add("s");
		wordtrue.add("we");
		assertEquals(wordtrue, wordtest);
	}
	@Test
	public void testSplit19() throws IOException{
		readline("testsplit19.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("the-club");
		wordtrue.add("isn");
		wordtrue.add("t");
		wordtrue.add("best");
		wordtrue.add("place");
		wordtrue.add("to");
		wordtrue.add("find");
		wordtrue.add("lover");
		wordtrue.add("s-s");
		wordtrue.add("so");
		wordtrue.add("the");
		wordtrue.add("bar");
		wordtrue.add("is");
		wordtrue.add("where");
		wordtrue.add("i");
		wordtrue.add("go");
		assertEquals(wordtrue, wordtest);
	}
	@Test
	public void testSplit20() throws IOException{
		readline("testsplit20.txt");
		WordSplit.split(line, wordtest);
		wordtrue.add("s");
		wordtrue.add("s");
		wordtrue.add("s-s");
		assertEquals(wordtrue, wordtest);
	}

}
