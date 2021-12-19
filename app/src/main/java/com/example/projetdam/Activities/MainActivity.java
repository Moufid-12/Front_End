package com.example.projetdam.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.projetdam.Fragment.AccountFragment;
import com.example.projetdam.Fragment.CommandeFragment;
import com.example.projetdam.Fragment.HomeFragment;
import com.example.projetdam.Fragment.PanierFragment;
import com.example.projetdam.R;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity{

    private BottomNavigationView bottomNavigationView;
    private FrameLayout mMainFrame;

    private HomeFragment homeFragment;
    private CommandeFragment commandeFragment;
    private PanierFragment panierFragment;
    private AccountFragment accountFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bottomNavigationView=findViewById(R.id.botton_navigation);

        mMainFrame=findViewById(R.id.container_frame_layout);

         homeFragment=new HomeFragment();
         commandeFragment=new CommandeFragment();
         panierFragment=new PanierFragment();
         accountFragment=new AccountFragment();
         getSupportFragmentManager().beginTransaction().replace(R.id.container_frame_layout,homeFragment).commit();
        bottomNavigationView.setOnItemSelectedListener(naListener);
//        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()){
//                    case R.id.navigation_home:
//                        setFragment(homeFragment);
//                        return true;
//                    case R.id.navigation_commande:
//                        setFragment(commandeFragment);
//                        return true;
//                    case R.id.navigation_panier:
//                        setFragment(panierFragment);
//                        return true;
//
//                    case R.id.navigation_account:
//                        setFragment(accountFragment);
//                        return true;
//                    default:
//                        return false;
//                }
//            }
//        });

   }

//   public void setFragment(Fragment fragment){
//        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.container_frame_layout,fragment);
//        fragmentTransaction.commit();
//   }
   private BottomNavigationView.OnItemSelectedListener naListener=new BottomNavigationView.OnItemSelectedListener() {
       @Override
       public boolean onNavigationItemSelected(@NonNull MenuItem item) {
           Fragment fragment=null;
           switch (item.getItemId()){
                    case R.id.navigation_home:
                        fragment=homeFragment;
                        break;
                    case R.id.navigation_commande:
                        fragment=commandeFragment;
                        break;
                    case R.id.navigation_panier:
                        fragment=panierFragment;
                        break;

                    case R.id.navigation_account:
                        fragment=accountFragment;
                       break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.container_frame_layout,fragment).commit();
           return true;
       }
   };

}