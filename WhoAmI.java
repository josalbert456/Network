package org.albert.network;
import java.net.*;

public class WhoAmI{
	public String getAddress(String domain) throws Exception{
		String addr = InetAddress.getByName(domain).toString();
		addr = addr.substring(addr.indexOf('/')+1);
		return addr;
	}
}