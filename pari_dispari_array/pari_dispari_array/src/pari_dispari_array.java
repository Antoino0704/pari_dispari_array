import java.util.Scanner;
public class pari_dispari_array {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int pari = 0, dispari = 0, 	i, resto = 0, val;
		int[] vett = new int[25];
		for (val=0; val<25; val++)
		{
			System.out.println("inserisci un numero");
			vett[val] = input.nextInt();
		}
		for (i=0; i<25; i++)
		{
			resto = vett[i] % 2;
			if (resto == 0)
			{
				pari = pari + vett[i];
			}
			else
			{
				dispari = dispari + vett[i];
			}
		}
		System.out.println("somma numeri pari: " + pari + "\nsomma numeri dispari: " + dispari );
		if (pari>dispari)
		{
			System.out.println("la somma dei numeri pari e' maggiore");
		}
		else
		{
			System.out.println("la somma dei numeri dispari e' maggiore");
		}
	}

}
