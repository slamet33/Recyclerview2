package co.idn.recyclerview2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import co.idn.recyclerview2.fragment.catalog.CatalogFragment;
import co.idn.recyclerview2.fragment.onlineshop.OnlineShopFragment;
import co.idn.recyclerview2.fragment.playstore.PlaystoreFragment;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Fragment destinationFragment = null;
        switch (item.getItemId()) {
            case R.id.mn_playstore:
                destinationFragment = new PlaystoreFragment();
                break;

            case R.id.mn_onlineshop:
                destinationFragment = new OnlineShopFragment();
                break;

            case R.id.mn_catalog:
                destinationFragment = new CatalogFragment();
                break;
        }

        assert destinationFragment != null;
        fm.beginTransaction().replace(R.id.layout_container, destinationFragment).addToBackStack("any").commit();
        return super.onOptionsItemSelected(item);
    }
}
