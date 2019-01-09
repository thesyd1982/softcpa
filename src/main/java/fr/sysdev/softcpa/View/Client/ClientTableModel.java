/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.View.Client;


import fr.sysdev.softcpa.Service.IClientService;
import fr.sysdev.softcpa.constants.Constants;
import fr.sysdev.softcpa.entity.Client;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author f
 */
public class ClientTableModel extends AbstractTableModel {
    private final List<Client> clients ;
   @Autowired
    private  IClientService iClientService;
   
    private final String[] headers = { Constants.Labels.CLIENT_ID,Constants.Labels.NAME, Constants.Labels.SURNAME,Constants.Labels.EMAIL, Constants.Labels.PHONE_NUMBER, Constants.Labels.ADDRESS, Constants.Labels.CLIENT_STATUS};
 
    public ClientTableModel() {
        super();
       
        clients = iClientService.getClients();
    }
 
    @Override
    public int getRowCount() {
        return clients.size();
    }
 
    @Override
    public int getColumnCount() {
        return headers.length;
    }
 
    @Override
    public String getColumnName(int columnIndex) {
        return headers[columnIndex];
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return clients.get(rowIndex).getId();
            case 1:
                return clients.get(rowIndex).getName();
            case 2:
                return clients.get(rowIndex).getSurname();
            case 3:
                return clients.get(rowIndex).getEmail();
            case 4:
                return clients.get(rowIndex).getPhoneNumber();
            case 5:
                return clients.get(rowIndex).getAddress();
             case 6:
                return clients.get(rowIndex).getStatus();   
            default:
                return null; //Ne devrait jamais arriver
        }
  
    }


    @Override
    public boolean isCellEditable(int rowIndex,int columnIndex){return false;}




}