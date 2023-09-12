package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TbUsuario;

public class prueba {

	public static void main(String[] args) {
		System.out.println("======JPA CRUD======");
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPA_clase01x");
		EntityManager em = fabrica.createEntityManager();
		
		List<TbUsuario> lstUsuarios = em.createQuery("Select t From TbUsuario t", TbUsuario.class).getResultList();
		System.out.println("Número de usuarios : " + lstUsuarios.size());

		
		
		
	}

}
