/************************************************************
-----BEGIN PGP SIGNED MESSAGE-----
Hash: SHA256

 *                 M O N E Y C H A N G E R
 *
 *  Open Transactions:
 *       Financial Cryptography and Digital Cash
 *       Library, Protocol, API, Server, and GUI
 *
 *    	 -- Anonymous Numbered Accounts.
 *    	 -- Untraceable Digital Cash.
 *    	 -- Triple-Signed Receipts.
 *    	 -- Cheques, Vouchers, Transfers, Inboxes.
 *    	 -- Basket Currencies, Markets, Payment Plans.
 *    	 -- Signed, XML, Ricardian-style Contracts.
 *
 *  Copyright (C) 2010-2012 by "Fellow Traveler" (A pseudonym)
 *
 *  EMAIL:
 *  FellowTraveler@rayservers.net
 *
 *  FINGERPRINT:
 *  9DD5 90EB 9292 4B48 0484  7910 0308 00ED F951 BB8E
 *
 *  BITCOIN:  1NtTPVVjDsUfDWybS4BwvHpG2pdS9RnYyQ
 *
 *  OFFICIAL PROJECT WIKI:
 *  https://github.com/FellowTraveler/Moneychanger
 *  https://github.com/FellowTraveler/Open-Transactions/wiki
 *
 *  WEBSITE:
 *  http://www.OpenTransactions.org/
 *
 *  Components and licensing:
 *   -- Moneychanger..A Java client GUI.....LICENSE:.....GPLv3
 *   -- OTLib.........A class library.......LICENSE:...LAGPLv3
 *   -- OT-API........A client API..........LICENSE:...LAGPLv3
 *   -- testwallet....Command-line client...LICENSE:...LAGPLv3
 *   -- OT-Server.....Server Application....LICENSE:....AGPLv3
 *  Github.com/FellowTraveler/Open-Transactions/wiki/Components
 *
 *  All of the above OT components were designed and written by
 *  Fellow Traveler, with the exception of Moneychanger, which
 *  was contracted out to Vicky C (livewire_3001@yahoo.com).
 *
 *  -----------------------------------------------------
 *
 *   LICENSE:
 *   This program is free software: you can redistribute it
 *   and/or modify it under the terms of the GNU General
 *   Public License as published by the Free Software
 *   Foundation, either version 3 of the License, or (at your
 *   option) any later version.
 *
 *   You should have received a copy of the GNU General
 *   Public License along with this program.  If not, see:
 *   http://www.gnu.org/licenses/
 *
 *   If you would like to use this software outside of the free
 *   software license, please contact FellowTraveler.
 *   (Unfortunately many will run anonymously and untraceably,
 *   so who could really stop them?)
 *
 *   DISCLAIMER:
 *   This program is distributed in the hope that it will be
 *   useful, but WITHOUT ANY WARRANTY; without even the implied
 *   warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 *   PURPOSE.  See the GNU General Public License for more
 *   details.

-----BEGIN PGP SIGNATURE-----
Version: GnuPG v1.4.11 (Darwin)

iQIcBAEBCAAGBQJOj7gfAAoJEAMIAO35UbuOs3sP/2rrjSdYu/AsXcgLK9/9CP4a
lIJfw3KLvybKZjZW5r5j+4xUlCYIqPZSI66PGDChGPMPFcZQN6M4Ddpn9kbctymS
sdTXvbdFhpbV6k2wSa1Fz97ygfXJc/7MDTmHYbZ53hVV8AoUBrCHWtVttkQD31o3
Pn/qGmy+jOgTvjEXhjEpV66pDkMWze1SiI1MArHUziCYoxItuM45x0EfzwQIqlo3
ku2R7rRTtqm47Dgea12psWrjbPS5XRL1Q8Hs38Z1J0JdFlfn6cJYe52Iiluzof6M
kCLhy6FH8QfIADfrKkFP48EIhnVquDlkV9AlJ1r217K3cpK2jEjlZUnGBECMAMEo
pSXXk1BLNgxsa4yaXCgHY92/MhgtcdCMLkcCq6MWUTGZsLGiWIiQGmO9mwBfNIlY
SawlIviuS5DiE/D16A290Byxhha/5e144cIiKm27fSQra8eogUXNfZdZeuv6n69v
t8QjeBjoLhe5/KnRNoGLpSXhPphsWLRSJBru77ZU2msHfmkNfcP2UoEUCfNTfTbE
XpyRfeyRVowVKeKunV9KUSHgdD5wa6RUeyodAbaHvWrFpIpNkaFIP9OwhRULpjx0
arwVNYucbX1qb2I8HBm2u+IRWQTONp74TFFjU0/CVAXu2DeJKY5mL4zDej35c5j9
AK+ZirdWhhoHeWR1tAkN
=RcXP
-----END PGP SIGNATURE-----
 **************************************************************/

/*
 * AddBasketDialog.java
 *
 * Created on Jan 24, 2012, 7:55:53 AM
 */
package com.wrapper.ui.dialogs;

import com.wrapper.core.Basket;
import com.wrapper.core.NYM;
import com.wrapper.core.jni.otapi;
import com.wrapper.core.util.OTAPI_Func;
import com.wrapper.core.util.Utility;
import com.wrapper.ui.MainPage;
import com.wrapper.ui.model.BasketTableModel;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Vicky C
 */
