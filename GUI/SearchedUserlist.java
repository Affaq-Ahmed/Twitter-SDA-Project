/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import User.Users;
import static java.time.Clock.system;
import java.util.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.plaf.synth.Region;
import javax.swing.table.DefaultTableModel;
import sql.SQL;

/**
 *
 * @author aaawa
 */
public class SearchedUserlist extends javax.swing.JFrame {    
    /**
     * Creates new form Userlist
     */
    List<Users> userlist;
    public SearchedUserlist(String userid,String text,List<Users> users) {
        initComponents();
        
        jLabel_username.setText(userid);
        String Name = SQL.user.GetName(userid);
        jLabel_Name.setText(Name);
       
        jLabel_searched.setText("You searhed for " + text);
        userlist = users;
        DefaultTableModel model = (DefaultTableModel)jTable_Users.getModel();
        
        for(int i = 0; i < users.size(); i++){
            model.addRow(new Object[]{users.get(i).Name,users.get(i).Username});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_Home = new javax.swing.JLabel();
        jLabel_Bookmarks = new javax.swing.JLabel();
        jLabel_Profile = new javax.swing.JLabel();
        jButton_Tweet = new javax.swing.JButton();
        jLabel_Name = new javax.swing.JLabel();
        jLabel_username = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton_Search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Users = new javax.swing.JTable();
        jLabel_searched = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel_Home.setBackground(new java.awt.Color(51, 255, 255));
        jLabel_Home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/WhatsApp Image 2020-11-07 at 11.11.26 PM.jpeg"))); // NOI18N
        jLabel_Home.setText("Home");
        jLabel_Home.setAlignmentX(0.5F);
        jLabel_Home.setFocusable(false);
        jLabel_Home.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel_Home.setIconTextGap(30);
        jLabel_Home.setMaximumSize(new java.awt.Dimension(100, 128));
        jLabel_Home.setMinimumSize(new java.awt.Dimension(100, 128));
        jLabel_Home.setPreferredSize(new java.awt.Dimension(100, 128));
        jLabel_Home.setRequestFocusEnabled(false);

        jLabel_Bookmarks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Bookmarks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/bookmark.png"))); // NOI18N
        jLabel_Bookmarks.setText("Bookmarks");
        jLabel_Bookmarks.setIconTextGap(30);
        jLabel_Bookmarks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BookmarksMouseClicked(evt);
            }
        });

        jLabel_Profile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/Home.jpeg"))); // NOI18N
        jLabel_Profile.setText("Profile");
        jLabel_Profile.setIconTextGap(30);
        jLabel_Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ProfileMouseClicked(evt);
            }
        });

        jButton_Tweet.setBackground(new java.awt.Color(25, 181, 254));
        jButton_Tweet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Tweet.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Tweet.setText("Tweet");
        jButton_Tweet.setBorder(null);
        jButton_Tweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TweetActionPerformed(evt);
            }
        });

        jLabel_Name.setBackground(new java.awt.Color(51, 255, 255));
        jLabel_Name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Name.setText("Name");
        jLabel_Name.setAlignmentX(0.5F);
        jLabel_Name.setFocusable(false);
        jLabel_Name.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel_Name.setIconTextGap(30);
        jLabel_Name.setMaximumSize(new java.awt.Dimension(100, 128));
        jLabel_Name.setMinimumSize(new java.awt.Dimension(100, 128));
        jLabel_Name.setPreferredSize(new java.awt.Dimension(100, 128));
        jLabel_Name.setRequestFocusEnabled(false);

        jLabel_username.setText("@username");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Tweet, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Bookmarks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(jLabel_Home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Bookmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jButton_Tweet, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton_Search.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Search.setForeground(new java.awt.Color(25, 181, 254));
        jButton_Search.setText("Search");
        jButton_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Search, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable_Users.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable_Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Username"
            }
        ));
        jTable_Users.setFillsViewportHeight(true);
        jTable_Users.setRowHeight(32);
        jTable_Users.setShowGrid(true);
        jTable_Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_UsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Users);

        jLabel_searched.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_searched.setText("You Searched for");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_searched, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_searched, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_BookmarksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookmarksMouseClicked
        // TODO add your handling code here:
        String userid = jLabel_username.getText();
        
        Bookmarks bm = new Bookmarks(userid);
        bm.setVisible(true);
        bm.pack();
        bm.setLocationRelativeTo(null);
        bm.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //bm.setDefaultCloseOperation(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_jLabel_BookmarksMouseClicked

    private void jLabel_ProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ProfileMouseClicked
        // TODO add your handling code here:
        String userid = jLabel_username.getText();
        
        Profile p = new Profile(userid);
        p.setVisible(true);
        p.pack();
        p.setLocationRelativeTo(null);
        p.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //p.setDefaultCloseOperation(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_jLabel_ProfileMouseClicked

    private void jButton_TweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TweetActionPerformed
        // TODO add your handling code here:
        String userid = jLabel_username.getText();
        
        Tweet t= new Tweet(userid);
        t.setVisible(true);
        t.pack();
        t.setLocationRelativeTo(null);
        t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //this.dispose();
    }//GEN-LAST:event_jButton_TweetActionPerformed

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
        // TODO add your handling code here:
        String text = jTextField1.getText();
        String userid = jLabel_username.getText();
        
        List<Users> users= SQL.user.Search(text);
        
        SearchedUserlist p = new SearchedUserlist(userid,text,users);
        p.setVisible(true);
        p.pack();
        p.setLocationRelativeTo(null);
        p.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //p.setDefaultCloseOperation(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_jButton_SearchActionPerformed

    private void jTable_UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_UsersMouseClicked
        // TODO add your handling code here:
        String userid = jLabel_username.getText();
        int rowindex = jTable_Users.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable_Users.getModel();
        Users u = null;
        
        String displayedUserId = (String) model.getValueAt(rowindex, 1);
        for(int i=0;i<userlist.size();i++){
            if(displayedUserId.equals(userlist.get(i).Username)){
                u=userlist.get(i);
            }
        }
        
        UserProfile p = new UserProfile(userid,u);
        p.setVisible(true);
        p.pack();
        p.setLocationRelativeTo(null);
        p.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //p.setDefaultCloseOperation(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_jTable_UsersMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Search;
    private javax.swing.JButton jButton_Tweet;
    private javax.swing.JLabel jLabel_Bookmarks;
    private javax.swing.JLabel jLabel_Home;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Profile;
    private javax.swing.JLabel jLabel_searched;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_Users;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
