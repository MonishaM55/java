package corejava;
import java.util.StringTokenizer;
public class TokensWithDelimiter {
 public static void main(String a[]){
	 String msg="http://10.1123.43.676:80/";
	 StringTokenizer st=new StringTokenizer(msg,"://.",true);
	 while(st.hasMoreTokens()){
		 System.out.println(st.nextToken());
	 }
	 String[] tokens="http://10.123//43.67:80/".split("//");
	 for(String token:tokens)
	 {
		 System.out.println(token);
	 }
 }
}
