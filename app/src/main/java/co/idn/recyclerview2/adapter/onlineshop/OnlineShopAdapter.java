package co.idn.recyclerview2.adapter.onlineshop;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import co.idn.recyclerview2.R;

public class OnlineShopAdapter extends RecyclerView.Adapter<OnlineShopAdapter.MyViewHolder> {

    private final String[] productName;
    private final Context context;
    private final String[] productPrice;
    private final String[] productRate;
    private final String[] productSpek;
    private final int[] productImage;

    public OnlineShopAdapter(Context context, String[] produckName, String[] productPrice, String[] productRate, String[] productSpek, int[] productImaage) {
        productName = produckName;
        this.context = context;
        this.productPrice = productPrice;
        this.productSpek = productSpek;
        this.productRate = productRate;
        productImage = productImaage;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.list_onlineshop, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.tvProductName.setText(productName[i]);
        myViewHolder.tvProductSpek.setText(productSpek[i]);
        myViewHolder.tvProductPrice.setText(productPrice[i]);
        myViewHolder.tvProductRate.setText(productRate[i]);
        myViewHolder.imgProduct.setImageResource(productImage[i]);
    }

    @Override
    public int getItemCount() {
        return productImage.length;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvProductName, tvProductPrice, tvProductSpek, tvProductRate;
        ImageView imgProduct;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvProductName = itemView.findViewById(R.id.tv_product_name);
            tvProductPrice = itemView.findViewById(R.id.tv_product_price);
            tvProductRate = itemView.findViewById(R.id.tv_product_rate);
            tvProductSpek = itemView.findViewById(R.id.tv_product_spek);
            imgProduct = itemView.findViewById(R.id.img_product);
        }
    }
}
