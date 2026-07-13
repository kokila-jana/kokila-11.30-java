package morning;
//class Jana extends Thread
//{
//	public void run() {
//	System.out.println("hello");
//	}
//	
//}
//public class ThreadConcepts {
//
//	public static void main(String[] args) {
//		Jana j=new Jana();
//		j.start();
//		/*
//		 * types of thread
//		 * 2 types
//		 * 1.single thread
//		 *    2 ways
//		 *    1.using Runnable interface
//		 *    2.using Thread class
//		 * 2.Multi thread
//			 * 1.Daemon thread
//			 * 2.priority thread
//			 * 3.Synchronization
//			 * 4.join() function
//		 */
//	}
//
//}


class Jana extends Thread
{
	public void run()
	{
	if(Thread.currentThread().isDaemon())
	{
		System.out.println("daemon thread...");
	}
	else
	{
		System.out.println("Not daemon thread");
	}
	}
	
}
public class ThreadConcepts {

	public static void main(String[] args) {
		Jana j=new Jana();
		Jana j1=new Jana();
		Jana j2=new Jana();
		j.setDaemon(true);
		j.start();
		j1.start();
		j2.start();
		
	}

}
