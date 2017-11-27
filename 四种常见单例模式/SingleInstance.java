package model;

public class SingleInstance {
 //����ʽ
	private static final SingleInstance instance = new SingleInstance();
	
	private SingleInstance(){
		
	}
	
	public static SingleInstance getInstance(){
		return instance;
	}
	
	
	//����ʽ
	
	private static SingleInstance singleTon;
	
	public static synchronized SingleInstance getSingleTon(){
		if(singleTon == null){
			singleTon = new SingleInstance();
		}
		return singleTon;
	}
	
	//˫�ؼ�⣨DCL��
	
	
	private static SingleInstance sInstance;
	
	public static SingleInstance getDCLInstance(){
		if(sInstance == null){
			synchronized(SingleInstance.class){
				if(sInstance == null){
					sInstance = new SingleInstance();
				}
			}
		}
		
		return sInstance;
	}
	
	
	//��̬�ڲ���ʵ�ֵ���
	
	private SingleInstance sNewInstance;
	
	private static class SigleInnerClass{
		private static final SingleInstance INSTANCE = new SingleInstance();
	}
	
	public static SingleInstance getClassInstacne(){
		return SigleInnerClass.INSTANCE;
	}
	
}
