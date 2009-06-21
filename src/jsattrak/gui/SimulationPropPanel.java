/*
 * SimulationPropPanel.java
 * =====================================================================
 * Copyright (C) 2009 Shawn E. Gano
 * 
 * This file is part of JSatTrak.
 * 
 * JSatTrak is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * JSatTrak is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with JSatTrak.  If not, see <http://www.gnu.org/licenses/>.
 * =====================================================================
 *
 * Created on August 13, 2007, 9:17 AM
 */

package jsattrak.gui;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.swing.JInternalFrame;

/**
 *
 * @author  sgano
 */
public class SimulationPropPanel extends javax.swing.JPanel implements Serializable
{
    
    JSatTrak app;
    JInternalFrame iframe; // used to know what its parent frame is - to close window
    
    // date formats for displaying and reading in
    private SimpleDateFormat dateformat = new SimpleDateFormat("dd MMM yyyy HH:mm:ss.SSS z");
    private SimpleDateFormat dateformatShort1 = new SimpleDateFormat("dd MMM y H:m:s.S z");
    private SimpleDateFormat dateformatShort2 = new SimpleDateFormat("dd MMM y H:m:s z"); // no Milliseconds
    
    /** Creates new form SimulationPropPanel */
    public SimulationPropPanel()
    {
        initComponents();
    }
    
     public SimulationPropPanel(JSatTrak app)
    {
        this.app = app;
        initComponents();
        
        // update ini gui with current options
        realTimeTextField.setText( app.getRealTimeAnimationRefreshRateMs() + "");
        nonRealTimeTextField.setText( app.getNonRealTimeAnimationRefreshRateMs() + "");
        
        if(app.isEpochTimeEqualsCurrentTime())
        {
            currentTimeRadioButton.doClick();
        }
        else
        {
            specifiedTimeRadioButton.doClick();
        }
        
        timeTextField.setText( app.getScenarioEpochDate().getDateTimeStr() );
        
        // get wwj online mode
        wwjOnlineModeCheckBox.setSelected( !app.isWwjOfflineMode() );
        
        // clip planes
        nearClipTextField.setText(app.getNearClippingPlaneDist() + "");
        farClipTextField.setText(app.getFarClippingPlaneDist() + "");
    }
     
     public void setInternalFrame(JInternalFrame iframe)
     {
         this.iframe = iframe;
     }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        realTimeTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nonRealTimeTextField = new javax.swing.JTextField();
        applyButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        currentTimeRadioButton = new javax.swing.JRadioButton();
        specifiedTimeRadioButton = new javax.swing.JRadioButton();
        timeTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        wwjOnlineModeCheckBox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nearClipTextField = new javax.swing.JTextField();
        farClipTextField = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Refresh Rates"));

        jLabel1.setText("Real Time Update Interval [ms] :");

        realTimeTextField.setText("1000");

        jLabel2.setText("Animation Update Interval [ms]: ");

