package com.example.day5cw1.bharaniservice;

import org.springframework.stereotype.Service;

import com.example.day5cw1.bharanimodel.BharaniProduct;
import com.example.day5cw1.bharanirepository.BharaniProductRepo;


@Service
public class ProductService {
    public BharaniProductRepo productRepo;
    public ProductService(BharaniProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(BharaniProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,BharaniProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public BharaniProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
