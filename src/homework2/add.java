package homework2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class add {

	static Map<Integer,String> z=new HashMap<> ();//算式
	static Map<Integer,Integer> p=new HashMap<> ();//算式答案
	static int num,k=0;
	public static boolean add(int x,int y,int k) {
		if(x+y>100) return false;
		num=x+y;
    	String s=x+"+"+y+"=";
    	if(z.get(s)==null)
		{
			p.put(k, num);z.put(k, s);
			return true;
		}
    	return false;
	}
	public static boolean take(int x,int y,int k) {
		String s;
		if(x>y) s=x+"-"+y+"=";
		else s=y+"-"+x+"=";
		num=Math.abs(x-y);
		if(z.get(s)==null)
		{
			p.put(k, num);z.put(k, s);
			return true;
		}
		return false;
	}
    public static void main(String[] args) {
		
    	int i;
    	Random random=new Random();
    	Scanner in=new Scanner(System.in);
    	String s;
    	while(true){
    		int x=random.nextInt(101);//生成100以内的整数，包含100
    		int y=random.nextInt(101);
    		int flag=random.nextInt(2);//生成符号标记
    		if(flag==0&&take(x,y,k)==true) k++;
    		if(flag==1&&add(x,y,k)==true) k++;
    		if(k==50) break;
    	}
    	for(i=0;i<=49;i+=3) {
    		for(int j=0;j<=2&&i+j!=50;++j)
    		System.out.print("第"+(i+j+1)+"题"+z.get(i+j)+"   ");
    		System.out.println();
    	}
    	System.out.println("查询答案，输入题号:");
    	int f=in.nextInt();
    	System.out.println(z.get(f)+p.get(f));
	}
}
