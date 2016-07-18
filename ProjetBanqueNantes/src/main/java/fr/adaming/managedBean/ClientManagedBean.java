package fr.adaming.managedBean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Component;


import fr.adaming.model.Client;
import fr.adaming.model.Conseiller;

import fr.adaming.service.IClientService;
import fr.adaming.service.IConseillerService;

@ManagedBean(name="clientBean")
@SessionScoped
@Component
public class ClientManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Client client;
	private long idConseiller;
	private int idClient;
	
	@ManagedProperty(value="#{conseillerService}")
	IConseillerService conseillerService;
	
	@ManagedProperty(value="#{clientService}")
	IClientService clientService;

//=====================================================================================================
	//Constructeur
	public ClientManagedBean() {
	this.client=new Client();
}
	
//======================================================================================================
	//Getters et Setters 
	
	public Client getClient() {
		return client;
	}


	public int  getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public long getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(long idConseiller) {
		this.idConseiller = idConseiller;
	}

	public IConseillerService getConseillerService() {
		return conseillerService;
	}

	public void setConseillerService(IConseillerService conseillerService) {
		this.conseillerService = conseillerService;
	}

	public IClientService getClientService() {
		return clientService;
	}

	public void setClientService(IClientService clientService) {
		this.clientService = clientService;
	}

	
//==========================================================================================================
	//Methodes 
	

	public void addClient(){
		Conseiller conseiller=conseillerService.findConseillerById(idConseiller);
		this.client.setConseiller(conseiller);
		clientService.addClient(this.client);
		this.client=null;
		
	}
	
	public void deleteClient(){
		Client clt = clientService.findClientById(idClient);
		clientService.deleteClient(clt);
		this.client=null;
	}
	
}
