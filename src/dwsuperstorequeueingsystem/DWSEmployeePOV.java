/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwsuperstorequeueingsystem;

import java.awt.Color;
import java.awt.Font;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author User
 */
public class DWSEmployeePOV extends javax.swing.JFrame {
    public Queue<DataItem> regularQueue;
    public Queue<DataItem> priorityQueue;
    public int regularTokenCounter;
    public int priorityTokenCounter;
    public int served1;
    public int served2;
    public int served3;
    public LinkedList<String> generatedRegularTokens;
    public LinkedList<String> generatedPriorityTokens;
    private DWSGetTokenNumFrame getTokenNum;
    private DWSUserPOV userPOV;

    private static boolean isTimerRunning1 = false;
    private static int secondsPassed1 = 0;
    private Timer timer1;

    private static boolean isTimerRunning2 = false;
    private static int secondsPassed2 = 0;
    private Timer timer2;

    private static boolean isTimerRunning3 = false;
    private static int secondsPassed3 = 0;
    private Timer timer3;

    /**
     * Creates new form DWSEmployeePOV
     */
    
    public void setGetTokenNumFrame(DWSGetTokenNumFrame getTokenNum) {
        this.getTokenNum = getTokenNum;
    }
    
    public void updateWindowOne(String token) {
        windowOne.setText(token);
    }
    
    public void updateWindowTwo(String token) {
        windowTwo.setText(token);
    }
    
    public void updatePrioWindow(String token) {
        prioWindow.setText(token);
    }
    
    public void updateUserWindowOne(String token) {
        userPOV.w1CurrentServing.setText(token);
    }
    
    public void updateUserWindowTwo(String token) {
        userPOV.w2CurrentServing.setText(token);
    }
    
    public void updateUserPrioWindow(String token) {
        userPOV.pw3CurrentServing.setText(token);
    }
    
    public void updateUserNextServingOne (String token) {
        userPOV.w1NextServing.setText(token);
    }
    
    public void updateUserNextServingTwo (String token) {
        userPOV.w2CurrentServing.setText(token);
    }
    
    public void updateUserNextServingPrioThree (String token) {
        userPOV.pw3CurrentServing.setText(token);
    }

    public DWSEmployeePOV(DWSGetTokenNumFrame getTokenNum, DWSUserPOV userPOV) {
        this.getTokenNum = getTokenNum;
        this.userPOV = userPOV;
        this.regularQueue = new LinkedList<>();
        initComponents();
        windowOne.setFont(new Font("Monospaced", Font.BOLD, 22));
        windowOne.setForeground(Color.YELLOW);
        windowTwo.setFont(new Font("Monospaced", Font.BOLD, 22));
        windowTwo.setForeground(Color.YELLOW);
        prioWindow.setFont(new Font("Monospaced", Font.BOLD, 22));
        prioWindow.setForeground(Color.YELLOW);
        w1ServingTime.setFont(new Font("Monospaced", Font.BOLD, 12));
        w1ServingTime.setForeground(Color.YELLOW);
        w2ServingTime.setFont(new Font("Monospaced", Font.BOLD, 12));
        w2ServingTime.setForeground(Color.YELLOW);
        pw3ServingTime.setFont(new Font("Monospaced", Font.BOLD, 12));
        pw3ServingTime.setForeground(Color.YELLOW);
        w1OnQueue.setFont(new Font("Monospaced", Font.BOLD, 12));
        w1OnQueue.setForeground(Color.YELLOW);
        w2OnQueue.setFont(new Font("Monospaced", Font.BOLD, 12));
        w2OnQueue.setForeground(Color.YELLOW);
        pw3OnQueue.setFont(new Font("Monospaced", Font.BOLD, 12));
        pw3OnQueue.setForeground(Color.YELLOW);
        servedWindow1.setFont(new Font("Monospaced", Font.BOLD, 12));
        servedWindow1.setForeground(Color.YELLOW);
        servedWindow2.setFont(new Font("Monospaced", Font.BOLD, 12));
        servedWindow2.setForeground(Color.YELLOW);
        servedPrioWindow3.setFont(new Font("Monospaced", Font.BOLD, 12));
        servedPrioWindow3.setForeground(Color.YELLOW);

        timer1 = createLiveTimer1(w1ServingTime);
        timer2 = createLiveTimer2(w2ServingTime);
        timer3 = createLiveTimer3(pw3ServingTime);
    }

