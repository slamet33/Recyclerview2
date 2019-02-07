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

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.MyViewHolder> {

    private final Context context;
    private final String[] bookName;
    private final int[] bookImage;

    public BookAdapter(Context context, String[] bookName, int[] bookImage) {
        this.context = context;
        this.bookName = bookName;
        this.bookImage = bookImage;
    }

    @NonNull
    @Override
    public BookAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new BookAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.list_apps, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BookAdapter.MyViewHolder myViewHolder, int i) {
        myViewHolder.tvNameApps.setText(bookName[i]);
        myViewHolder.imgApps.setImageResource(bookImage[i]);
    }

    @Override
    public int getItemCount() {
        return bookImage.length;
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
