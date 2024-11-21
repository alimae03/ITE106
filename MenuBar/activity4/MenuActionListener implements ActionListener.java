public class MenuActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(MenuExample.frame, "Got an ActionEvent at " + new Date(e.getWhen()) + " from " + e.getSource().getClass());
	}
}
	
