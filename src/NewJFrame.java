
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import static java.lang.Thread.sleep;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.table.DefaultTableModel;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

 
public class NewJFrame extends javax.swing.JFrame {
    int j = -1;
    String filename="C:\\Users\\aayus\\Desktop\\DigitalClock/Buzzer.wav";
    ArrayList<Thread> threads = new ArrayList<Thread>();
    public NewJFrame() {
        initComponents();
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        clock_panel = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        alarm_tone = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        twelve = new javax.swing.JRadioButton();
        twenty_four = new javax.swing.JRadioButton();
        jcc = new javax.swing.JColorChooser();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        hour_spinner = new javax.swing.JSpinner();
        min_spinner = new javax.swing.JSpinner();
        am_pm = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        alarm_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alarm_table = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        setToneBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DigitalClock");
        setBackground(new java.awt.Color(255, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        clock_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.cyan, java.awt.Color.darkGray, java.awt.Color.gray));
        clock_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        date.setText("Date");
        clock_panel.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 278, 60));

        time.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("Time");
        clock_panel.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 463, 109));

        alarm_tone.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        clock_panel.add(alarm_tone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 510, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("TimeZone"));

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(ids = TimeZone.getAvailableIDs()));
        jComboBox2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jComboBox2ComponentHidden(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Time Format"));

        buttonGroup1.add(twelve);
        twelve.setText("12-hour format");
        twelve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twelveActionPerformed(evt);
            }
        });

        buttonGroup1.add(twenty_four);
        twenty_four.setText("24-hour format");
        twenty_four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twenty_fourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(twelve)
                    .addComponent(twenty_four))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(twelve)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(twenty_four)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jButton2.setText("Time foreground");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("Date foreground");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Clock background");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcc, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton6)
                        .addGap(103, 103, 103)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(19, 19, 19)))
                .addGap(126, 126, 126)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jcc, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton5)
                            .addComponent(jButton6))))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Alarm"));

        hour_spinner.setModel(new javax.swing.SpinnerListModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));

        min_spinner.setModel(new javax.swing.SpinnerListModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));

        am_pm.setModel(new javax.swing.SpinnerListModel(new String[] {"AM", "PM"}));

        jButton3.setText("Add alarm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hours");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Mins");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hour_spinner, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(min_spinner, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(am_pm, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hour_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(min_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(am_pm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        alarm_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Set alarm"));

        alarm_table.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        alarm_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        alarm_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alarm_tableMouseClicked(evt);
            }
        });
        alarm_table.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                alarm_tablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(alarm_table);
        if (alarm_table.getColumnModel().getColumnCount() > 0) {
            alarm_table.getColumnModel().getColumn(0).setPreferredWidth(20);
            alarm_table.getColumnModel().getColumn(0).setMaxWidth(20);
        }

        jButton4.setText("Delete alarm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setToneBtn.setText("Alarm tone");
        setToneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setToneBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout alarm_panelLayout = new javax.swing.GroupLayout(alarm_panel);
        alarm_panel.setLayout(alarm_panelLayout);
        alarm_panelLayout.setHorizontalGroup(
            alarm_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alarm_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alarm_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(alarm_panelLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(setToneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        alarm_panelLayout.setVerticalGroup(
            alarm_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alarm_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(alarm_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(setToneBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(clock_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alarm_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(alarm_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(clock_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jComboBox2.setSelectedItem("Asia/Kolkata");
        CurrentID = "Asia/Kolkata";
            ((DefaultEditor) hour_spinner.getEditor()).getTextField().setEditable(false);
            ((DefaultEditor) min_spinner.getEditor()).getTextField().setEditable(false);
            ((DefaultEditor) am_pm.getEditor()).getTextField().setEditable(false);
           Thread clock = new Thread(){
                public void run(){
                    try {
                        while(true){
                            TimeZone tz=TimeZone.getTimeZone(CurrentID);
                            long milli = TimeUnit.MILLISECONDS.toMillis(tz.getRawOffset());
                            TimeZone systz=TimeZone.getTimeZone(SystemID);
                            long sysmilli = TimeUnit.MILLISECONDS.toMillis(systz.getRawOffset());
                            
                            long timeInMillis = System.currentTimeMillis();
                            Calendar cal1 = Calendar.getInstance();
                            cal1.setTimeInMillis(timeInMillis-sysmilli+milli);
                            SimpleDateFormat dateFormat = new SimpleDateFormat(
                                                        "hh:mm:ss a");
                            SimpleDateFormat calendarFormat = new SimpleDateFormat(
                                                        "dd/MM/yyyy");
                            time.setText(dateFormat.format(cal1.getTime()));
                            date.setText(calendarFormat.format(cal1.getTime()));
                                sleep(1000);
                                if(twenty_four.isSelected()==true || twelve.isSelected()==true)
                                        break;
                                 
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            };
                clock.start();
      
            
    }//GEN-LAST:event_formWindowOpened

    private void twelveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twelveActionPerformed
     
      Thread clock = new Thread(){
            public void run(){
                try {
                    while(true){
                        TimeZone tz=TimeZone.getTimeZone(CurrentID);
                        long milli = TimeUnit.MILLISECONDS.toMillis(tz.getRawOffset());
                        TimeZone systz=TimeZone.getTimeZone(SystemID);
                        long sysmilli = TimeUnit.MILLISECONDS.toMillis(systz.getRawOffset());
                        long timeInMillis = System.currentTimeMillis();
                        Calendar cal1 = Calendar.getInstance();
                        cal1.setTimeInMillis(timeInMillis-sysmilli+milli);
                        SimpleDateFormat dateFormat = new SimpleDateFormat(
                            "hh:mm:ss a");
                        SimpleDateFormat calendarFormat = new SimpleDateFormat(
                            "dd/MM/yyyy");
                        time.setText(dateFormat.format(cal1.getTime()));
                        date.setText(calendarFormat.format(cal1.getTime()));
                        sleep(1000);
                        if(twenty_four.isSelected()==true)
                                    break;
                       

                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        clock.start();
            
    }//GEN-LAST:event_twelveActionPerformed

    private void twenty_fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twenty_fourActionPerformed
        // TODO add your handling code here:
        
        if(twenty_four.isSelected()==true){
            
            Thread clock = new Thread(){
            public void run(){
                try {
                    while(true){
                        TimeZone tz=TimeZone.getTimeZone(CurrentID);
                        long milli = TimeUnit.MILLISECONDS.toMillis(tz.getRawOffset());
                        TimeZone systz=TimeZone.getTimeZone(SystemID);
                        long sysmilli = TimeUnit.MILLISECONDS.toMillis(systz.getRawOffset());
                        long timeInMillis = System.currentTimeMillis();
                        Calendar cal1 = Calendar.getInstance();
                        cal1.setTimeInMillis(timeInMillis-sysmilli+milli);
                        SimpleDateFormat dateFormat = new SimpleDateFormat(
                            "HH:mm:ss");
                        SimpleDateFormat calendarFormat = new SimpleDateFormat(
                            "dd/MM/yyyy");
                        time.setText(dateFormat.format(cal1.getTime()));
                        date.setText(calendarFormat.format(cal1.getTime()));
                        sleep(1000);
                        if(twelve.isSelected()==true)
                               break;
                        
                      

                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        clock.start();
            
        }
        
    }//GEN-LAST:event_twenty_fourActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        int flag = 0;
        String hour = (String)hour_spinner.getValue();
        String min = (String)min_spinner.getValue();
        String ampm = (String)am_pm.getValue();
        String col1 = hour+":"+min+" "+ampm;
        DefaultTableModel model = (DefaultTableModel) alarm_table.getModel();
        for(int i = 0 ; i < alarm_table.getRowCount(); i++){
            if(col1.equals(alarm_table.getValueAt(i, 1))){
                JOptionPane.showMessageDialog(null,"Alarm already exists!");
                flag =1;
            }
        }
        if(flag==0)
             model.addRow(new Object[]{false,col1});
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(alarm_table.getSelectionModel().isSelectionEmpty())
                JOptionPane.showMessageDialog(null,"Select the alarm you want to delete!");
        else{
        int yesno = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this alarm?", "Delete", JOptionPane.YES_NO_OPTION);
        if(yesno == 0){
                
                int row = alarm_table.getSelectedRow();
                String alarm = (String)alarm_table.getValueAt(row,1);
                
                for(int i=0;i<threads.size();i++) {
                    if(threads.get(i).getName().equals(alarm)) {
                        threads.get(i).stop();
                        break;
                    }
                }
            
                DefaultTableModel model = (DefaultTableModel) alarm_table.getModel();
                model.removeRow(alarm_table.getSelectedRow());
                
            
        }
        else{
            
        }
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Color c = jcc.getColor();
            clock_panel.setBackground(c);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Color c = jcc.getColor();
            date.setForeground(c);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Color c = jcc.getColor();
        time.setForeground(c);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void alarm_tablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_alarm_tablePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_alarm_tablePropertyChange

    private void alarm_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alarm_tableMouseClicked
        // TODO add your handling code here:
        int column = alarm_table.getSelectedColumn();
        int row = alarm_table.getSelectedRow();

        if(column==0) {
            boolean isChecked = (boolean) alarm_table.getValueAt(row, column);
            

            String alarm = (String) alarm_table.getValueAt(row, 1);
            if(isChecked) {
                
                JOptionPane.showMessageDialog(null,"Your alarm has been set to "+alarm_table.getValueAt(row, 1)+".");
                //String alarm = (String) alarm_table.getValueAt(row, 1);

                Thread t = new Thread() {

                    // String alarm = (String) alarm_table.getValueAt(row, 1);
                    String[] splitAlarm = alarm.split(" ");

                    String[] time = splitAlarm[0].split(":");
                    int myHour = Integer.parseInt(time[0]);
                    int myMin = Integer.parseInt(time[1]);

                    public void run() {
                        try {
                            while(true) {
                                long timeInMillis = System.currentTimeMillis();
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTimeInMillis(timeInMillis);

                                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                                int min = calendar.get(Calendar.MINUTE);

                                String amPm = splitAlarm[1];
                                int setHour = myHour;
                                if(amPm.equals("PM")) {
                                    setHour = setHour+12;
                                }

                                if(hour==setHour&&min==myMin) {
                                    playSound();
                                    alarm_table.setValueAt(false,row,0);
                                    
                                    break;
                                }
                            }

                        } catch(Exception e) {

                        }
                    }
                };
                t.setName(alarm);
                threads.add(t);
                t.start();
            }

            else {
                for(int i=0;i<threads.size();i++) {
                    if(threads.get(i).getName().equals(alarm)) {
                        threads.get(i).stop();
                        break;
                    }
                }
                JOptionPane.showMessageDialog(null, "Alarm is cancelled!");
            }
        }
    }//GEN-LAST:event_alarm_tableMouseClicked

    public void playSound() {
        InputStream in;
        try {
            
             
            in = new FileInputStream(new File(filename));
            AudioStream audio = new AudioStream(in);
            AudioPlayer.player.start(audio);
            
            int yesno = JOptionPane.showConfirmDialog(null, "Turn off alarm?", "Alarm", JOptionPane.YES_NO_OPTION);
            if(yesno==0) {
                AudioPlayer.player.stop(audio);
            }
            else {
                
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    private void setToneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setToneBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        
        File f = chooser.getSelectedFile();
        if(f!=null) {
        filename = f.getAbsolutePath();
        alarm_tone.setText(filename.substring(filename.lastIndexOf("\\") + 1)+" has been set as your alarm tone.");
        }
        
        else {
            
        }
        
        
    }//GEN-LAST:event_setToneBtnActionPerformed

    private void jComboBox2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jComboBox2ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ComponentHidden

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        CurrentID = (String) jComboBox2.getSelectedItem();
        Thread clock = new Thread(){
            public void run(){
                try {
                    while(true){
                        TimeZone tz=TimeZone.getTimeZone(CurrentID);
                        long milli = TimeUnit.MILLISECONDS.toMillis(tz.getRawOffset());
                        TimeZone systz=TimeZone.getTimeZone(SystemID);
                        long sysmilli = TimeUnit.MILLISECONDS.toMillis(systz.getRawOffset());
                        long timeInMillis = System.currentTimeMillis();
                        Calendar cal1 = Calendar.getInstance();
                        cal1.setTimeInMillis(timeInMillis-sysmilli+milli);
                        SimpleDateFormat dateFormat = new SimpleDateFormat(
                            "hh:mm:ss a");
                        SimpleDateFormat calendarFormat = new SimpleDateFormat(
                            "dd/MM/yyyy");
                        if(twenty_four.isSelected()==true || twelve.isSelected()==true) {
                                    break;
                        }
                        time.setText(dateFormat.format(cal1.getTime()));
                        date.setText(calendarFormat.format(cal1.getTime()));
                       
                        sleep(1000);
                      

                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        clock.start();
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                
            }
        });
    }
    
    private String[] ids;
    private String CurrentID;
    private String SystemID="Asia/Kolkata";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alarm_panel;
    private javax.swing.JTable alarm_table;
    private javax.swing.JLabel alarm_tone;
    private javax.swing.JSpinner am_pm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel clock_panel;
    private javax.swing.JLabel date;
    private javax.swing.JSpinner hour_spinner;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JColorChooser jcc;
    private javax.swing.JSpinner min_spinner;
    private javax.swing.JButton setToneBtn;
    private javax.swing.JLabel time;
    private javax.swing.JRadioButton twelve;
    private javax.swing.JRadioButton twenty_four;
    // End of variables declaration//GEN-END:variables
}
