package chapter1;

interface Iinterface //����һ���ӿ�  
{  
    int i=10;      //����ı���Ϊfianal���ͣ�  
    void method();  // �����ӿڷ������������з�����{}  
}  
public class Example7 implements Iinterface    //ʵ�ֽӿ�  
{  
    public void method()   //�ӿڵķ����ڴ˱��뱻��д��ע��������η�Ϊpublic  
    {  
       System.out.println("�ӿ�ʵ�ֳɹ�������");  
    }  
    public static void main(String[] args)  
    {  
    Example7 prog7 = new Example7();  
    //prog7.i=10;      �����޸ģ��ֵ��Ϊfinal����  
        prog7.method();   
    }  
}  
