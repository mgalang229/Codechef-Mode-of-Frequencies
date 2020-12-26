import java.io.*;
import java.util.*;

public class Main {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int t=in.nextInt();
//		int t=1;
		for(int i=1; i<=t; ++i)
			new Solver();
		out.close();
	}
	
	static class Solver {
		Solver() {
			int n=in.nextInt();
			int[] f = new int[11];
			Arrays.fill(f, 0);
			for(int i=0; i<n; ++i) {
				int a=in.nextInt();
				f[a]++;
			}
			int[] ff = new int[10001];
			Arrays.fill(ff, 0);
			for(int i=0; i<10; ++i)
				if(f[i+1]>0)
					ff[f[i+1]]++;
			int mx=0, id=-1;
			for(int i=0; i<10000; ++i)
				if(ff[i+1]>mx) {
					mx=ff[i+1];
					id=i+1;	
				}
			out.println(id);
		}
	}
	
	static class Reader {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(in.readLine());
				} catch(Exception e) {}
			}	
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	
}