public class AddBasketDialog extends javax.swing.JDialog {

    private String serverID;
    private Map nymRegisteredMap;

    /** Creates new form AddBasketDialog */
    public AddBasketDialog(java.awt.Frame parent, boolean modal, String serverID) {
        super(parent, modal);
        initComponents();
        this.serverID = serverID;
        init();

        setLocation(Utility.getLocation(this.getSize()));

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox6 = new com.wrapper.ui.custom.SteppedComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Basket Creation");

        jLabel1.setText("Minimum Transfer Amount");
        jLabel1.setName("jLabel1"); // NOI18N

        jTextField1.setText("10");
        jTextField1.setToolTipText("positive int");
        jTextField1.setName("jTextField1"); // NOI18N

        jLabel2.setText("Number of sub-currencies");
        jLabel2.setName("jLabel2"); // NOI18N

        jTextField2.setText("3");
        jTextField2.setToolTipText("min 2");
        jTextField2.setName("jTextField2"); // NOI18N

        jLabel3.setText("Nym");
        jLabel3.setName("jLabel3"); // NOI18N

        jComboBox6.setToolTipText("NYM");
        jComboBox6.setName("jComboBox6"); // NOI18N
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("?");
        jButton2.setToolTipText("Given the example: [10 Rands == 2 Silver, 5 Gold, 8 Euro]  the Minimum Transfer Amount is 10, and the number of sub- currencies is 3");
        jButton2.setName("jButton2"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel3)
                            .add(jLabel2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jComboBox6, 0, 172, Short.MAX_VALUE)
                            .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(jButton1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jComboBox6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jButton2))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
}//GEN-LAST:event_jComboBox6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int minTransferAmt = 0;
        int nbrSubCurrency = 0;

        try {
            minTransferAmt = Integer.parseInt(jTextField1.getText());
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            JOptionPane.showMessageDialog(null, "Please enter positive integer for minimum transfer amount", "Min Transfer Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (minTransferAmt < 1) {
            JOptionPane.showMessageDialog(null, "Please enter positive integer for minimum transfer amount", "Min Transfer Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            nbrSubCurrency = Integer.parseInt(jTextField2.getText());
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            JOptionPane.showMessageDialog(null, "Please enter positive integer for sub currencies", "Sub currency Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (nbrSubCurrency < 2) {
            JOptionPane.showMessageDialog(null, "Minimum value for sub currencies is 2", "Sub currency Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nymID = "ALL";

        if (nymRegisteredMap != null && nymRegisteredMap.size() > 0 && jComboBox6.getSelectedIndex() > -1) {
            nymID = ((String[]) nymRegisteredMap.get((Integer) jComboBox6.getSelectedIndex()))[1];
        }

        System.out.println("nymID:" + nymID);

        String basket = otapi.OT_API_GenerateBasketCreation(nymID, jTextField1.getText());
        System.out.println("basketID:" + basket);


        if (Basket.getAssetList(serverID,nymID, Utility.getBasketExistingAssets()).size() < nbrSubCurrency) {
            JOptionPane.showMessageDialog(null, "Sorry, you do not have enough assets as number of sub currencies", "Sub currency Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (int i = 0; i < nbrSubCurrency; i++) {
              System.out.println("Start");
            new SubCurrencyDetailDialog(null, true, serverID, nymID).setVisible(true);
            if (Utility.getCancelBasket()) {
                break;
            }

            basket = otapi.OT_API_AddBasketCreationItem(nymID, basket, Utility.getSubCurrency(), Utility.getMinTransfer());
                          System.out.println("End");

        }
        Utility.clearBasketExistingAssets();
        if (!Utility.getCancelBasket()) {

            OTAPI_Func theRequest = new OTAPI_Func(OTAPI_Func.FT.ISSUE_BASKET, serverID, nymID, basket);

            String strResponse = OTAPI_Func.SendRequest(theRequest, "ISSUE_BASKET");
            System.out.println("strResponse:" + strResponse);
            if (strResponse == null) {

                JOptionPane.showMessageDialog(null, "Basket cannot be issued", "Issue basket Error", JOptionPane.ERROR_MESSAGE);
            } else {

                String assetTypeID = otapi.OT_API_Message_GetNewAssetTypeID(strResponse);
                System.out.println("New assetTypeID:" + assetTypeID);
                Basket.loadAsset(assetTypeID, nymID, serverID);

                JOptionPane.showMessageDialog(null, "Basket issued successfully", "Issue basket success", JOptionPane.INFORMATION_MESSAGE);

                MainPage.setAssets(serverID);

            }


        } else {
            JOptionPane.showMessageDialog(null, "Issue of basket cancelled", "Issue basket", JOptionPane.INFORMATION_MESSAGE);
            Utility.setCancelBasket(false);

        }

        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                AddBasketDialog dialog = new AddBasketDialog(new javax.swing.JFrame(), true, "");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void init() {
        System.out.println("serverID:" + serverID);
        nymRegisteredMap = new NYM().loadRegisteredNYM(serverID);
        System.out.println("serverI22D:" + serverID);

        Utility.populateComboWithoutAll(nymRegisteredMap, jComboBox6);
        System.out.println("server33ID:" + serverID);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private static javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
