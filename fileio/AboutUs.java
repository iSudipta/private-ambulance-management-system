package fileio;
import java.io.*;
public class AboutUs
{
	public void aboutUs()
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("fileio/About.txt"));
			String s;
			while((s = br.readLine()) !=null)
			{
				System.out.println(s);
			}
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}