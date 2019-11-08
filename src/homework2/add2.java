package homework2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class add2 {

	static Map<Integer,String> z=new HashMap<> ();//算式
	static Map<Integer,Integer> p=new HashMap<> ();//答案
	static Random random=new Random();
	public static boolean check(int x,int y,int k) {//判断是否组成算式
		int num;
		if(random.nextInt(2)==1) {
			if(x+y>100) return false;//避免答案大于100
			num=x+y;
	    	String s=x+"+"+y+"=";
			return add(s,num,k);
		}else {
			String s;
			if(x>y) s=x+"-"+y+"=";//避免答案出现负数
			else s=y+"-"+x+"=";
			num=Math.abs(x-y);
			return take(s,num,k);
		}
	}
	public static boolean add(String s,int num,int k) {//加法判重，算式存储，答案存储
    	if(z.get(s)==null)//避免出现算式相同
		{
			p.put(k, num);z.put(k, s);
			return true;
		}
    	return false;
	}
	public static boolean take(String s,int num,int k) {//减法判重，算式存储，答案存储
		if(z.get(s)==null)
		{
			p.put(k, num);z.put(k, s);
			return true;
		}
		return false;
	}
	public static void findprint() {//查询答案
		Scanner in=new Scanner(System.in);
		System.out.println("查询答案，输入题号:");
    	int f=in.nextInt();
    	System.out.println(z.get(f-1)+p.get(f-1));
	}
	public static void print() {//输出算式
		for(int i=0;i<=49;i+=3) {
    		for(int j=0;j<=2&&i+j!=50;++j)
    		System.out.print("第"+(i+j+1)+"题"+z.get(i+j)+"   ");
    		System.out.println();
    	}
	}
	public static void in() {
		Scanner in=new Scanner(System.in);
    	String s;
    	int num,k=0;
    	while(true){
    		int x=random.nextInt(101);//生成100以内的整数，包含100
    		int y=random.nextInt(101);
    		if(check(x,y,k)==true) k++;//算式成立
    		if(k==50) break;
    	}
	}
    public static void main(String[] args) {
    	in();//造数据
    	print();//输出算式
    	findprint();//查询答案
	}
}
