package co.idn.recyclerview2.fragment.onlineshop;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.idn.recyclerview2.R;
import co.idn.recyclerview2.adapter.onlineshop.OnlineShopAdapter;
import co.idn.recyclerview2.adapter.playstore.AppsAdapter;
import co.idn.recyclerview2.adapter.playstore.BookAdapter;
import co.idn.recyclerview2.adapter.playstore.VoucherAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class OnlineShopFragment extends Fragment {


    private RecyclerView rvOnlineShop;
    private OnlineShopAdapter adapter;

    String[] produckName = {"Laptop ASUS ROG", "Samsung Iphone MX", "Headset M2", "Portable Hardisk", "MicroSD 2 TB", "Google Glass"};
    String[] productSpek = {"15inch core i9", "6.3 , 6GB, 512 GB", "Turbo Bass", "20TB", "100GB", "Anti Radiation-Smart Glass"};
    String[] productRate = {"4.5", "5.1", "3.1", "4.4", "5.0", "1.1"};
    String[] productPrice = {"200000000", "40000000", "200000", "6000000", "2000000", "20000"};
    int[] productImaage = {R.drawable.rog, R.drawable.rog, R.drawable.rog, R.drawable.rog, R.drawable.rog, R.drawable.rog};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_online_shop, container, false);
        rvOnlineShop = v.findViewById(R.id.rv_online_shop);

        rvOnlineShop.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, true));

        adapter = new OnlineShopAdapter(getActivity(), produckName, productPrice, productRate, productSpek, productImaage);

        rvOnlineShop.setAdapter(adapter);
        return v;
    }

}
