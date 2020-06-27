package cn.sd.yz.io;

import java.io.File;

/**
 * ���õݹ��ӡ�ļ����ļ���
 * @author Yin
 *
 */
public class TestDir03 {
	public static void main(String[] args) {
		File file = new File("D:/�������");
		printFile(file,0);
	}
	
	public static void printFile(File file,int level) {
		//�����жϴ��������ļ��Ƿ���ڣ������ڱ���
		if(file == null || !file.exists()) {      //�ݹ�ͷ    
			throw new RuntimeException("�ļ������ڣ�");
		}
		
		for(int i=0;i<level;i++) {   //����һ������ǰ��ӡ-�����ָ��Ӽ������Ʋ�θ�
			System.out.print("-");
		}
		
		System.out.println(file.getName());   //��ӡ�ļ���
		
		if(file.isDirectory()) {   //�ж��Ƿ�ΪĿ¼������Ǿ�չ�������õݹ�		
			File[] src = file.listFiles();
			for(File f:src) {			
				printFile(f,level+1);	//�ݹ���		
			}
		}
	}
	
}
