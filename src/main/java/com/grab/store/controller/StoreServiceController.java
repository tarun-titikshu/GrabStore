package com.grab.store.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.grab.store.model.Store;
import com.grab.store.service.StoreService;

@RestController
@RequestMapping("/Home/Admin")
public class StoreServiceController {
	
	@Autowired 
	StoreService storeService;
	@GetMapping("/getAllStores")
	public ResponseEntity<?> getAllStores(){
		List<Store> allStores = storeService.getAllStores();
		return new ResponseEntity<List>(allStores,HttpStatus.OK);
	}
	
	@GetMapping("/getStoreById/{storeId}")
	 public ResponseEntity<?> getStoreById(@PathVariable int storeId) {
        try {
            Optional<Store> store = storeService.getStoreById(storeId);
            if (store.isPresent()) {
                return new ResponseEntity<>(store.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Store not found", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("An error occurred while fetching the store", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	@PostMapping("/addStore")
	public ResponseEntity<?> addStore(@RequestBody Store store){
		try {
			Store storeAdded = storeService.addStore(store);
			return new ResponseEntity<Store>(storeAdded,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<String>("Store Already Exists",HttpStatus.OK);
		}
	}
	
	@PutMapping("/updateStore/{storeId}")
	public ResponseEntity<?> updateStore(@RequestBody Store store ,@PathVariable int storeId )
	{
		Store 
	}
	
	
	
	
	
	
	
	
}
