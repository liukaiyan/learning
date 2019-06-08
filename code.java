public class SingleThread extends Thread{
	int count;
	public SingleThread(int count){
		this.count = count;
	}
	public void run(){
		System.out.println("Who are you?");
	}
}

//------------------The first modify--------------------
