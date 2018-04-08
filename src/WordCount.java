import java.io.*;
import java.util.ArrayList;

//����ͳ�ƺ��Ĺ���
public class WordCount
{
    private BufferedReader input;   //��ȡ�ļ����������ݻ����
    private ArrayList<Word> wordArr = new ArrayList<Word>();    //��¼�ļ������е��ʺͳ��ִ���

    public WordCount(String inputFilePath) throws IOException  //ͳ�ƿ�ʼǰ�ȴ������ļ�
    {
        File inputFile = new File(inputFilePath);   //��Ҫ��ȡ���ļ�
        this.input = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile)));
    }

    public ArrayList<Word> getWordArr() //��ȡwordArr
    {
        return wordArr;
    }

    public void Count() throws IOException //ͳ�Ƶ�����
    {
        String line;   //��ȡ��һ���ı�
        while ((line = input.readLine()) != null)
        {
            //���ʷָ�
            ArrayList<String> wordST = new ArrayList<String>();
            WordSplit.split(line, wordST);    //���ʷָ�
            if(wordST == null)
                continue;

            for(String m_strWord : wordST) //��ȡ���ָ�ĵ���
            {
                Word m_word = new Word(m_strWord);  //������ʶ���
                int indexOfWord = wordArr.indexOf(m_word);    //�����������е�λ��

                if (m_word.getStrWord().length() == 0)   //�������ַ���
                    continue;
                if (indexOfWord == -1)   //���ʵ�һ�γ�����Ž�����
                    wordArr.add(m_word);
                else    //�����ظ������������+1
                    wordArr.get(indexOfWord).incNum();
            }
        }
        WordSort.sort(wordArr); //����
    }
}