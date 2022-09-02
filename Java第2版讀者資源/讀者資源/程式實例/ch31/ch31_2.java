import java.net.*;										
public class ch31_2 { 
	public static void main(String[] args){ 
		try {
			InetAddress ip;
			ip = InetAddress.getByName("www.facebook.com");	// ¨ú±oIP
			System.out.println("Áy®Ñfacebook IP : " + ip);
		}
		catch(UnknownHostException e) 
		{
			System.out.println(e);
		}
	}
}


