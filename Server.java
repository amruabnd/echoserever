import java.io.*;
import java.net.*;

public class Server
{
	public EchoServer(int portnum)
{
		try
		{
			server = new ServerSocket(portnum);
		}
