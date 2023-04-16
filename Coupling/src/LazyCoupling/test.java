package LazyCoupling;

public class test {

	public static void main(String[] args) {
		
		lazyWorker lw=new lazyWorker();
		Manager m=new Manager(lw);
		m.managerWork();
		
		SmartWorker sw=new SmartWorker();
		m=new Manager(sw);
		m.managerWork();
		
		ExtraSmartWorker es=new ExtraSmartWorker();
		m=new Manager(es);
		m.managerWork();
	}

}
