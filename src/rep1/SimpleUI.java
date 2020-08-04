package rep1;

import javax.swing.JOptionPane;

public class SimpleUI {

	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "Hello Java");
		String name = JOptionPane.showInputDialog("名前はなんですか？");
		JOptionPane.showMessageDialog(null, "名前: " + name);

	}

}
