
public class MeuProcesso implements Runnable{
	private int id;
	public MeuProcesso(int id){
		this.id = id;
	}
	
	public void run(){
		for (int i=0; i<1000 ; i++){
			System.out.println("id: "+id+" iteracao: "+i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
