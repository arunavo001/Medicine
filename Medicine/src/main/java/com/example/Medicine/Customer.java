package com.example.Medicine;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Integer id;
    @Column(name = "c_batch_no")
    String c_batch_no;
    @Column(name = "c_manufacturer")
    String c_manufacturer;
    @Column(name = "c_name")
    String c_name;
    @Column(name = "c_packaging")
    String c_packaging;
    @Column(name = "c_unique_code")
    String c_unique_code;
    @Column(name = "d_expiry_date")
    String d_expiry_date;
    @Column(name = "hsn_code")
    String hsn_code;
    @Column(name = "n_balance_qty")
    String n_balance_qty;
    @Column(name = "n_mrp")
    String n_mrp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getC_batch_no() {
        return c_batch_no;
    }

    public void setC_batch_no(String c_batch_no) {
        this.c_batch_no = c_batch_no;
    }

    public String getC_manufacturer() {
        return c_manufacturer;
    }

    public void setC_manufacturer(String c_manufacturer) {
        this.c_manufacturer = c_manufacturer;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_packaging() {
        return c_packaging;
    }

    public void setC_packaging(String c_packaging) {
        this.c_packaging = c_packaging;
    }

    public String getC_unique_code() {
        return c_unique_code;
    }

    public void setC_unique_code(String c_unique_code) {
        this.c_unique_code = c_unique_code;
    }

    public String getD_expiry_date() {
        return d_expiry_date;
    }

    public void setD_expiry_date(String d_expiry_date) {
        this.d_expiry_date = d_expiry_date;
    }

    public String getHsn_code() {
        return hsn_code;
    }

    public void setHsn_code(String hsn_code) {
        this.hsn_code = hsn_code;
    }

    public String getN_balance_qty() {
        return n_balance_qty;
    }

    public void setN_balance_qty(String n_balance_qty) {
        this.n_balance_qty = n_balance_qty;
    }

    public String getN_mrp() {
        return n_mrp;
    }

    public void setN_mrp(String n_mrp) {
        this.n_mrp = n_mrp;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", c_batch_no='" + c_batch_no + '\'' +
                ", c_manufacturer='" + c_manufacturer + '\'' +
                ", c_name='" + c_name + '\'' +
                ", c_packaging='" + c_packaging + '\'' +
                ", c_unique_code='" + c_unique_code + '\'' +
                ", d_expiry_date='" + d_expiry_date + '\'' +
                ", hsn_code='" + hsn_code + '\'' +
                ", n_balance_qty='" + n_balance_qty + '\'' +
                ", n_mrp='" + n_mrp + '\'' +
                '}';
    }
}
