package co.idn.recyclerview2.fragment.playstore;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.idn.recyclerview2.R;
import co.idn.recyclerview2.adapter.playstore.AppsAdapter;
import co.idn.recyclerview2.adapter.playstore.BookAdapter;
import co.idn.recyclerview2.adapter.playstore.VoucherAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlaystoreFragment extends Fragment {


    private RecyclerView rvApps, rvBook, rvVoucher;
    private AppsAdapter appsAdapter;
    private BookAdapter bookAdapter;
    private VoucherAdapter voucherAdapter;

    String[] appsName = {"Facebook", "Twitter", "Instagram", "Pinterst", "Tokopedia", "Bukalapak"};
    String[] bookName = {"Success Marketing", "Immposible", "Rich Mendset", "Ideal Leader", "Smiling Everithing", "Indonesia Indah"};
    String[] voucherName = {"Tahun Baru", "Idul Fitri", "Harbolnas", "Kemerdekaan", "Tahun Baru", "Puasa"};

    int[] appsImage = {R.drawable.fb, R.drawable.fb, R.drawable.fb, R.drawable.fb, R.drawable.fb, R.drawable.fb};
    int[] bookImage = {R.drawable.bookcov, R.drawable.bookcov, R.drawable.bookcov, R.drawable.bookcov, R.drawable.bookcov, R.drawable.bookcov,};
    int[] voucherImage = {R.drawable.fivety, R.drawable.fivety, R.drawable.fivety, R.drawable.fivety, R.drawable.fivety, R.drawable.fivety,};

    public PlaystoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_playstore, container, false);
        rvApps = v.findViewById(R.id.rv_playstore_apps);
        rvBook = v.findViewById(R.id.rv_playstore_book);
        rvVoucher = v.findViewById(R.id.rv_playstore_voucher);

        rvApps.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, true));
        rvBook.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, true));
        rvVoucher.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, true));

        appsAdapter = new AppsAdapter(getActivity(), appsName, appsImage);
        bookAdapter = new BookAdapter(getActivity(), bookName, bookImage);
        voucherAdapter = new VoucherAdapter(getActivity(), voucherName, voucherImage);

        rvApps.setAdapter(appsAdapter);
        rvVoucher.setAdapter(voucherAdapter);
        rvBook.setAdapter(bookAdapter);

        return v;
    }

}
