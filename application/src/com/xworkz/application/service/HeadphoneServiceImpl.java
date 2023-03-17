package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.constant.Brand;
import com.xworkz.application.constant.Color;
import com.xworkz.application.constant.TypeAndWeight;
import com.xworkz.application.dto.HeadphoneDTO;

public class HeadphoneServiceImpl implements HeadphoneService {

	@Override 
	public boolean validateAndSave(HeadphoneDTO dto) {

		System.out.println("Running HeadphoneServiceImpl..." + dto);

		if (dto != null) {
			System.out.println("dto is not null, we can validate the properties...");

			Brand brand = dto.getBrand();
			String modelNo = dto.getModelNo();
			double price = dto.getPrice();
			boolean isBass = dto.isBass();
			Color color = dto.getColor();
			TypeAndWeight typeAndWeight = dto.getTypeAndWeight();
			String customerName = dto.getCustomerName();
			int invoiceNo = dto.getInvoiceNo();
			LocalDate mfgDate = dto.getMfgDate();
			int warrentyPeriod = dto.getWarrantyPeriod();

			boolean validBrand = false;
			boolean validModelNo = false;
			boolean validPrice = false;
			boolean validIsBass = false;
			boolean validColor = false;
			boolean validTypeAndWeight = false;
			boolean validCustomerName = false;
			boolean validInvoiceNo = false;
			boolean validMfgDate = false;
			boolean validWarrentyPeriod = false;

			if (brand != null) {
				System.out.println("brand is valid..");
				validBrand = true;
			} else {
				System.err.println("barand is invalid..");
			}

			if (modelNo != null && !modelNo.isEmpty() && modelNo.length() > 3 && modelNo.length() < 30) {
				System.out.println("modelNo is valid..");
				validModelNo = true;
			} else {
				System.err.println("modelNo is invalid..");
			}

			if (price > 0 && price < 100000) {
				System.out.println("price is valid..");
				validPrice = true;
			} else {
				System.err.println("price is invalid..");
			}

			if (isBass != false) {
				System.out.println("isBass valid..");
				validIsBass = true;
			} else {
				System.err.println("isBass invalid..");
			}

			if (color != null) {
				System.out.println("color is valid..");
				validColor = true;
			} else {
				System.err.println("color invalid..");

			}

			if (typeAndWeight != null) {
				System.out.println("typeAndWeight is valid..");
				validTypeAndWeight = true;
			} else {
				System.err.println("typeAndWeight is invalid..");
			}

			if (customerName != null && !customerName.isEmpty() && customerName.length() > 1
					&& customerName.length() < 20) {
				System.out.println("customerName is valid..");
				validCustomerName = true;
			} else {
				System.err.println("customerName is invalid.. ");
			}

			if (invoiceNo > 0 && invoiceNo < 1000) {
				System.out.println("invoiceNo is valid..");
				validInvoiceNo = true;
			} else {
				System.err.println("invoiceNo is invalid..");
			}

			LocalDate tommorow = LocalDate.now().plusDays(1);
			LocalDate startDate = LocalDate.of(2015, 2, 4);
			if (mfgDate != null && mfgDate.isEqual(tommorow) && mfgDate.isAfter(startDate)) {
				System.out.println("mfgDate is valid..");
				validMfgDate = true;
			} else {
				System.err.println("mfgDate is invalid..");
			}

			if (warrentyPeriod > 0 && warrentyPeriod < 5) {
				System.out.println("warrentyPeriod is valid..");
				validWarrentyPeriod = true;
			} else {
				System.err.println("warrentyPeriod is invalid..");
			}

			if (validBrand && validModelNo && validPrice && validIsBass && validColor && validTypeAndWeight
					&& validCustomerName && validInvoiceNo && validMfgDate && validWarrentyPeriod) {
				System.out.println("Validation is done and saver..");
				return true;
			} else {
				System.err.println("dto is not valid..");
			}
		}

		return false;
	}

}
