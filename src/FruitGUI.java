import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
public class FruitGUI extends javax.swing.JFrame {
ArrayList fruit = new ArrayList();
DefaultListModel model = new DefaultListModel();
    
    public FruitGUI() {
        initComponents();
        fruit.add("Apfel");
        fruit.add("Banana");
        fruit.add("WaterMalon");
        fruit.add("Dragon Fruit");
        fruit.add("PineApple");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Strawberry");
        fruit.add("Pear");
        fruit.add("Plum");
        fruit.add("Grapes");
        fruit.add("Star Fruit");
        fruit.add("Cherry");
        fruit.add("Kartoffel");
        fruit.add("Zucker");
        fruit.add("Wein");
        fruit.add("ApfelSaft");
        fruit.add("Bier");
        fruit.add("Grumose");
        fruit.add("Obst");
        fruit.add("Salz");
        fruit.add("Suppe");
        fruit.add("Ente");
        fruit.add("Feels");
        fruit.add("Madchen");
        fruit.add("Hund");
        fruit.add("Eier");
        fruit.add("Reis");
        fruit.add("CocaCola");
        fruit.add("Kuchen");
        fruit.add("Fische");
        fruit.add("FischeSaft");
        for (int x=0; x<fruit.size(); x++){
            model.addElement(fruit.get(x));
            lstfruit.setModel(model);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstfruit = new javax.swing.JList();
        btnadd = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstfruit);

        btnadd.setText("Add Fruit");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnremove.setText("Remove Fruit");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        jLabel1.setText("FRUUUUIIIIIITTTTTT MACHINE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnremove))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnadd)
                        .addGap(36, 36, 36)
                        .addComponent(btnremove)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        String f = JOptionPane.showInputDialog(this, "Add new fruit you noob");
        int location = findInsertPoint(fruit, f);
        fruit.add(location, f);
        model.add(location, f);
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        int location = lstfruit.getSelectedIndex();
        fruit.remove(location);
        model.remove(location);
    }//GEN-LAST:event_btnremoveActionPerformed

    public static int findInsertPoint (ArrayList a, Object searchValue){
	   int left = 0;
	   int right = a.size()-1;
	   int midpoint=0;
           Object item = null;
	   
	   while (left <= right){
	      midpoint = (left + right) / 2;
              item = a.get(midpoint);
	   
	      int result = ((Comparable)item).compareTo(searchValue); 
	   
	     if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   if(((Comparable)item).compareTo(searchValue) < 0)
	   midpoint++;
	   return midpoint;	   
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FruitGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FruitGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FruitGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FruitGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FruitGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnremove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstfruit;
    // End of variables declaration//GEN-END:variables
}
