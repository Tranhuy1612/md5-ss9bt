package ra.md5ss9bt.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ra.md5ss9bt.model.Product;

public interface IProductRepository extends JpaRepository<Product,Long> {
}
