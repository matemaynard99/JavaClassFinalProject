import java.awt.*;

public class Final extends javax.swing.JFrame{
	
	public Final() {
		gcdFinder();
	}
	
	private void gcdFinder() {
		Container pane = getContentPane();
    	setLayout(null);
    	
    	jButton1 = new javax.swing.JButton();
    	jTextField1 = new javax.swing.JTextField();
    	jTextField2 = new javax.swing.JTextField();
    	jTextField3 = new javax.swing.JTextField();
    	jLabel1 = new javax.swing.JLabel();
    	jLabel2 = new javax.swing.JLabel();
    	
    	jButton1.setText("Get GCD");
    	jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
    	
    	jTextField1.setEnabled(true);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        
        jTextField2.setEnabled(true);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        
        jTextField3.setEnabled(false);
        
        jLabel1.setText("Enter one positive integer in the two boxes");
        jLabel2.setText("Press enter after you type each number.");

    	jButton1.setSize(75, 50);
    	jTextField1.setSize(50, 50);
    	jTextField2.setSize(50, 50);
    	jTextField3.setSize(50, 50);
    	jLabel1.setSize(300, 50);
    	jLabel2.setSize(300, 50);
    	   	
    	jTextField1.setLocation(150, 70);
    	jTextField2.setLocation(250, 70);
    	jLabel1.setLocation(100, 1);
    	jLabel2.setLocation(100,20);
    	jButton1.setLocation(50, 120);
    	jTextField3.setLocation(200, 120);
    	
    	add(jTextField1);
    	add(jTextField2);   	
    	add(jButton1);
    	add(jLabel1);
    	add(jLabel2);
    	add(jTextField3);
   	    	
    	setSize(450, 200);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	}
	
	String input1 = "";
	String input2 = "";
	int a = 0;
	int b = 0;
	int GCD;	
	
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		
		GCD = calcGCD(a, b);
		jTextField3.setText(Integer.toString(GCD));
    }//end button1
	
	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		//take input of first pos int
		input1 = jTextField1.getText();
		a = Integer.parseInt(input1);
		if(a < 0) {
			a = a * (-1);
		}
	}//end textField1
	
	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
		//take input of second pos int
		input2 = jTextField2.getText();
		b = Integer.parseInt(input2);
		if(b < 0) {
			b = b * (-1);
		}
	}//end textField2
		
	private static int calcGCD(int i, int j) {
		if (j == 0) {
			return i;
		}
		return calcGCD(j, i % j);
	}// end calcGCD
	
	public static void main(String[] args) {
		Final gcdFinder = new Final();
	}//end main
	
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;

}//end class
