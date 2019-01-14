/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.utils.ui;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/**
 *
 * @author f
 */
public class IconHeaderRenderer extends DefaultTableCellRenderer {
  @Override
  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
      boolean hasFocus, int row, int column) {
    if (table != null) {
      JTableHeader header = table.getTableHeader();
      if (header != null) {
        setForeground(header.getForeground());
        setBackground(header.getBackground());
        setFont(header.getFont());
      }
    }
    if (value instanceof TextAndIcon) {
      setIcon(((TextAndIcon) value).icon);
      setText(((TextAndIcon) value).text);
    } else {
      setText((value == null) ? "" : value.toString());
      setIcon(null);
    }
    setBorder(UIManager.getBorder("TableHeader.cellBorder"));
    setHorizontalAlignment(JLabel.CENTER);
    return this;
  }
}