    public DWSEmployeePOV() {
        initComponents();
    }

    public static Timer createLiveTimer1(JLabel timerLabel) {
        return new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isTimerRunning1) {
                    secondsPassed1++;
                    int hours = secondsPassed1 / 3600;
                    int minutes = (secondsPassed1 % 3600) / 60;
                    int seconds = secondsPassed1 % 60;
                    String timeStr = String.format("%02d:%02d:%02d", hours, minutes, seconds);
                    timerLabel.setText(timeStr);
                }
            }
        });
    }
    
    public static Timer createLiveTimer2(JLabel timerLabel) {
        return new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isTimerRunning2) {
                    secondsPassed2++;
                    int hours = secondsPassed2 / 3600;
                    int minutes = (secondsPassed2 % 3600) / 60;
                    int seconds = secondsPassed2 % 60;
                    String timeStr = String.format("%02d:%02d:%02d", hours, minutes, seconds);
                    timerLabel.setText(timeStr);
                }
            }
        });
    }
    
        public static Timer createLiveTimer3(JLabel timerLabel) {
        return new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isTimerRunning3) {
                    secondsPassed3++;
                    int hours = secondsPassed3 / 3600;
                    int minutes = (secondsPassed3 % 3600) / 60;
                    int seconds = secondsPassed3 % 60;
                    String timeStr = String.format("%02d:%02d:%02d", hours, minutes, seconds);
                    timerLabel.setText(timeStr);
                }
            }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        W1NextButton = new javax.swing.JButton();
        W1CallButton = new javax.swing.JButton();
        W2NextButton = new javax.swing.JButton();
        W2CallButton = new javax.swing.JButton();
        PWNextButton = new javax.swing.JButton();
        PWCallButton = new javax.swing.JButton();
        windowOne = new javax.swing.JLabel();
        windowTwo = new javax.swing.JLabel();
        prioWindow = new javax.swing.JLabel();
        w1ServingTime = new javax.swing.JLabel();
        w1OnQueue = new javax.swing.JLabel();
        w2ServingTime = new javax.swing.JLabel();
        w2OnQueue = new javax.swing.JLabel();
        pw3ServingTime = new javax.swing.JLabel();
        pw3OnQueue = new javax.swing.JLabel();
        servedWindow1 = new javax.swing.JLabel();
        servedWindow2 = new javax.swing.JLabel();
        servedPrioWindow3 = new javax.swing.JLabel();
        EmployeePOVBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        W1NextButton.setBorder(null);
        W1NextButton.setBorderPainted(false);
        W1NextButton.setContentAreaFilled(false);
        W1NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                W1NextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(W1NextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 60, 40));

        W1CallButton.setBorder(null);
        W1CallButton.setBorderPainted(false);
        W1CallButton.setContentAreaFilled(false);
        getContentPane().add(W1CallButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 70, 40));

        W2NextButton.setBorder(null);
        W2NextButton.setBorderPainted(false);
        W2NextButton.setContentAreaFilled(false);
        W2NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                W2NextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(W2NextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 60, 40));

        W2CallButton.setBorder(null);
        W2CallButton.setBorderPainted(false);
        W2CallButton.setContentAreaFilled(false);
        getContentPane().add(W2CallButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 60, 40));

        PWNextButton.setBorder(null);
        PWNextButton.setBorderPainted(false);
        PWNextButton.setContentAreaFilled(false);
        PWNextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PWNextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PWNextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 50, 40));

        PWCallButton.setBorder(null);
        PWCallButton.setBorderPainted(false);
        PWCallButton.setContentAreaFilled(false);
        getContentPane().add(PWCallButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 60, 40));
        getContentPane().add(windowOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 80, 60));
        getContentPane().add(windowTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 80, 60));
        getContentPane().add(prioWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 80, 60));
        getContentPane().add(w1ServingTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 60, 20));
        getContentPane().add(w1OnQueue, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 30, 20));
        getContentPane().add(w2ServingTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 60, 20));
        getContentPane().add(w2OnQueue, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 30, 20));
        getContentPane().add(pw3ServingTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 60, 20));
        getContentPane().add(pw3OnQueue, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 30, 20));
        getContentPane().add(servedWindow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 30, 20));
        getContentPane().add(servedWindow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 30, 20));
        getContentPane().add(servedPrioWindow3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 30, 20));

        EmployeePOVBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DWSuperstoreQueueing System/SERVING NOW  ALL WINDOW (EMPLOYEE POV).png"))); // NOI18N
        getContentPane().add(EmployeePOVBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void W1NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_W1NextButtonActionPerformed

        if (getTokenNum != null) {
            String served = getTokenNum.getFirstEnqueuedRegularToken1();
            int onQueue = getTokenNum.generatedRegularTokensOrder1.size();
            windowOne.setText(served);
            userPOV.w1CurrentServing.setText(served);
            w1OnQueue.setText(String.valueOf(onQueue));
            isTimerRunning1 = true;
            secondsPassed1 = 0;
            w1ServingTime.setText("00:00:00");
            timer1.start();
        }
        else {
            String served = getTokenNum.getFirstEnqueuedRegularToken1();
            windowOne.setText(served);
        }
        
        //timer start and stop here
        if (getTokenNum != null) {
                if (getTokenNum.generatedRegularTokensOrder1.isEmpty()) {
                    secondsPassed1 = 0;
                    w1ServingTime.setText("00:00:00");
                    timer1.stop(); 
                }
                else {
                    secondsPassed1 = 0;
                    w1ServingTime.setText("00:00:00");
                    timer1.start(); 
                }
        }
        else {
            
        }

        // dequeing happens here
        if (getTokenNum != null) {
                if (getTokenNum.generatedRegularTokensOrder1.isEmpty()) {
                    servedWindow1.setText(String.valueOf(served1));
                }
                else {
                    servedWindow1.setText(String.valueOf(served1));
                    served1++;
                }
                getTokenNum.dequeueRegularQueue1();
        } else {
            // Handle the case when `getTokenNum` is null
            System.err.println("DWSGetTokenNumFrame instance is null.");
        }
        
        //showNext here
        if (getTokenNum != null) {
            String next = getTokenNum.getFirstEnqueuedRegularToken1();
            userPOV.w1NextServing.setText(next);
        }
        else {
            userPOV.w1NextServing.setText("Empty");
        }
        
    }//GEN-LAST:event_W1NextButtonActionPerformed

    private void W2NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_W2NextButtonActionPerformed

        if (getTokenNum != null) {
            String served = getTokenNum.getFirstEnqueuedRegularToken2();
            int onQueue = getTokenNum.generatedRegularTokensOrder2.size();
            windowTwo.setText(served);
            userPOV.w2CurrentServing.setText(served);
            w2OnQueue.setText(String.valueOf(onQueue));
            isTimerRunning2 = true;
            secondsPassed2 = 0;
            w2ServingTime.setText("00:00:00");
            timer2.start();
        }
        else {
            String served = getTokenNum.getFirstEnqueuedRegularToken2();
            windowTwo.setText(served);
        }

        //timer start and stop here
        if (getTokenNum != null) {
                if (getTokenNum.generatedRegularTokensOrder2.isEmpty()) {
                    secondsPassed2 = 0;
                    w2ServingTime.setText("00:00:00");
                    timer2.stop(); 
                }
                else {
                    secondsPassed2 = 0;
                    w2ServingTime.setText("00:00:00");
                    timer2.start(); 
                }
        }
        else {
            
        }

        // dequeing happens here
        if (getTokenNum != null) {
                if (getTokenNum.generatedRegularTokensOrder2.isEmpty()) {
                    servedWindow2.setText(String.valueOf(served2));
                }
                else {
                    servedWindow2.setText(String.valueOf(served2));
                    served2++;
                }
                getTokenNum.dequeueRegularQueue2();
        } else {
            // Handle the case when `getTokenNum` is null
            System.err.println("DWSGetTokenNumFrame instance is null.");
        }

        //showNext here
        if (getTokenNum != null) {
            String next = getTokenNum.getFirstEnqueuedRegularToken2();
            userPOV.w2NextServing.setText(next);
        }
        else {
            userPOV.w2NextServing.setText("Empty");
        }
        
    }//GEN-LAST:event_W2NextButtonActionPerformed

    private void PWNextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PWNextButtonActionPerformed

        if (getTokenNum != null) {
            String served = getTokenNum.getFirstEnqueuedPriorityToken3();
            int onQueue = getTokenNum.generatedPriorityTokensOrder3.size();
            prioWindow.setText(served);
            userPOV.pw3CurrentServing.setText(served);
            pw3OnQueue.setText(String.valueOf(onQueue));
            isTimerRunning3 = true;
            secondsPassed3 = 0;
            pw3ServingTime.setText("00:00:00");
            timer3.start();
        }
        else {
            String served = getTokenNum.getFirstEnqueuedPriorityToken3();
            prioWindow.setText(served);
        }

        //timer start and stop here
        if (getTokenNum != null) {
                if (getTokenNum.generatedPriorityTokensOrder3.isEmpty()) {
                    secondsPassed3 = 0;
                    pw3ServingTime.setText("00:00:00");
                    timer3.stop(); 
                }
                else {
                    secondsPassed3 = 0;
                    pw3ServingTime.setText("00:00:00");
                    timer3.start(); 
                }
        }
        else {
            
        }
        
        
        // dequeing happens here
        if (getTokenNum != null) {
                if (getTokenNum.generatedPriorityTokensOrder3.isEmpty()) {
                    servedPrioWindow3.setText(String.valueOf(served3));
                }
                else {
                    servedPrioWindow3.setText(String.valueOf(served3));
                    served3++;
                }
                getTokenNum.dequeuePriorityQueue3();
        } else {
            // Handle the case when `getTokenNum` is null
            System.err.println("DWSGetTokenNumFrame instance is null.");
        }
        
        //showNext here
        if (getTokenNum != null) {
            String next = getTokenNum.getFirstEnqueuedPriorityToken3();
            userPOV.pw3NextServing.setText(next);
        }
        else {
            userPOV.pw3NextServing.setText("Empty");
        }
        
    }//GEN-LAST:event_PWNextButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DWSEmployeePOV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DWSEmployeePOV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DWSEmployeePOV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DWSEmployeePOV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DWSEmployeePOV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmployeePOVBG;
    private javax.swing.JButton PWCallButton;
    private javax.swing.JButton PWNextButton;
    private javax.swing.JButton W1CallButton;
    private javax.swing.JButton W1NextButton;
    private javax.swing.JButton W2CallButton;
    private javax.swing.JButton W2NextButton;
    private javax.swing.JLabel prioWindow;
    private javax.swing.JLabel pw3OnQueue;
    private javax.swing.JLabel pw3ServingTime;
    private javax.swing.JLabel servedPrioWindow3;
    private javax.swing.JLabel servedWindow1;
    private javax.swing.JLabel servedWindow2;
    private javax.swing.JLabel w1OnQueue;
    private javax.swing.JLabel w1ServingTime;
    private javax.swing.JLabel w2OnQueue;
    private javax.swing.JLabel w2ServingTime;
    public javax.swing.JLabel windowOne;
    private javax.swing.JLabel windowTwo;
    // End of variables declaration//GEN-END:variables
}
