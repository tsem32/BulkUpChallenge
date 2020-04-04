package com.tasosg.bulkupchallenge;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.Tab;
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener;

public class MainActivity extends AppCompatActivity {

  private TabLayout tabLayout;
  private ViewPager viewPager;
  private TabItem tab1,tab2,tab3;

  public PageAdapter pagerAdapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    tabLayout = findViewById(R.id.tablayout);

    tab1 = findViewById(R.id.Tab1);
    tab2 = findViewById(R.id.Tab2);

    viewPager = findViewById(R.id.viewpager);

    pagerAdapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

    viewPager.setAdapter(pagerAdapter);

    tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){

      @Override
      public void onTabSelected(Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
          pagerAdapter.notifyDataSetChanged();
      }
      @Override
      public void onTabUnselected(Tab tab) {

      }

      @Override
      public void onTabReselected(Tab tab) {

      }
    });
    viewPager.addOnPageChangeListener(new TabLayoutOnPageChangeListener(tabLayout));
  }
}
