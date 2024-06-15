package thisdata;

public class AccessData {
	
	int a;
	
	public static void main(String[] args) {		
		AccessData obj = new AccessData(10);
		obj.Disp();		
	}
	
	AccessData(int a)
	{
		this.a = a;
	}	
	void Disp()
	{
		System.out.println(a);
	}
}
