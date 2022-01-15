
public class Thread01 {

	public static void main(String[] args) {
		System.out.println("main starting - > ");
		final String s1 = "dead";
		final String s2 = "lock";
	
	new Thread(new Runnable()
			{
				public void run(){
					try {
					synchronized(s1) {
						System.out.println(Thread.currentThread().getName() + "acquired s1 lock...");
						Thread.sleep(400);
						synchronized(s2) {
							System.out.println("after acquiring lock of s1 and s2 in that order ...");
						}
					}
					}catch(Exception e) {e.printStackTrace();}
				}
			}).start();
	
	new Thread(new Runnable()
	{
		public void run(){
			try {
			synchronized(s2) {
				System.out.println(Thread.currentThread().getName() + "acquired s2 lock....");
				Thread.sleep(400);
				synchronized(s1) {
					System.out.println("after acquiring lock of s2 and s1 in that order ...");
				}
			}
		}catch(Exception e) {e.printStackTrace();}
		}
	}).start();
	System.out.println("main ending - > ");

	}
}