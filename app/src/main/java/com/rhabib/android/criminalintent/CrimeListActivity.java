package com.rhabib.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Mansur on 7/25/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
