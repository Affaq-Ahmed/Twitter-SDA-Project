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
import sql.SQL;

/**
 *
 * @author aaawa
 */
public class Show_Tweet extends javax.swing.JFrame {

    /**
     * Creates new form Show_Tweet
     * @param userid
     * @param tweet
     */
    
    public Show_Tweet(String userid,Tweets tweet) {
        initComponents();
        
        jLabel_username.setText(userid);
        String Name = SQL.user.GetName(userid);
        jLabel_name.setText(Name);
        
        jLabel_Name.setText(tweet.User.Name);
        jLabel_Username.setText(tweet.User.Username);
        jLabel_Tweetid.setText(String.valueOf(tweet.TweetId));
        
        jTextArea.setText(tweet.Text);
        List<Users> list1 = SQL.user.GetLikers(tweet.TweetId);
        jLabel_NumberofLikes.setText(String.valueOf(list1.size()));
        List<Tweets> list2 = SQL.user.GetReplies(tweet.TweetId);
        jLabel_NumberofReplies.setText(String.valueOf(list2.size()));
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
        jPanel14 = new javax.swing.JPanel();
        jLabel_Home11 = new javax.swing.JLabel();
        jLabel_Bookmarks11 = new javax.swing.JLabel();
        jLabel_Profile11 = new javax.swing.JLabel();
        jButton_Tweet = new javax.swing.JButton();
        jLabel_name = new javax.swing.JLabel();
        jLabel_username = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField_search = new javax.swing.JTextField();
        jButton_Search = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel_tweetid = new javax.swing.JPanel();
        jLabel_Name = new javax.swing.JLabel();
        jLabel_Username = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jLabel_NumberofLikes = new javax.swing.JLabel();
        jLabel_NumberofReplies = new javax.swing.JLabel();
        jLabel_Tweetid = new javax.swing.JLabel();
        jButton_Like = new javax.swing.JButton();
        jButton_Reply = new javax.swing.JButton();
        jButton_Retweet = new javax.swing.JButton();
        jButton_bookmark = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_ReplyText = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton_PostReply = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel_Home11.setBackground(new java.awt.Color(51, 255, 255));
        jLabel_Home11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Home11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/WhatsApp Image 2020-11-07 at 11.11.26 PM.jpeg"))); // NOI18N
        jLabel_Home11.setText("Home");
        jLabel_Home11.setAlignmentX(0.5F);
        jLabel_Home11.setFocusable(false);
        jLabel_Home11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel_Home11.setIconTextGap(30);
        jLabel_Home11.setMaximumSize(new java.awt.Dimension(100, 128));
        jLabel_Home11.setMinimumSize(new java.awt.Dimension(100, 128));
        jLabel_Home11.setPreferredSize(new java.awt.Dimension(100, 128));
        jLabel_Home11.setRequestFocusEnabled(false);
        jLabel_Home11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Home11MouseClicked(evt);
            }
        });

        jLabel_Bookmarks11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Bookmarks11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/bookmark.png"))); // NOI18N
        jLabel_Bookmarks11.setText("Bookmarks");
        jLabel_Bookmarks11.setIconTextGap(30);
        jLabel_Bookmarks11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Bookmarks11MouseClicked(evt);
            }
        });

        jLabel_Profile11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Profile11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/Home.jpeg"))); // NOI18N
        jLabel_Profile11.setText("Profile");
        jLabel_Profile11.setIconTextGap(30);
        jLabel_Profile11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Profile11MouseClicked(evt);
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

        jLabel_name.setBackground(new java.awt.Color(51, 255, 255));
        jLabel_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_name.setText("Name");
        jLabel_name.setAlignmentX(0.5F);
        jLabel_name.setFocusable(false);
        jLabel_name.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel_name.setIconTextGap(30);
        jLabel_name.setMaximumSize(new java.awt.Dimension(100, 128));
        jLabel_name.setMinimumSize(new java.awt.Dimension(100, 128));
        jLabel_name.setPreferredSize(new java.awt.Dimension(100, 128));
        jLabel_name.setRequestFocusEnabled(false);

        jLabel_username.setText("@username");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jButton_Tweet, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_Bookmarks11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addComponent(jLabel_Home11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_Profile11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel_username)
                .addGap(4, 4, 4)
                .addComponent(jLabel_Home11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Bookmarks11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Profile11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton_Tweet, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField_search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
                .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Search, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jLabel_Name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Name.setText("Name");

        jLabel_Username.setText("@Username");

        jTextArea.setEditable(false);
        jTextArea.setColumns(20);
        jTextArea.setLineWrap(true);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        jLabel_NumberofLikes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_NumberofLikes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_NumberofLikes.setText("#");
        jLabel_NumberofLikes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_NumberofLikesMouseClicked(evt);
            }
        });

        jLabel_NumberofReplies.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_NumberofReplies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_NumberofReplies.setText("#");

        jLabel_Tweetid.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        jLabel_Tweetid.setText("#");

        jButton_Like.setBackground(new java.awt.Color(255, 0, 51));
        jButton_Like.setForeground(new java.awt.Color(255, 0, 51));
        jButton_Like.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/heart.png"))); // NOI18N
        jButton_Like.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LikeActionPerformed(evt);
            }
        });

        jButton_Reply.setBackground(new java.awt.Color(25, 181, 254));
        jButton_Reply.setForeground(new java.awt.Color(255, 0, 51));
        jButton_Reply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/reply.png"))); // NOI18N
        jButton_Reply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReplyActionPerformed(evt);
            }
        });

        jButton_Retweet.setBackground(new java.awt.Color(25, 181, 254));
        jButton_Retweet.setForeground(new java.awt.Color(255, 0, 51));
        jButton_Retweet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/retweet.png"))); // NOI18N
        jButton_Retweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RetweetActionPerformed(evt);
            }
        });

        jButton_bookmark.setBackground(new java.awt.Color(255, 255, 255));
        jButton_bookmark.setForeground(new java.awt.Color(255, 0, 51));
        jButton_bookmark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/bookmark.png"))); // NOI18N
        jButton_bookmark.setToolTipText("");
        jButton_bookmark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_bookmarkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_tweetidLayout = new javax.swing.GroupLayout(jPanel_tweetid);
        jPanel_tweetid.setLayout(jPanel_tweetidLayout);
        jPanel_tweetidLayout.setHorizontalGroup(
            jPanel_tweetidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tweetidLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel_tweetidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_tweetidLayout.createSequentialGroup()
                        .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Tweetid, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_tweetidLayout.createSequentialGroup()
                        .addGroup(jPanel_tweetidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_tweetidLayout.createSequentialGroup()
                                .addComponent(jLabel_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_bookmark, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_tweetidLayout.createSequentialGroup()
                                .addComponent(jButton_Like, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_NumberofLikes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(135, 135, 135)
                                .addComponent(jButton_Reply, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_NumberofReplies, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(138, 138, 138)
                                .addComponent(jButton_Retweet, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_tweetidLayout.setVerticalGroup(
            jPanel_tweetidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tweetidLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_tweetidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_tweetidLayout.createSequentialGroup()
                        .addGroup(jPanel_tweetidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Tweetid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Username))
                    .addComponent(jButton_bookmark, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_tweetidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Retweet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_tweetidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel_NumberofLikes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(jLabel_NumberofReplies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton_Like, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Reply, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jTextArea_ReplyText.setColumns(20);
        jTextArea_ReplyText.setLineWrap(true);
        jTextArea_ReplyText.setRows(5);
        jScrollPane3.setViewportView(jTextArea_ReplyText);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Your Reply");

        jButton_PostReply.setBackground(new java.awt.Color(25, 181, 254));
        jButton_PostReply.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_PostReply.setText("Post");
        jButton_PostReply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PostReplyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel_tweetid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_PostReply, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel_tweetid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jButton_PostReply, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 86, Short.MAX_VALUE))
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void jLabel_Home11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Home11MouseClicked
        // TODO add your handling code here:
        String userid = jLabel_username.getText();
        
        Home p = new Home(userid);
        p.setVisible(true);
        p.pack();
        p.setLocationRelativeTo(null);
        p.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //p.setDefaultCloseOperation(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_jLabel_Home11MouseClicked

    private void jLabel_Bookmarks11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Bookmarks11MouseClicked
        // TODO add your handling code here:
        String userid = jLabel_username.getText();
        
        Bookmarks bm = new Bookmarks(userid);
        bm.setVisible(true);
        bm.pack();
        bm.setLocationRelativeTo(null);
        bm.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //bm.setDefaultCloseOperation(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_jLabel_Bookmarks11MouseClicked

    private void jLabel_Profile11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Profile11MouseClicked
        // TODO add your handling code here:
        String userid = jLabel_username.getText();
        
        Profile p = new Profile(userid);
        p.setVisible(true);
        p.pack();
        p.setLocationRelativeTo(null);
        p.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //p.setDefaultCloseOperation(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_jLabel_Profile11MouseClicked

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
        String text = jTextField_search.getText();
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

    private void jButton_PostReplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PostReplyActionPerformed
        // TODO add your handling code here:
        String text = jTextArea_ReplyText.getText();
        String userid = jLabel_username.getText();
        Integer tweetid = Integer.valueOf(jLabel_Tweetid.getText());
        
        int rs = SQL.user.Reply(userid, tweetid, text);
        jTextArea_ReplyText.setText("");
    }//GEN-LAST:event_jButton_PostReplyActionPerformed

    private void jButton_LikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LikeActionPerformed
        // TODO add your handling code here:
        String userid = jLabel_username.getText();
        Integer tweetid = Integer.valueOf(jLabel_Tweetid.getText());
        
        int rs = SQL.user.Like(userid, tweetid);
    }//GEN-LAST:event_jButton_LikeActionPerformed

    private void jButton_RetweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RetweetActionPerformed
        // TODO add your handling code here:
        String userid = jLabel_username.getText();
        int tweetid = Integer.valueOf(jLabel_Tweetid.getText());
        String text = jTextArea.getText();
        
        Retweet p = new Retweet(userid,tweetid,text);
        p.setVisible(true);
        p.pack();
        p.setLocationRelativeTo(null);
        p.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //p.setDefaultCloseOperation(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_jButton_RetweetActionPerformed

    private void jButton_ReplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReplyActionPerformed
        // TODO add your handling code here:
        String userid = jLabel_username.getText();
        String tweetid = jLabel_Tweetid.getText();
        
        Replies tp = new Replies(userid,tweetid);
        tp.setVisible(true);
        tp.pack();
        tp.setLocationRelativeTo(null);
        //tp.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //tp.setDefaultCloseOperation(JFrame.MAXIMIZED_BOTH);
        //this.dispose();
    }//GEN-LAST:event_jButton_ReplyActionPerformed

    private void jLabel_NumberofLikesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_NumberofLikesMouseClicked
        // TODO add your handling code here:
        String userid = jLabel_username.getText();
        int tweetid = Integer.valueOf(jLabel_Tweetid.getText());
        
        List<Users> users= SQL.user.GetLikers(tweetid);
        
        SearchedUserlist p = new SearchedUserlist(userid,userid,users);
        p.setVisible(true);
        p.pack();
        p.setLocationRelativeTo(null);
        p.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //p.setDefaultCloseOperation(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_jLabel_NumberofLikesMouseClicked

    private void jButton_bookmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_bookmarkActionPerformed
        // TODO add your handling code here:
        String userid = jLabel_username.getText();
        int tweetid = Integer.valueOf(jLabel_Tweetid.getText());
        
        int result = SQL.user.Bookmark(userid, tweetid);
        if(result == 1){
            JOptionPane.showMessageDialog(rootPane, "Successfully Bookmarked!!!");
        }
        else if(result == -1){
            JOptionPane.showMessageDialog(rootPane, "Already Bookmarked!!!");
        }
        else if(result == 0){
            JOptionPane.showMessageDialog(rootPane, "Tweet Doesn't Exist!!! Kindly Reload the page.!!!");
        }
    }//GEN-LAST:event_jButton_bookmarkActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Like;
    private javax.swing.JButton jButton_PostReply;
    private javax.swing.JButton jButton_Reply;
    private javax.swing.JButton jButton_Retweet;
    private javax.swing.JButton jButton_Search;
    private javax.swing.JButton jButton_Tweet;
    private javax.swing.JButton jButton_bookmark;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Bookmarks11;
    private javax.swing.JLabel jLabel_Home11;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_NumberofLikes;
    private javax.swing.JLabel jLabel_NumberofReplies;
    private javax.swing.JLabel jLabel_Profile11;
    private javax.swing.JLabel jLabel_Tweetid;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JLabel jLabel_name;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_tweetid;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextArea jTextArea_ReplyText;
    private javax.swing.JTextField jTextField_search;
    // End of variables declaration//GEN-END:variables
}