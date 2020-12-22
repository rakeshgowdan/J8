package com.rakesh.demo;

import java.util.Base64;

public class Demo {

	public static void main(String[] args) {
		//value
		//encode  
        Base64.Encoder encoder = Base64.getEncoder();  
        String str="this is base64";
        byte[] b=str.getBytes();
        byte[] s1=encoder.encode(b);
        System.out.println("encodedValue--> "+s1);
        
        //decode
        Base64.Decoder decode=Base64.getDecoder();
        String s2=new String(decode.decode(s1));
        System.out.println("decodedValue---> "+s2);
        
        //URL
        //encode
        Base64.Encoder encoder1 = Base64.getUrlEncoder();  
        String url="www.google.com";
        String encodedUrl=encoder1.encodeToString(url.getBytes());
        System.out.println("Url--> "+encodedUrl);
        
        //Decode
        Base64.Decoder decode1 = Base64.getUrlDecoder();  
        String decodedUrl=new String (decode1.decode(encodedUrl));
        System.out.println("decodedUrl--> "+decodedUrl);
	}
}
