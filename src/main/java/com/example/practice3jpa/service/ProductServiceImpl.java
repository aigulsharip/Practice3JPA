package com.example.practice3jpa.service;

import com.example.practice3jpa.entities.Product;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service("jpaProductService")
//@Service()

@Repository
@Transactional
public class ProductServiceImpl implements ProductService {

    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly=true)
    @Override
    public List<Product> findAll() {
        return em.createNamedQuery(Product.FIND_ALL, Product.class).getResultList();
    }


}


