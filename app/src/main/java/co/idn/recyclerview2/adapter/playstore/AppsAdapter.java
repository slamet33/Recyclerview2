package co.idn.recyclerview2.adapter.playstore;

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
import co.idn.recyclerview2.viewholder.MyViewHolder;

public class AppsAdapter extends RecyclerView.Adapter<AppsAdapter.MyViewHolder> {

    private final Context context;
    private final String[] appsName;
    private final int[] appsImage;

    public AppsAdapter(Context context, String[] appsName, int[] appsImage) {
        this.context = context;
        this.appsName = appsName;
        this.appsImage = appsImage;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.list_apps, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.tvNameApps.setText(appsName[i]);
        myViewHolder.imgApps.setImageResource(appsImage[i]);
    }

    @Override
    public int getItemCount() {
        return appsImage.length;
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
