package main;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.TbUsuario;

public class pruebas {

	public static void main(String[] args) {
		System.out.println("------------");
		System.out.println("--listar usuario--");
		EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("JPA_Sesion01");
		EntityManager em=fabrica.createEntityManager();
		
		Query query=em.createNativeQuery("{ call usp_validaAcceso(?,?)}",TbUsuario.class);
		query.setParameter(1,"U001@gmail.com");
		query.setParameter(2,"10001");
		TbUsuario u=(TbUsuario)query.getSingleResult();
		if(u == null){
			System.out.print("usuario no existe");
			
		}else{
			System.out.print("bienvenido : " + u.getNomUsua());
			
		}
		System.out.print("----------------------------------------------------");
	}

}
