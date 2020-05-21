import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Plantilla{
	private static BufferedReader in;
	private static BufferedWriter out;
	
	public static void main(String[] args) throws IOException {
		open();

		StringTokenizer st;
		StringBuilder sb;
	
		out.write("Creo que ya estoy en github ez");
		//
		int x=5;
		int y=10;
		
		close();
	}
	
	public static int gcd(int a,int b) {
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
	static int count(int x, int[] arr) {
		int count = 0;
 
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == x)
				count++;
		return count;
	}
 
	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}
 
	static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
 
		while (i < j) {
 
			if (str.charAt(i) != str.charAt(j))
				return false;
 
			i++;
			j--;
		}
		return true;
	}
	static int modInverse(int a, int m) {
		int g = gcd(a, m);
		if (g != 1)
			return -1;
		else
			return power(a, m - 2, m);
 
	}
 
	// To compute x^y under modulo m
	static int power(int x, int y, int m) {
		if (y == 0)
			return 1;
 
		int p = power(x, y / 2, m) % m;
		p = (p * p) % m;
 
		if (y % 2 == 0)
			return p;
		else
			return (x * p) % m;
	}
 
	static int[] primeGenerator(int num) {
		int length = 0, arr[] = new int[num], a = num, factor = 1;
		if (num % 2 == 0) {
			while (num % 2 == 0) {
				num /= 2;
				factor *= 2;
			}
			arr[length++] = factor;
		}
		for (int i = 3; i * i <= a; i++) {
			factor = 1;
			if (num % i == 0) {
				while (num % i == 0) {
					num /= i;
					factor *= i;
				}
				arr[length++] = factor;
			}
		}
		if (num > 1)
			arr[length++] = num;
		return Arrays.copyOfRange(arr, 0, length);
	}
 
	static boolean isPrime(int n) {
		// Corner cases
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;
 
		// This is checked so that we can skip
		// middle five numbers in below loop
		if (n % 2 == 0 || n % 3 == 0)
			return false;
 
		for (int i = 5; i * i <= n; i = i + 6)
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
 
		return true;
	}
	private static int[] readInts() throws IOException {
		return Stream.of(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	}
	private static int readInt() throws IOException {
		return Integer.parseInt(in.readLine());
	}
	private static long[] readLongs() throws IOException {
		return Stream.of(in.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
	}
	private static long readLong() throws IOException {
		return Long.parseLong(in.readLine());
	}
	private static double[] readDoubles() throws IOException {
		return Stream.of(in.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
	}
	private static double readDouble() throws IOException {
		return Double.parseDouble(in.readLine());
	}
	private static String readString() throws IOException {
		return in.readLine();
	}
	private static int modulo(int S, int N) {
		return ((S) & (N - 1));
	} // returns S % N, where N is a power of 2
	private static boolean isPowerOfTwo(int S) {
		return (S & (S - 1)) == 0 ? true : false;
	}
	private static void open() {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new BufferedWriter(new OutputStreamWriter((System.out)));
	}
	private static void close() throws IOException {
		out.flush();
		out.close();
		in.close();
	}
	
}