package br.com.zup.teste;

import rede.social.exer.Facebook;
import rede.social.exer.Instagram;

public class TesteRedeSocial {
	
	public static void main(String[] args) {
		
		
	 Facebook facebook = new Facebook (100, 200, "t14g0", 2);
	 
	 System.out.println(facebook);
	 
	 Instagram instagram = new Instagram (100, 120, "yoko", 131);
	 
	 System.out.println(instagram);
	 
	}

}
