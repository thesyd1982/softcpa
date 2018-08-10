/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Services;


import fr.sysdev.softcpa.Models.Client;
import java.util.List;

/**
 *
 * @author sysdev
 */
public interface ClientService {
    public void  registerClient(Client client);
    public Client createClient();
    public void updateClient (Client client);
    public void deleteClient(Client client);
    public  List<Client> listClient();
}
