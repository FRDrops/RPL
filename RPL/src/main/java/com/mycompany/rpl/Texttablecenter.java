/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl;

import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;

/**
 *
 * @author ASUS
 */

public class Texttablecenter extends DefaultTableCellRenderer{
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        super.getTableCellRendererComponent(table, column, isSelected, hasFocus, row, column);
        setHorizontalAlignment(SwingConstants.CENTER);
    return this;
    };
}
