package Demo1;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmailJava {

	public static void main(String[] args) throws EmailException {
		
		System.out.println("===Test started===");
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("amantiwari506@gmail.com", "That1997"));
		email.setSSLOnConnect(true);
		email.setFrom("amantiwari506@gmail.com");
		email.setSubject("Selenium");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("amantiwari506@gmail.com");
		email.send();
		
		System.out.println("===Email sent===");
	}

}
