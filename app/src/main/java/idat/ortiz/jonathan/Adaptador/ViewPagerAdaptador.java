package idat.ortiz.jonathan.Adaptador;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdaptador extends FragmentPagerAdapter {
    ArrayList<Fragment> lista_fragments = new ArrayList<Fragment>();
    ArrayList<String> lista_titulos = new ArrayList<String>();

    public ViewPagerAdaptador(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return lista_fragments.get(position);
    }

    @Override
    public int getCount() {
        return lista_fragments.size();
    }

    // definir un void del sistema getPageTittle
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return lista_titulos.get(position);
    }

    // metodo public void para agregar los fragmentos y los
    // titulos
    public void AgregarFragment(Fragment fragmento, String titulo)
    {
        lista_fragments.add(fragmento);
        lista_titulos.add(titulo);
    }
}
