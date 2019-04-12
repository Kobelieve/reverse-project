package com.kobe.mybatis.model;

public class ProductTemp {
    private Integer id;

    private Integer producttypeid;

    private Integer brandid;

    private String productname;

    private Double marketprice;

    private Double salesprice;

    private Integer stockupdate;

    private Double weight;

    private String logoimg;

    private String functiondesc;

    private Integer storenumber;

    private String measuringunitname;

    private String manufacturermodel;

    private Integer fromid;

    private String functiondescnew;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProducttypeid() {
        return producttypeid;
    }

    public void setProducttypeid(Integer producttypeid) {
        this.producttypeid = producttypeid;
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public Double getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(Double marketprice) {
        this.marketprice = marketprice;
    }

    public Double getSalesprice() {
        return salesprice;
    }

    public void setSalesprice(Double salesprice) {
        this.salesprice = salesprice;
    }

    public Integer getStockupdate() {
        return stockupdate;
    }

    public void setStockupdate(Integer stockupdate) {
        this.stockupdate = stockupdate;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getLogoimg() {
        return logoimg;
    }

    public void setLogoimg(String logoimg) {
        this.logoimg = logoimg == null ? null : logoimg.trim();
    }

    public String getFunctiondesc() {
        return functiondesc;
    }

    public void setFunctiondesc(String functiondesc) {
        this.functiondesc = functiondesc == null ? null : functiondesc.trim();
    }

    public Integer getStorenumber() {
        return storenumber;
    }

    public void setStorenumber(Integer storenumber) {
        this.storenumber = storenumber;
    }

    public String getMeasuringunitname() {
        return measuringunitname;
    }

    public void setMeasuringunitname(String measuringunitname) {
        this.measuringunitname = measuringunitname == null ? null : measuringunitname.trim();
    }

    public String getManufacturermodel() {
        return manufacturermodel;
    }

    public void setManufacturermodel(String manufacturermodel) {
        this.manufacturermodel = manufacturermodel == null ? null : manufacturermodel.trim();
    }

    public Integer getFromid() {
        return fromid;
    }

    public void setFromid(Integer fromid) {
        this.fromid = fromid;
    }

    public String getFunctiondescnew() {
        return functiondescnew;
    }

    public void setFunctiondescnew(String functiondescnew) {
        this.functiondescnew = functiondescnew == null ? null : functiondescnew.trim();
    }
}