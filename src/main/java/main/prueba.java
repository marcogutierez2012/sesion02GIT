package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.TbUsuario;

public class prueba {

	public static void main(String[] args) {
		System.out.println("======JPA CRUD======");
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPA_clase01x");
		EntityManager em = fabrica.createEntityManager();
		
		Query query = em.createNativeQuery("{call findAll_usuarios()}", TbUsuario.class);
		
		List<TbUsuario> lstUsuarios = query.getResultList();
		
		System.out.println("Número de usuarios : " + lstUsuarios.size());
		System.out.println("==========================================");
		//List<TbUsuario> lstUsuarios = em.createQuery("Select t From TbUsuario t", TbUsuario.class).getResultList();
		//System.out.println("Número de usuarios : " + lstUsuarios.size());
		
		
		
	}

}
