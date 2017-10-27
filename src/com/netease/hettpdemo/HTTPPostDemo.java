package com.netease.hettpdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPPostDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ReadByPost extends Thread{
	@Override
	public void run() {
		try {
				
			
			URL url=new URL("http://fanyi.youdao.com/openapi.do");
			HttpURLConnection connection=(HttpURLConnection)url.openConnection();
			connection.setRequestProperty("encoding", "UTF-8");
			//设置允許該鏈接從網絡中獲取數據
			connection.setDoInput(true);
			//設置允許該鏈接向網絡傳輸數據
			connection.setDoOutput(true);
			
			InputStream is=connection.getInputStream();
			InputStreamReader isr=new InputStreamReader(is,"UTF-8");
			BufferedReader br=new BufferedReader(isr);
			
			
			OutputStream os=connection.getOutputStream();
			OutputStreamWriter isw=new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw=new BufferedWriter(isw);
			
			
			is.close();
			isr.close();
			br.close();
			os.close();
			isw.close();
			bw.close();
			
			System.out.println();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
