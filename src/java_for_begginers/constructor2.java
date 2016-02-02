package java_for_begginers;

class husband{
	String name;
	int age;
	String quality;
	
	public husband(String quality){
		this.quality = quality;	
	}
	String getName(){
		return name;
	}
	String getQuality(){
		return quality;
	}
	int getAge(){
		return age;
	}
	void setName(String name){
		this.name = name;
	}
	void setAge(int age){
		this.age = age;
	}
	void setQuality(String quality){
		this.quality = quality;
	}
}

public class constructor2 {

	public static void main(String[] args) {
		
		husband husband1 = new husband("smart");
		
		System.out.println(husband1.getQuality());
	}
	

}
