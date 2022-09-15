import java.util.Random;

public class Main {
	int vet[] = new int[10];
	
	public static void main(String[] args) {
		Main m = new Main();
		m.randomic();
		//print random vector
		for(int i = 0; i < 10; i++) {
			if(i < 9) {
				System.out.print(m.vet[i]+", ");
			}else {
				System.out.println(m.vet[i]);
			}
		}
		m.insertionSort();
		//print ordered vector
		for(int i = 0; i < 10; i++) {
			if(i < 9) {
				System.out.print(m.vet[i]+", ");
			}else {
				System.out.println(m.vet[i]);
			}
		}
	}
	
	public void randomic() {
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			vet[i] = r.nextInt(10);
		}
	}
	
	public void insertionSort() {
		int x, j, aux;
		for(int i = 1; i < 10; i++) {
			x = vet[i];
			j = i-1;
			
			while(x < vet[j]) {
				aux = vet[j];
				vet[j] = x;
				vet[j+1]= aux;
				if(j>0) {
					j--;
				}
			}
			
		}
	}

}
