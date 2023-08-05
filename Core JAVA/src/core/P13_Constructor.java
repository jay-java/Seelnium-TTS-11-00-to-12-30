package core;
//constructor-> is special member function of class which has same name as
//				class name
//			 -> automatically called when object is created
//			 -> have no return type
//			 -> Three types-> 1.Default 2.Parameterized 3.Copy(object cloning)
class Data{
	int i,j;
	String name;
	Data(){
		System.out.println("hello default cons");
	}
	Data(int i){
		this.i = i;
		System.out.println("hello para cons : "+i);
	}
	Data(int i,int j){
		System.out.println("hello 2 para cons");
	}
	Data(String name){
		System.out.println("string arg cons");
	}
	public void call() {
		System.out.println("hello call function : "+i);
	}
}
class NewData{
	int i;
	String name;
	double value;
	public NewData() {
	}
	public NewData(int i,String name,double value) {
		this.i = i;
		this.name=name;
		this.value=value;
	}
	public void setI(int i) {
		this.i=i;
	}
	public int getI() {
		return i;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setValue(double value) {
		this.value=value;
	}
	public double getValue() {
		return value;
	}
}
class Hello{
	Hello(){
		
	}
	public void run() {
		System.out.println("run function in hello class");
	}
}
public class P13_Constructor {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.run();
		Data d = new Data();
		d.call();
		NewData d1 = new NewData();
		d1.setI(12);
		d1.setName("java");
		d1.setValue(234.3);
		System.out.println(d1.getI());
		System.out.println(d1.getName());
		System.out.println(d1.getValue());
		
	}
}
