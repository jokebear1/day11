package day11;
import java.util.StringTokenizer;
public class name {
	public static void main(String[] args) {
		String query="name=kitea&addr=seouk&age=21";
		StringTokenizer st=new StringTokenizer(query,"&");
		
		int n=st.countTokens();
		System.out.println("토큰 개수= "+n);
		
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			System.out.println(token);
		}
				
				
	}

}
