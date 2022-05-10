package com.cpt202.xunwu.bean;

public class ProdCart<T> {
    private long productId;
    private String productName;
    private String productPicture;
    private double productPrice;
    private long productSaleVolume;
    private String productCategoryName;
    private String productDescription;
    private String productState;
    private String seller;
    private String buyer;

    public ProdCart(long productId, String productName, String productPicture, double productPrice,
            long productSaleVolume, String productCategoryName, String productDescription, String productState,
            String seller, String buyer) {
        this.productId = productId;
        this.productName = productName;
        this.productPicture = productPicture;
        this.productPrice = productPrice;
        this.productSaleVolume = productSaleVolume;
        this.productCategoryName = productCategoryName;
        this.productDescription = productDescription;
        this.productState = productState;
        this.seller = seller;
        this.buyer = buyer;
    }
    public String getProductState() {
        return productState;
    }

    public void setProductState(String productState) {
        this.productState = productState;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public long getProductSaleVolume() {
        return productSaleVolume;
    }

    public void setProductSaleVolume(long productSaleVolume) {
        this.productSaleVolume = productSaleVolume;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPicture() {
        return productPicture;
    }

    public void setProductPicture(String productPicture) {
        this.productPicture = productPicture;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
