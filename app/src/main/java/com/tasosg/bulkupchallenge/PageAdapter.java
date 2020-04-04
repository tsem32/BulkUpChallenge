package com.tasosg.bulkupchallenge;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter  extends FragmentPagerAdapter {

  private int numberOfTabs;

  public PageAdapter(FragmentManager fm,int numberOfTabs) {
    super(fm);
    this.numberOfTabs=numberOfTabs;
  }

  @Override
  public Fragment getItem(int position) {
    switch (position){
      case 0:return new TodayTab();
      case 1: return new StatisticsTab();
      default:return null;
    }
  }

  @Override
  public int getCount() {
    return numberOfTabs;
  }

  public int getNumberOfTabs() {
    return numberOfTabs;
  }

  public void setNumberOfTabs(int numberOfTabs) {
    this.numberOfTabs = numberOfTabs;
  }

  @Override
  public int getItemPosition(@NonNull Object object) {
    return POSITION_NONE;
  }
}
