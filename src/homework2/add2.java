package homework2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class add2 {

	static Map<Integer,String> z=new HashMap<> ();//��ʽ
	static Map<Integer,Integer> p=new HashMap<> ();//��
	static Random random=new Random();
	public static boolean check(int x,int y,int k) {//�ж��Ƿ������ʽ
		int num;
		if(random.nextInt(2)==1) {
			if(x+y>100) return false;//����𰸴���100
			num=x+y;
	    	String s=x+"+"+y+"=";
			return add(s,num,k);
		}else {
			String s;
			if(x>y) s=x+"-"+y+"=";//����𰸳��ָ���
			else s=y+"-"+x+"=";
			num=Math.abs(x-y);
			return take(s,num,k);
		}
	}
	public static boolean add(String s,int num,int k) {//�ӷ����أ���ʽ�洢���𰸴洢
    	if(z.get(s)==null)//���������ʽ��ͬ
		{
			p.put(k, num);z.put(k, s);
			return true;
		}
    	return false;
	}
	public static boolean take(String s,int num,int k) {//�������أ���ʽ�洢���𰸴洢
		if(z.get(s)==null)
		{
			p.put(k, num);z.put(k, s);
			return true;
		}
		return false;
	}
	public static void findprint() {//��ѯ��
		Scanner in=new Scanner(System.in);
		System.out.println("��ѯ�𰸣��������:");
    	int f=in.nextInt();
    	System.out.println(z.get(f-1)+p.get(f-1));
	}
	public static void print() {//�����ʽ
		for(int i=0;i<=49;i+=3) {
    		for(int j=0;j<=2&&i+j!=50;++j)
    		System.out.print("��"+(i+j+1)+"��"+z.get(i+j)+"   ");
    		System.out.println();
    	}
	}
	public static void in() {
		Scanner in=new Scanner(System.in);
    	String s;
    	int num,k=0;
    	while(true){
    		int x=random.nextInt(101);//����100���ڵ�����������100
    		int y=random.nextInt(101);
    		if(check(x,y,k)==true) k++;//��ʽ����
    		if(k==50) break;
    	}
	}
    public static void main(String[] args) {
    	in();//������
    	print();//�����ʽ
    	findprint();//��ѯ��
	}
}
