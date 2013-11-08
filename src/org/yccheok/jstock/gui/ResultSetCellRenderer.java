/*
 * JStock - Free Stock Market Software
 * Copyright (C) 2010 Yan Cheng CHEOK <yccheok@yahoo.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package org.yccheok.jstock.gui;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.UIManager;
import org.yccheok.jstock.engine.ResultType;

/**
 *
 * @author yccheok
 */
public class ResultSetCellRenderer extends javax.swing.JPanel implements ListCellRenderer {

    /** Creates new form ResultSetCellRenderer */
    public ResultSetCellRenderer() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.X_AXIS));

        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(88, 14));
        jLabel1.setMinimumSize(new java.awt.Dimension(88, 14));
        jLabel1.setPreferredSize(new java.awt.Dimension(88, 14));
        add(jLabel1);

        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(200, 14));
        jLabel2.setMinimumSize(new java.awt.Dimension(200, 14));
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 14));
        add(jLabel2);

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getSize()-2f));
        jLabel3.setForeground(javax.swing.UIManager.getDefaults().getColor("ComboBox.disabledForeground"));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(104, 13));
        jLabel3.setMinimumSize(new java.awt.Dimension(104, 13));
        jLabel3.setPreferredSize(new java.awt.Dimension(104, 13));
        add(jLabel3);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    // Do not use static, so that our on-the-fly look n feel change will work.
    private final Color cfc  = UIManager.getColor("ComboBox.foreground");
    private final Color cbc  = UIManager.getColor("ComboBox.background");
    private final Color csfc = UIManager.getColor("ComboBox.selectionForeground");
    private final Color csbc = UIManager.getColor("ComboBox.selectionBackground");
    private final Color cdfc = UIManager.getColor("ComboBox.disabledForeground");
    // For Nimbus look n feel.
    private final Color nimbus_csfc;
    {
         Color c = UIManager.getColor("ComboBox:\"ComboBox.renderer\"[Selected].textForeground");
         // Pretty interesting. Applying "c" directly on the component will not
         // work. I have the create a new instance of Color based on "c" to make
         // it works.
         nimbus_csfc = c != null ? new Color(c.getRed(), c.getGreen(), c.getBlue()) : null;
    }
    private final Color nimbus_csbc;
    {
        Color c = UIManager.getColor("ComboBox:\"ComboBox.renderer\"[Selected].background");
         // Pretty interesting. Applying "c" directly on the component will not
         // work. I have the create a new instance of Color based on "c" to make
         // it works.
        nimbus_csbc = c != null ? new Color(c.getRed(), c.getGreen(), c.getBlue()) : null;
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        final Color _csbc = csbc != null ? csbc : nimbus_csbc;
        final Color _csfc = csfc != null ? csfc : nimbus_csfc;
        
        this.setBackground(isSelected ? _csbc : cbc);
        this.setForeground(isSelected ? _csfc : cfc);
        jLabel1.setBackground(isSelected ? _csbc : cbc);
        jLabel1.setForeground(isSelected ? _csfc : cfc);
        jLabel2.setBackground(isSelected ? _csbc : cbc);
        jLabel2.setForeground(isSelected ? _csfc : cfc);
        jLabel3.setBackground(isSelected ? _csbc : cbc);
        jLabel3.setForeground(cdfc);

        final ResultType result = (ResultType)value;
        jLabel1.setText(result.symbol);
        jLabel2.setText(result.name);
        final String type = result.typeDisp != null ? result.typeDisp : result.type;
        final String exch = result.exchDisp != null ? result.exchDisp : result.exch;
        jLabel3.setText(type  + " - " + exch);
        return this;
    }

}
