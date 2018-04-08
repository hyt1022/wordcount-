import java.util.ArrayList;
import java.util.StringTokenizer;

//���ʷָ�
public class WordSplit
{
    private static String CutConnector(String originWord) //ȥ���ַ�����β��'-'
    {
        int length = originWord.length();   //�ַ�������
        int begin = 0;  //�ַ����ײ�
        int end = length - 1;  //�ַ���ĩβ

        while(begin < length && originWord.charAt(begin) == '-')  //ȥ���ײ���'-'
            begin++;
        while(end >= 0 && originWord.charAt(end) == '-')    //ȥ��ĩβ��'-'
            end--;

        if(begin > end)
            return "";
        else
            return originWord.substring(begin, end + 1);
    }

    public static void split1(String line, ArrayList<String> wordST)   //��һ���ı��ĵ��ʷָ����
    {
        StringTokenizer words = new StringTokenizer(line,"~`!#%^&*_()[]+=:;\"\'|<>,./? \t0123456789{}\\");   //���ʷָ�
        while(words.hasMoreTokens())
        {
            String strWord = CutConnector(words.nextToken());
            wordST.add(strWord.toLowerCase());
        }
    }
    public static void split(String line, ArrayList<String> wordST)
    {
    	char[] Line = line.toCharArray();
    	String temp;
    	int p = 0;
    	while(p<line.length())
    	{
    		if((Line[p]>= 'a'&&Line[p]<='z')||(Line[p]>= 'A'&&Line[p]<='Z'))
    		{
    			int a = p;//��¼�ַ�����ʼ������
    			while((Line[p]>= 'a'&&Line[p]<='z')||(Line[p]>= 'A'&&Line[p]<='Z')||Line[p] == '-')//��ȡ���ʵ�ѭ��
    			{
    				if(Line[p] == '-')
    				{
    					if(p+1==line.length())//���'-'�����һ���ַ�������ѭ��
    						break;
    					if(!((Line[p+1]>= 'a'&&Line[p+1]<='z')||(Line[p+1]>= 'A'&&Line[p+1]<='Z')))//���'-'���治����ĸ������ѭ��
    						break;
    				}
    				p++;
    				if(p==line.length())
    					break;
    			}
    			temp = line.substring(a,p);//��ȡ�������
    			wordST.add(temp.toLowerCase());
    		}
    		else
    			p++;
    	}
    }

}