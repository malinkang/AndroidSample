package com.malinkang.viewpager;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.malinkang.infiniteloopviewpager.InfiniteLoopPagerAdapter;
import com.malinkang.infiniteloopviewpager.InfiniteLoopViewPager;
import com.malinkang.viewpager.Adapter.InnerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends FragmentActivity {


    private final String TAG=MainActivity.class.getSimpleName();

    @BindView(R.id.viewpager) InfiniteLoopViewPager mViewpager;

    private String[] letters={"A","B","C","D","E"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        ButterKnife.bind(this);
        InnerAdapter adapter=new InnerAdapter(getSupportFragmentManager(),letters);
        mViewpager.setAdapter(new InfiniteLoopPagerAdapter(adapter));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
