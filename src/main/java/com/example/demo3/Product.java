package com.example.demo3;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;


@Document(collection = "product")
public class Product {
    public Product(){ }
    public Product(String name){this.name=name; }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    @MongoId(value = FieldType.OBJECT_ID)
    private String _id;

    private String name;






}
