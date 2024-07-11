package com.ironhack.midterm_project.service.interfaces;

//import com.ironhack.midterm_project.model.Employee;
import com.ironhack.midterm_project.controller.dto.SellerDTO;
import com.ironhack.midterm_project.controller.dto.SellerEmailDTO;
import com.ironhack.midterm_project.controller.dto.SellerNameDTO;
import com.ironhack.midterm_project.controller.dto.SellerSalesDTO;
import com.ironhack.midterm_project.model.Department;
import com.ironhack.midterm_project.model.Seller;

import java.util.List;

public interface ISellerService {
    List<Seller> getAllSellers();
    Seller getSellerById(Integer id);
    void addNewSeller(Seller seller);
    void updateSellerName(SellerNameDTO sellerNameDTO, Integer id);
    void updateSellerEmail(SellerEmailDTO sellerEmailDTO, Integer id);
    void updateSellerSales(SellerSalesDTO sellerSalesDTO, Integer id);
    void updateSellerInformation(SellerDTO sellerDTO, Integer id);
    void deleteSeller(Integer id);
}
