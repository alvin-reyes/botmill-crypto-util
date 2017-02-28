package co.aurasphere.botmill.enc;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class BotMillCrypto {
	
	
	public static void main(String[] args) {
		
		String type = args[0]; //enc //dec
		String key = args[1];
		String password = args[2]; // password

		StandardPBEStringEncryptor st = new StandardPBEStringEncryptor();
		st.setPassword(password);
		
		if(type.equals("enc")) {
			System.out.println("Encrypted: " + st.encrypt(key));
		}else if(type.equals("dec")) {
			System.out.println("Decrypted: " + st.decrypt(key));
		}else {
			//	do both
			System.out.println("Encrypted: " + st.encrypt(key));
			System.out.println("Decrypted: " + st.decrypt(st.encrypt(key)));
		}
		
	}

}
