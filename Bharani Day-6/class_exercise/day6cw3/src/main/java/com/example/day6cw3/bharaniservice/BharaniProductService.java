package com.example.day6cw3.bharaniservice;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.bharanimodel.BharaniProduct;
import com.example.day6cw3.bharanirepository.BharaniProductRepo;

@Service
public class BharaniProductService {
    public BharaniProductRepo productRepo;
    public BharaniProductService(BharaniProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(BharaniProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<BharaniProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<BharaniProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public BharaniProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
