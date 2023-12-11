package test;
import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Encrypt ec = new Encrypt();
		Decrypt dc = new Decrypt();
		Determine de = new Determine();
		Generate ge = new Generate();
		
		Boolean flag = true;
		while(flag)
		{
			System.out.println("=========================");
			System.out.println("    欢迎使用密码管理系统");
			System.out.println("=========================");
			System.out.println("        请选择操作:");
			System.out.println("1.加密\n2.解密\n3.判断密码强度\n4.密码生成\n5.退出\n");
			
			System.out.printf("\n请输入选项序号：");
			switch(scanner.nextInt())
			{
			case 1:
				ec.encrypt();
				break;
			case 2:
				dc.decrypt();
				break;
			case 3:
				de.determine();
				break;
			case 4:
				ge.generate();
				break;
			case 5:
				System.exit(0);
			}
		}
		
		scanner.close();
	}
}
