package 개인과제._20_PC방_ver2;

public class PcUse extends Thread{
	
	static boolean stop = true;
	
	public PcUse() {}
	

	
	@Override
	public void run() {
		
		while(true) {
			try {
				for(Member temp : Control.memberList) {
					if(temp.isUse() == true) {
						temp.setTime(temp.getTime() -1);
						DB.memberSave();
					}
				}
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				
			}
		}
	}
}
