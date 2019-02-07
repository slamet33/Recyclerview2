package co.idn.recyclerview2.adapter.catalog;

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
import co.idn.recyclerview2.adapter.onlineshop.OnlineShopAdapter;

public class CatalogAdapter extends RecyclerView.Adapter<CatalogAdapter.MyViewHolder> {

    private final int[] catalogImagee;
    private final String[] catalogNamee;
    private final Context context;

    public CatalogAdapter(Context context, String[] catalogName, int[] catalogImage) {
        this.context = context;
        catalogImagee = catalogImage;
        catalogNamee = catalogName;
    }


    @NonNull
    @Override
    public CatalogAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CatalogAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.list_catalog, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CatalogAdapter.MyViewHolder myViewHolder, int i) {
        myViewHolder.tvNameCatalog.setText(catalogNamee[i]);
        myViewHolder.imgCatalog.setImageResource(catalogImagee[i]);
    }

    @Override
    public int getItemCount() {
        return catalogNamee.length;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvNameCatalog;
        ImageView imgCatalog;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNameCatalog = itemView.findViewById(R.id.tv_catalog_name);
            imgCatalog = itemView.findViewById(R.id.img_catalog);
        }
    }


}
