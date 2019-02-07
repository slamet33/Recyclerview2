package co.idn.recyclerview2.adapter.playstore;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import co.idn.recyclerview2.R;

public class VoucherAdapter extends RecyclerView.Adapter<VoucherAdapter.MyViewHolder> {

    private final Context context;
    private final String[] voucherName;
    private final int[] voucherImage;

    public VoucherAdapter(Context context, String[] voucherName, int[] voucherImage) {
        this.context = context;
        this.voucherName = voucherName;
        this.voucherImage = voucherImage;
    }

    @NonNull
    @Override
    public VoucherAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new VoucherAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.list_apps, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VoucherAdapter.MyViewHolder myViewHolder, int i) {
        myViewHolder.tvNameApps.setText(voucherName[i]);
        myViewHolder.imgApps.setImageResource(voucherImage[i]);
    }

    @Override
    public int getItemCount() {
        return voucherImage.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvNameApps;
        ImageView imgApps;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNameApps = itemView.findViewById(R.id.tv_nama_apps);
            imgApps = itemView.findViewById(R.id.img_apps);
        }
    }
}
