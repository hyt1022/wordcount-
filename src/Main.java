import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Main
{
    private static String getFilePathInDialog() //ͨ�����ڽ�����ļ�
    {
        //��ʼ���ļ�ѡ���
        JFileChooser fDialog = new JFileChooser();
        fDialog.setDialogTitle("��ѡ�������ļ�");

        int returnVal = fDialog.showOpenDialog(null);   //����ѡ���
        if(JFileChooser.APPROVE_OPTION == returnVal)    //����ѡ����ļ�·����
            return fDialog.getSelectedFile().getPath();
        else
            return "";
    }

    private static void ResultOutput(ArrayList<Word> wordArr) throws IOException    //���ͳ�ƽ��
    {
        File outputFile = new File("result.txt"); //�򿪴洢�ļ�
        BufferedWriter output = new BufferedWriter(new FileWriter(outputFile)); //���������

        for(Word word : wordArr)    //��ͳ�ƽ��д�뻺����
            output.write(word.getStrWord() + "\t" + word.getNum() + "\r\n");

        output.flush(); //�ѻ���������д������ļ���
        output.close(); //�ر��ļ�
    }

    public static void main(String[] args) throws IOException
    {
        String filePath = "";    //�������ж�ȡ�������ļ�·��
        int errorType = -1;

        //��ȡ����������
        if(args == null || args.length == 0)
            errorType = 0;
        else if(args[0].equals("-x")) //ʹ�ô��ڽ������ļ�·��
        {
            filePath = getFilePathInDialog();
            if(filePath.length() == 0)
                errorType = 1;
        }
        else    //ͨ�������л���ļ�·��
            filePath = args[0];

        if(errorType == 0)  //�����������ʽ��
            System.out.println("�����ʽ����");
        else if(errorType == 1) //���ڽ���δ���ļ�
            System.out.println("δ�������ļ���");
        else
        {
            WordCount m_WordCount = new WordCount(filePath);    //���ļ�
            m_WordCount.Count();    //ͳ��

            ResultOutput(m_WordCount.getWordArr()); //������
        }
    }
}