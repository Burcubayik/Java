package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product; //ürünle ilgili colid operasyonları

public interface ProductDao extends JpaRepository<Product, Integer>{ //iki interface birbiirinin extend eder
	

}
