package com.example.cisbye.nerdlauncher;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuItem;


public class NerdLauncherActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return new NerdLauncherFragment();
    }
}
