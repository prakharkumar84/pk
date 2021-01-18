
import javax.swing.*; 
public class JTabbedPaneDemo extends JApplet { 
	
	public void init() { 
		try { 
			SwingUtilities.invokeAndWait(
					new Runnable() {
						public void run() {
							makeGUI();
							}
						}
					);
			} 
		catch (Exception exc) {
			System.out.println("Can't create because of " + exc);
			}
		}
	private void makeGUI() {
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Cities", new CitiesPanel());
		jtp.addTab("Colors", new ColorsPanel());
		add(jtp);
		}
	}
class CitiesPanel extends JPanel { 
	public CitiesPanel() {
		JButton b1 = new JButton("New York");
		add(b1);
		JButton b2 = new JButton("London");
		add(b2);
		JButton b3 = new JButton("Hong Kong");
		add(b3);
		JButton b4 = new JButton("Tokyo");
		add(b4);
		}
	}
class ColorsPanel extends JPanel {
	

	public ColorsPanel() {
		JCheckBox cb1 = new JCheckBox("Red");
		add(cb1);
		JCheckBox cb2 = new JCheckBox("Green");
		add(cb2);
		JCheckBox cb3 = new JCheckBox("Blue");
		add(cb3);
		}
	}