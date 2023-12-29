package com.example.quizapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Chude123 extends BaseAdapter {

    private ArrayList<Chude> listProduct;

    public Chude123(ArrayList<Chude> listProduct) {
        this.listProduct = listProduct;
    }

    public ArrayList<Chude> getListProduct() {
        return listProduct;
    }

    public void setListProduct(ArrayList<Chude> listProduct) {
        this.listProduct = listProduct;
    }

    @Override
    public int getCount() {
        return listProduct.size();
    }

    @Override
    public Object getItem(int i) {
        //i la vtri cua Item trong danh sach
        return listProduct.get(i);
    }

    @Override
    public long getItemId(int i) {
        return listProduct.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewItem;
        if(view == null)viewItem = View.inflate(viewGroup.getContext(), R.layout.farme_2_1, null);
        else viewItem = view;
        Chude product = listProduct.get(i);



        ImageView img_place = viewItem.findViewById(R.id.product_image);
        img_place.setImageResource(product.getImage());

        ((TextView) viewItem.findViewById(R.id.product_id)).setText(String.valueOf(product.getId()));

        ((TextView) viewItem.findViewById(R.id.product_name)).setText(product.getName());

        ((TextView) viewItem.findViewById(R.id.product_price)).setText(product.getGioiThieu());
        return viewItem;
    }
}
