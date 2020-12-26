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
			Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
			for(int i=0; i<n; ++i) {
				int a=in.nextInt();
				mp.put(a, mp.getOrDefault(a, 0)+1);
			}
			Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
			for(Map.Entry<Integer, Integer> entry : mp.entrySet())
				cnt.put(entry.getValue(), cnt.getOrDefault(entry.getValue(), 0)+1);
			int mx=0;
			for(Map.Entry<Integer, Integer> entry : cnt.entrySet())
				mx=Math.max(mx, entry.getValue());
			int mn=Integer.MAX_VALUE;
			for(Map.Entry<Integer, Integer> entry : cnt.entrySet())
				if(entry.getValue()==mx)
					mn=Math.min(mn, entry.getKey());
			out.println(mn);
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
