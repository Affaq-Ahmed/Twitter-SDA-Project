/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Tweet.Tweets;
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
public class TweetPage extends javax.swing.JFrame {

    /**
     * Creates new form TweetPage
     */
    List<Tweets> tweets;
    public TweetPage(String userid,String display,String type) {
        initComponents();
        
        jLabel_username.setText(userid);
        String Name = SQL.user.GetName(userid);
        jLabel_Name.setText(Name);
        
        if(type.equals("Likes")){
            tweets = SQL.user.GetLikedTweets(display);
        }
        else if(type.equals("Tweets")){
            tweets = SQL.user.GetUserTweets(display);
        }
        else if(type.equals("Replies")){
            int tweetid=Integer.valueOf(display);
            tweets = SQL.user.GetReplies(tweetid);
        }
        tweets = SQL.user.GetBookmarks(userid);
        DefaultTableModel model = (DefaultTableModel)jTable_tweets.getModel();
        
        for(int i = 0; i < tweets.size(); i++){
            model.addRow(new Object[]{tweets.get(i).User.Name,tweets.get(i).Text,tweets.get(i).TweetId});
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
        jLabel_Home = new javax.swing.JLabel();
        jLabel_Bookmarks = new javax.swing.JLabel();
        jLabel_Profile = new javax.swing.JLabel();
        jButton_Tweet = new javax.swing.JButton();
        jLabel_Name = new javax.swing.JLabel();
        jLabel_username = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton_Search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_tweets = new javax.swing.JTable();
        jLabel_Tweet = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel_Home.setBackground(new java.awt.Color(51, 255, 255));
        jLabel_Home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Home.setForeground(new java.awt.Color(25, 181, 254));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_Tweet, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Bookmarks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jLabel_Home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_username)
                .addGap(1, 1, 1)
                .addComponent(jLabel_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Bookmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton_Tweet, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField1MouseEntered(evt);
            }
        });

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jTable_tweets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Tweet Text"
            }
        ));
        jTable_tweets.setFillsViewportHeight(true);
        jTable_tweets.setRowHeight(50);
        jTable_tweets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_tweetsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_tweets);
        if (jTable_tweets.getColumnModel().getColumnCount() > 0) {
            jTable_tweets.getColumnModel().getColumn(0).setMinWidth(100);
            jTable_tweets.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable_tweets.getColumnModel().getColumn(0).setMaxWidth(300);
        }

        jLabel_Tweet.setBackground(new java.awt.Color(25, 181, 254));
        jLabel_Tweet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Tweet.setForeground(new java.awt.Color(25, 181, 254));
        jLabel_Tweet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Tweet.setText("Tweets");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(jLabel_Tweet, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Tweet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void jTextField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField1MouseEntered

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

    private void jTable_tweetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_tweetsMouseClicked
        // TODO add your handling code here:
        String userid = jLabel_username.getText();
        int rowindex = jTable_tweets.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable_tweets.getModel();
        Tweets t = null;
        
        int tweet = (int) model.getValueAt(rowindex, 2);
        
        for(int i=0; i<tweets.size();i++){
            if(tweet == tweets.get(i).TweetId){
                t=tweets.get(i);
            }
        }
        
        Show_Tweet p = new Show_Tweet(userid,t);
        p.setVisible(true);
        p.pack();
        p.setLocationRelativeTo(null);
        p.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //p.setDefaultCloseOperation(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_jTable_tweetsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Search;
    private javax.swing.JButton jButton_Tweet;
    private javax.swing.JLabel jLabel_Bookmarks;
    private javax.swing.JLabel jLabel_Home;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Profile;
    private javax.swing.JLabel jLabel_Tweet;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_tweets;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}