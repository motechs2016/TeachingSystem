package net;

import java.net.*;
import java.util.Timer;
import java.util.TimerTask;
import java.io.*;

public class Net {
	public Socket sock;
	public InputStreamReader reader;
	public PrintWriter writer;
	//public Timer send_timer, get_timer;
	
	public Net(){
		try{
		sock=new Socket("127.0.0.1",4000);
		reader=new InputStreamReader(sock.getInputStream());
		writer=new PrintWriter(sock.getOutputStream());
	/*	send_timer=new Timer(true);
		send_timer.schedule(new TimerTask(){
			public void run(){
				sendMessage("heartbeat");
			}
		}, 0, 2000);
		}catch(Exception e){
			e.printStackTrace();
		}
		get_timer=new Timer(true);
		get_timer.schedule(new TimerTask(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				String m=getMessage();
				
			}
			
		}, 0, 2000);*/
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void sendMessage(String message){
		writer.println(message);
		writer.flush();
	}
	
	public String getMessage(){
		String message=null;
		try{
		BufferedReader br=new BufferedReader(reader);
		message=br.readLine();
		}catch(Exception e){
			e.printStackTrace();
		}
		return message;
	}
}
