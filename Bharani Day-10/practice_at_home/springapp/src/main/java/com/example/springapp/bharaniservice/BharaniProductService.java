package com.example.springapp.bharaniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.bharanimodel.BharaniProduct;
import com.example.springapp.bharanirepository.BharaniProductRepo;

@Service
public class BharaniProductService {
    @Autowired
    private BharaniProductRepo productRepo;

    public boolean saveProduct(BharaniProduct product)
    {
        try
        {
            productRepo.save(product);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public List<BharaniProduct> findByCategoryList(String category)
    {
        return productRepo.findByCategoryList(category);
    }

    public BharaniProduct updateProduct(int productId, int quantityInStock)
    {
        productRepo.updateQuantity(productId, quantityInStock);
        return productRepo.findById(productId).orElse(null);
    }

    public BharaniProduct deleteProduct(int productId)
    {
        productRepo.deleteProduct(productId);
        return productRepo.findById(productId).orElse(null);
    }
}