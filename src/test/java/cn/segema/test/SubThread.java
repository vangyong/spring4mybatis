package cn.segema.test;

public class SubThread extends Thread {

	private final int i;

	public SubThread(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		System.out.println(i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
