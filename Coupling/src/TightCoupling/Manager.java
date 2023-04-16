package TightCoupling;

public class Manager {

	lazyWorker lw;
	smartWorker sw;
	ExtraSmartWorker es;
	public Manager(lazyWorker lw, smartWorker sw,ExtraSmartWorker es) {
		super();
		this.lw = lw;
		this.sw = sw;
		this.es=es;
	}
	public void managerWork() {
		lw.work();
		sw.work();
		es.work();
	}

}
