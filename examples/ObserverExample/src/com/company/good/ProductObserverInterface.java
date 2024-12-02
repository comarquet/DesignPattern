package com.company.good;

import java.util.List;

public interface ProductObserverInterface {
    public void update(ProductOrder newOrder, List<ProductOrder> currentProductOderList);
}
