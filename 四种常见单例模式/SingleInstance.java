package model;

public class SingleInstance {
 //饿汉式
	private static final SingleInstance instance = new SingleInstance();
	
	private SingleInstance(){
		
	}
	
	public static SingleInstance getInstance(){
		return instance;
	}
	
	
	//懒汉式
	
	private static SingleInstance singleTon;
	
	public static synchronized SingleInstance getSingleTon(){
		if(singleTon == null){
			singleTon = new SingleInstance();
		}
		return singleTon;
	}
	
	//双重检测（DCL）
	
	
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
	
	
	//静态内部类实现单例
	
	private SingleInstance sNewInstance;
	
	private static class SigleInnerClass{
		private static final SingleInstance INSTANCE = new SingleInstance();
	}
	
	public static SingleInstance getClassInstacne(){
		return SigleInnerClass.INSTANCE;
	}
	
}
