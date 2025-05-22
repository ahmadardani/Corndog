/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.kelompok4.corndog.util;

import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author akasaka
 */
public class CurrencyRenderer extends DefaultTableCellRenderer {
    @Override
    protected void setValue(Object value) {
        if (value instanceof Integer) {
            setText("Rp. " + value);
        } else {
            super.setValue(value);
        }
    }
}
