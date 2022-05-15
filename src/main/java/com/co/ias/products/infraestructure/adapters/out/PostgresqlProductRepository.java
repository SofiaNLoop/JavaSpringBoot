package com.co.ias.products.infraestructure.adapters.out;

import com.co.ias.products.products.application.domain.Product;
import com.co.ias.products.products.application.domain.ProductId;
import com.co.ias.products.products.application.ports.out.ProductRepository;
import com.co.ias.products.shared.models.PageQuery;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PostgresqlProductRepository implements ProductRepository {

    private final DataSource dataSource;

    public PostgresqlProductRepository(DataSource dataSource) {

        this.dataSource = dataSource;
    }

    @Override
    public void store(Product product) {
        String sql = "INSERT INTO products(id, name, type_of_product, price) VALUES(?,?,?,?);";
        // para evitar la inyección de SQL
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, product.getProductId().getValue());
            preparedStatement.setString(2, product.getProductName().toString());
            preparedStatement.setString(3, product.getTypeOfProduct().toString());
            preparedStatement.setLong(4, product.getProductPrice().getValue());

            preparedStatement.execute();

        } catch (SQLException exception) {

            throw new RuntimeException("Error querying database", exception);

        }


    }

    @Override
    public Product getId(ProductId productId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(ProductId productId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> getProducts(PageQuery pageQuery) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
