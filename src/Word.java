
//���������ʷ�װ����
public class Word
{
    private String strWord;   //�����ַ���
    private int num = 1;    //���ʳ��ִ���

    public Word(String strWord)
    {
        this.strWord = strWord;
    }

    public String getStrWord()  //��ȡ�����ַ���
    {
        return strWord;
    }

    public int getNum() //��ȡ���ʳ��ִ���
    {
        return num;
    }

    public void incNum()    //��������+1
    {
        this.num += 1;
    }

    @Override
    public boolean equals(Object obj)   //��дequals��������strWord��ֵ���ж�Word����ͬ
    {
        if (obj instanceof Word)
            return this.getStrWord().equals(((Word) obj).getStrWord());
        else
            return false;
    }
}