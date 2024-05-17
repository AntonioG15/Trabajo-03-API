package com.l20290998.mycountryappzero;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.l20290998.mycountryappzero.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding viewBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Definir la vista a traves del objeto de enlace con la vista
        viewBinding = ActivityMainBinding.inflate( getLayoutInflater() );

        setContentView(viewBinding.getRoot());


        //Enlazar los elementos
        BottomNavigationView navView = viewBinding.mainBnvNavView;

        //Pasar los IDs a un configurador de barras para habilitar la navegacion
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.mainNavMiContinente,
                R.id.mainNavMiBuscar,
                R.id.mainNavMiPerfil
        ).build();

        //Crear un controlador para vincular la navegacion con un elemento(host)
        NavController navController = Navigation.findNavController(this, R.id.mainFragmentNavHost);

        //Enlazar los controles para que la interfaz cambie de vista conforme se seleccionan los iconos
            NavigationUI.setupActionBarWithNavController(this,navController,appBarConfiguration);
            NavigationUI.setupWithNavController(navView,navController);
    }
}