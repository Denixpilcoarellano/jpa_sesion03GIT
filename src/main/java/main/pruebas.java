package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TbUsuario;

public class pruebas {

	public static void main(String[] args) {
		System.out.println("------------");
		System.out.println("--listar usuario--");
		EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("JPA_Sesion01");
		EntityManager em=fabrica.createEntityManager();
		List<TbUsuario> listUsuario=em.createQuery("select a from TbUsuario a",TbUsuario.class).getResultList();
        System.out.print("nro de usuario : "+listUsuario.size());
	}

}
