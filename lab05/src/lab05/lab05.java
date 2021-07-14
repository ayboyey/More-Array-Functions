package lab05;
import java.util.Arrays;
public class lab05 {
	   public static void convertintegerarray(int guess) {
	        String temp = Integer.toString(guess);
	        int[] newGuess = new int[temp.length()];
	        for (int i = 0; i < temp.length(); i++) {

	            newGuess[i] = temp.charAt(i) - '0';

	        }
	    }

	    public static int[] addNumberArrays(int[] a1, int[] a2) {
	        int[] a3;

	        a3 = new int[Math.max(a1.length, a2.length)];

	        int i;
	        int j;
	        int k;
	        i = a1.length - 1;

	        j = a2.length - 1;

	        k = 0;
	        int memo = 0;

	        while (i >= 0 && j >= 0) {
	            int temp = a1[i] + a2[j];
	            if (memo > 0) {
	                temp = temp + memo;
	            }

	            a3[k] = temp % 10;

	            if (temp > 9) {
	                memo = 1;
	            } else {
	                memo = 0;
	            }
	            j = j - 1;
	            i = i - 1;
	            k = k + 1;

	        }
	        while (i >= 0) {
	            a3[k] = a1[i];
	            i = i - 1;
	            k = k + 1;
	        }

	        while (j >= 0) {

	            a3[k] = a2[j];
	            j = j - 1;
	            k = k + 1;
	        }
	        for(int f = 0; f < a3.length / 2; f++)
	        {
	            int temp = a3[f];
	            a3[f] = a3[a3.length - f - 1];
	            a3[a3.length - f - 1] = temp;
	        }

	        return a3;

	    }

	    public static void main(String[] args) {
	        int a1[] = { 1, 9 };
	        int a2[] = { 8, 2, 3 };
	        int a3[];
	        a3 = addNumberArrays(a1, a2);

	        for (int i = 0; i < a3.length; i++) {

	            System.out.println(a3[i]);
	        }

	    }

	}

