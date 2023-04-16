package TightCoupling;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
lazyWorker lw=new lazyWorker();
smartWorker sw=new smartWorker();
ExtraSmartWorker es=new ExtraSmartWorker();
Manager m=new Manager(lw,sw,es);

m.managerWork();
	}

}
