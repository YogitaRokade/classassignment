package basicprogram;
import java.util.StringTokenizer;
public class StringTokanizerEx {
	public static void main(String args[])
	{
		StringTokenizer st=new StringTokenizer("I am A girl"," ");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken(" "));
		}
	}

}
