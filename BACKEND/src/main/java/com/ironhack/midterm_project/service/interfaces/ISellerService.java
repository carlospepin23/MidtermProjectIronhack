package com.ironhack.midterm_project.service.interfaces;

import com.ironhack.midterm_project.DTO.employee_dto.EmployeeNameDTO;
import com.ironhack.midterm_project.DTO.seller_dto.SellerDTO;
import com.ironhack.midterm_project.DTO.seller_dto.SellerEmailDTO;
import com.ironhack.midterm_project.DTO.seller_dto.SellerSalesDTO;
import com.ironhack.midterm_project.model.Seller;

import java.util.List;

public interface ISellerService {
    List<Seller> getAllSellers();
    Seller getSellerById(Integer id);
    void updateSellerName(EmployeeNameDTO sellerNameDTO, Integer id);
    void updateSellerEmail(SellerEmailDTO sellerEmailDTO, Integer id);
    void updateSellerSales(SellerSalesDTO sellerSalesDTO, Integer id);
    void updateSellerInformation(SellerDTO sellerDTO, Integer id);
    void updateSellerInformation(SellerDTO sellerDTO, String name);
    void deleteSeller(Integer id);
    void deleteAllSellersExceptId(Integer id);
}
