import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		int vet[] = new int[10];
		//fill vector with random numbers
		for(int i = 0; i < 10; i++) {
			vet[i] = r.nextInt(10);
			if(i < 9) {
				System.out.print(vet[i]+", ");
			}else {
				System.out.println(vet[i]);
			}
		}
		//sort vector with insertion
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
		//print ordered vector
		for(int i = 0; i < 10; i++) {
			if(i < 9) {
				System.out.print(vet[i]+", ");
			}else {
				System.out.println(vet[i]);
			}
		}
	}

}
