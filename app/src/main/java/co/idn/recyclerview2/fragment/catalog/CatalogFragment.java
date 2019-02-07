package co.idn.recyclerview2.fragment.catalog;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.idn.recyclerview2.R;
import co.idn.recyclerview2.adapter.catalog.CatalogAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class CatalogFragment extends Fragment {


    private RecyclerView rvCatalog;
    CatalogAdapter adapter;

    String[] catalogName = {"Ring 4.0", "White Dress", "Gold 5.7.2", "Ring Magdalena", "Ring Zuper Gold by TagHeuer", "Ring by Supreme"};
    int[] catalogImage = {R.drawable.wedding, R.drawable.wedding, R.drawable.wedding, R.drawable.wedding, R.drawable.wedding, R.drawable.wedding,};

    public CatalogFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_catalog, container, false);
        rvCatalog = v.findViewById(R.id.rv_catalog);

        rvCatalog.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, true));

        adapter = new CatalogAdapter(getActivity(), catalogName, catalogImage);
        rvCatalog.setAdapter(adapter);
        return v;
    }

}
