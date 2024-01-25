package com.mycompany.app;

import com.mycompany.app.models.Product;

import java.util.List;

public class ProductList {

    static List<Product> firstProductsList = List.of(
            new Product(1,"Livre",12.49,null,null,true,false),
            new Product(1,"CD musical",14.99,null,null,false,false),
            new Product(1,"Barre de chocolat",0.85,null,null,true,false)
    );

    static List<Product> secondProductsList = List.of(
            new Product(1,"boite de chocolat importée",10.00,null,null,true,true),
            new Product(1,"Flacon de parfum importé",47.5,null,null,false,true)

    );

    static List<Product> thirdProductsList = List.of(
            new Product(1,"Flacon de parfum importé",27.99,null,null,false,true),
            new Product(1,"Flacon de parfum",18.99,null,null,false,false),
            new Product(1,"boite de pillule contre la migraine",9.75,null,null,true,false),
            new Product(1,"boite de chocolat importée",11.25,null,null,true,true)

    );
}
