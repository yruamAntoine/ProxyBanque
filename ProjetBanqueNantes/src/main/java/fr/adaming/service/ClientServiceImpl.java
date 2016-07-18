package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.dao.IClientDao;
import fr.adaming.model.Client;

@Service("clientService")
public class ClientServiceImpl implements IClientService {

	
	@Autowired
	IClientDao clientDao;
	
	
	public IClientDao getClientDao() {
		return clientDao;
	}

	public void setClientDao(IClientDao clientDao) {
		this.clientDao = clientDao;
	}

	
	@Override
	public void addClient(Client client) {
		clientDao.addClient(client);
	}

	@Override
	public void updateClient(Client client) {
		clientDao.updateClient(client);

	}



	@Override
	public List<Client> selectAllClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> selectClientByIdConseiller(Long idConseiller) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client findClientById(int idClient) {
		return clientDao.findClientById(idClient);
	}

	@Override
	public List<Client> findClientByNomAndPrenom(String nom, String prenom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClient(Client client) {
		clientDao.deleteClient(client);
		
	}

}
