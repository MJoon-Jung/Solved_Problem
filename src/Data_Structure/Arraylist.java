package Data_Structure;

public class Arraylist {
	private Object[] data;
	private int size;
	private int index;
	
	Arraylist(){
		size = 1;
		this.data = new Object[this.size];
		this.index=  0;
	}
	public Object get(int k) throws Exception{
		if(k > data.length -1) {
			throw new Exception("ArrayIndexOutOfBound");
		}
		else if(k < 0) {
			throw new Exception("Negative Value");
		}
		return this.data[k];
	}
	public void remove(int k) throws Exception{
		if(k > data.length -1) {
			throw new Exception("ArrayIndexOutOfBound");
		}
		else if(k < 0) {
			throw new Exception("Negative value");
		}
		for(int i = k; i < data.length-1; i++) {
			data[i] = data[i+1];
		}
		this.index--; 
	}
	public void add(Object obj) {
		if(this.index == this.size) {
			doubling();
		}
		data[this.index++] = obj;
	}
	public void doubling() {
		this.size *= 2;
		Object [] data2 = new Object [this.size];
		for(int i = 0; i < data.length; i++) {
			data2[i] = data[i];
		}
		data = data2;
	}
	public String toString() {
		String s = "";
		for(int i = 0; i < data.length; i++) {
			s += data[i] + " ";
		}
		return s;
	}
	public static void main(String[] args) throws Exception {
		Arraylist al = new Arraylist();
		for(int i = 0; i < 10; i++) {
			al.add(i);
		}
		System.out.println(al.get(5));
		System.out.println(al);
		al.remove(5);
		System.out.println(al.get(5));
		System.out.println(al);
	}

}
