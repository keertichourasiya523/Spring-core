package LazyCoupling;

public class Manager {
iworker iw;

public Manager(iworker iw) {
	super();
	this.iw = iw;
}
public void managerWork() {
	iw.work();
}

}