        nonRealTimeTextField.setText("50");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(realTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nonRealTimeTextField, 0, 0, Short.MAX_VALUE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(realTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nonRealTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        applyButton.setText("Apply");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Scenario Epoch"));

        currentTimeRadioButton.setSelected(true);
        currentTimeRadioButton.setText("Current Time");
        currentTimeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentTimeRadioButtonActionPerformed(evt);
            }
        });

        specifiedTimeRadioButton.setText("Specified Time:");
        specifiedTimeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specifiedTimeRadioButtonActionPerformed(evt);
            }
        });

        timeTextField.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentTimeRadioButton)
                    .addComponent(specifiedTimeRadioButton)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(currentTimeRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(specifiedTimeRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("3D Globe"));

        wwjOnlineModeCheckBox.setSelected(true);
        wwjOnlineModeCheckBox.setText("Stream Globe Imagery/Terrain");

        jLabel3.setText("Near Clipping Plane (Auto = -1):");

        jLabel4.setText("Far Clipping Plane (Auto = -1):");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(farClipTextField))
                    .addComponent(wwjOnlineModeCheckBox)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9)
                        .addComponent(nearClipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(wwjOnlineModeCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nearClipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(farClipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(applyButton)
                .addGap(18, 18, 18)
                .addComponent(okButton)
                .addGap(18, 18, 18)
                .addComponent(cancelButton))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton)
                    .addComponent(applyButton)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_okButtonActionPerformed
    {//GEN-HEADEREND:event_okButtonActionPerformed
        saveSettings();
        
        // close internal frame
        try
        {
            iframe.dispose(); // could setClosed(true)
        }
        catch(Exception e){}
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelButtonActionPerformed
    {//GEN-HEADEREND:event_cancelButtonActionPerformed
        // close internal frame
        try
        {
            iframe.dispose(); // could setClosed(true)
        }
        catch(Exception e){}
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_applyButtonActionPerformed
    {//GEN-HEADEREND:event_applyButtonActionPerformed
        saveSettings();
    }//GEN-LAST:event_applyButtonActionPerformed

    private void currentTimeRadioButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_currentTimeRadioButtonActionPerformed
    {//GEN-HEADEREND:event_currentTimeRadioButtonActionPerformed
        currentTimeRadioButton.setSelected(true);
        specifiedTimeRadioButton.setSelected(false);
        timeTextField.setEnabled(false);
    }//GEN-LAST:event_currentTimeRadioButtonActionPerformed

    private void specifiedTimeRadioButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_specifiedTimeRadioButtonActionPerformed
    {//GEN-HEADEREND:event_specifiedTimeRadioButtonActionPerformed
        currentTimeRadioButton.setSelected(false);
        specifiedTimeRadioButton.setSelected(true);
        timeTextField.setEnabled(true);
    }//GEN-LAST:event_specifiedTimeRadioButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JRadioButton currentTimeRadioButton;
    private javax.swing.JTextField farClipTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nearClipTextField;
    private javax.swing.JTextField nonRealTimeTextField;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField realTimeTextField;
    private javax.swing.JRadioButton specifiedTimeRadioButton;
    private javax.swing.JTextField timeTextField;
    private javax.swing.JCheckBox wwjOnlineModeCheckBox;
    // End of variables declaration//GEN-END:variables
    private void saveSettings()
    {

        // refresh rates
        try
        {
            app.setRealTimeAnimationRefreshRateMs(Integer.parseInt(realTimeTextField.getText()));
            app.setNonRealTimeAnimationRefreshRateMs(Integer.parseInt(nonRealTimeTextField.getText()));
        }
        catch (Exception e)
        {
        }

        
        // get wwj online mode
        app.setWwjOfflineMode( !wwjOnlineModeCheckBox.isSelected() );
        // set WWJ value
        gov.nasa.worldwind.WorldWind.getNetworkStatus().setOfflineMode( app.isWwjOfflineMode() );

        // get time epoch settings

        app.setEpochTimeEqualsCurrentTime(currentTimeRadioButton.isSelected());

        if (!currentTimeRadioButton.isSelected())
        {
            // save time
            // save old time
            double prevJulDate = app.getScenarioEpochDate().getJulianDate();

            // enter hit in date/time box...
            //System.out.println("Date Time Changed");

            GregorianCalendar currentTimeDate = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
            //or
            //GregorianCalendar currentTimeDate = new GregorianCalendar();

            boolean dateAccepted = true; // assume date valid at first
            try
            {
                currentTimeDate.setTime(dateformatShort1.parse(timeTextField.getText()));
                timeTextField.setText(dateformat.format(currentTimeDate.getTime()));
            }
            catch (Exception e2)
            {
                try
                {
                    // try reading without the milliseconds
                    currentTimeDate.setTime(dateformatShort2.parse(timeTextField.getText()));
                    timeTextField.setText(dateformat.format(currentTimeDate.getTime()));
                }
                catch (Exception e3)
                {
                    // bad date input put back the old date string
                     timeTextField.setText( app.getScenarioEpochDate().getDateTimeStr() );
                    dateAccepted = false;
                //System.out.println(" -- Rejected");
                } // catch 2

            } // catch 1

            if (dateAccepted)
            {
                // date entered was good...
                // System.out.println(" -- Accepted");

                // save
                app.getScenarioEpochDate().set(currentTimeDate.getTimeInMillis());
//            currentJulianDate.set(currentTimeDate.get(Calendar.YEAR),
//                                  currentTimeDate.get(Calendar.MONTH),
//                                  currentTimeDate.get(Calendar.DATE),
//                                  currentTimeDate.get(Calendar.HOUR_OF_DAY),
//                                  currentTimeDate.get(Calendar.MINUTE),
//                                  currentTimeDate.get(Calendar.SECOND));



            } // if date accepted
        } // save time if needed
        
        // clipping planes:
        // clip planes
        app.setNearClippingPlaneDist(Double.parseDouble(nearClipTextField.getText()) );
        app.setFarClippingPlaneDist(Double.parseDouble(farClipTextField.getText()));
        
                
    } // saveSettings
    
}
