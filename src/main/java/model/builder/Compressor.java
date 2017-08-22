package model.builder;

/*
 * 一个部件对象（压缩机）冰箱的核心
 */
public class Compressor {
	private String name;
	public Compressor(String name){
		this.name = name;
	}
	public String toString(){
		return this.name;
	}
}
