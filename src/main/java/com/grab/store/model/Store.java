package com.grab.store.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer storeId;
    private String storeName;
    private String storeManager;
    private String storePhone;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToMany(targetEntity = Item.class, cascade = CascadeType.ALL)
    private List<Item> itemList = new ArrayList<>();

    public Store() {
        super();
    }

    public Store(Integer storeId, String storeName, String storeManager, String storePhone, Address address,
                 List<Item> itemList) {
        super();
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeManager = storeManager;
        this.storePhone = storePhone;
        this.address = address;
        this.itemList = itemList;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreManager() {
        return storeManager;
    }

    public void setStoreManager(String storeManager) {
        this.storeManager = storeManager;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
