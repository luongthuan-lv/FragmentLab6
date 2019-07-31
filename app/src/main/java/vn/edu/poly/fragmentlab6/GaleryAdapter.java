package vn.edu.poly.fragmentlab6;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class GaleryAdapter extends FragmentStatePagerAdapter {
    public GaleryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        BlankFragment blankFragment=new BlankFragment();
        return blankFragment;
    }

    @Override
    public int getCount() {
        return 15;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return " Page "+position;
    }
}
