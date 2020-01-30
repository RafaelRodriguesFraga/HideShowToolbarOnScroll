package com.example.not.hidetoolbaronscroll;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.not.hidetoolbaronscroll.Adapter.ExampleFragmentAdapter;
import com.example.not.hidetoolbaronscroll.Fragment.ExampleFragment;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mTabLayout = (TabLayout) findViewById(R.id.tabs);
        setupViewPager(mViewPager);
        mTabLayout.setupWithViewPager(mViewPager);

        setSupportActionBar(mToolbar);
    }

    public void setupViewPager(ViewPager viewPager) {
        ExampleFragmentAdapter adapter = new ExampleFragmentAdapter(getSupportFragmentManager());
        adapter.addFragment(new ExampleFragment(), "TAB ONE");
        adapter.addFragment(new ExampleFragment(), "TAB TWO");
        adapter.addFragment(new ExampleFragment(), "TAB THREEE");
        viewPager.setAdapter(adapter);
    }
}
