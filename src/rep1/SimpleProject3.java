package rep1;

import javax.swing.JOptionPane;

public class SimpleProject3 {

	public static void main(String[] args) {
		// ユーザ名とパスワード記入
		// ユーザ名はadmin、パスワードは12345
		String name = null;
		String password = null;
		Boolean running = true;
		while(running) {
			if(name == null) {
				String inputName = JOptionPane.showInputDialog("Please Insert your name!");
				if(inputName.contentEquals("admin")) {
					name = inputName;
				}
			}else {
				String inputPassword = JOptionPane.showInputDialog("Please Insert your password!");
				if(inputPassword.contentEquals("12345")) {
					password = inputPassword;
					running = false;
				}
			}
		}
		System.out.println("Input Name and password is correct.");
	}

}
