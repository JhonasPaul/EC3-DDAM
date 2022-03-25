package idat.ortiz.jonathan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import idat.ortiz.jonathan.Adaptador.ViewPagerAdaptador;
import idat.ortiz.jonathan.Fragments.FragmentListaPlatos;
import idat.ortiz.jonathan.Fragments.FragmentNuevoPlato;

public class TabLayoutPlatosActivity extends AppCompatActivity {
    TabLayout tablayout1;
    ViewPager viewpager1;
    ViewPagerAdaptador adaptador;

    int[]imagenes = new int []{
            R.drawable.ic_nuevos_platos,
            R.drawable.ic_lista_platos,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout_platos);

        EnlazarControles();

        tablayout1.setupWithViewPager(viewpager1);

        adaptador = new ViewPagerAdaptador(
                getSupportFragmentManager(),
                FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
        );

        adaptador.AgregarFragment(new FragmentNuevoPlato(), "Nuevo Platos");
        adaptador.AgregarFragment(new FragmentListaPlatos(), "Lista de Platos");

        viewpager1.setAdapter(adaptador);

        for(int i=0; i < tablayout1.getTabCount(); i++)
        {
            tablayout1.getTabAt(i).setIcon(imagenes[i]);
        }

    }

    void EnlazarControles(){
        tablayout1 = findViewById(R.id.TABLAYOUT_01);
        viewpager1 = findViewById(R.id.VIEWPAGER_01);
    }
}