package com.edgardeng.appcompat;

/**
 * Created by dengxixi on 2018/8/7.
 */

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.IntDef;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.edgardeng.appcompat.adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * ActionBar Up action 的显示
 *
 */
public class RecyclerViewActivity extends AppCompatActivity  {

    private RecyclerView mRecyclerView;
    private RecyclerViewAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        Toolbar myChildToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myChildToolbar);
        ActionBar ab = getSupportActionBar();

        ab.setDisplayHomeAsUpEnabled(true); // Enable the Up button

        final List<String> items = new ArrayList<>();
        for(int i =0;i<20;i++) {
            items.add("item-" + i);
        }

// 通过findViewById拿到RecyclerView实例
        mRecyclerView = findViewById(R.id.recyclerView);
// 设置RecyclerView管理器
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
// 初始化适配器
        mAdapter = new RecyclerViewAdapter(items);
// 设置添加或删除item时的动画，这里使用默认动画
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
// 设置适配器
        mRecyclerView.setAdapter(mAdapter);

        // 设置分割线
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        mAdapter.setItemClickListener(new RecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(RecyclerViewActivity.this,"item-" + position,Toast.LENGTH_SHORT).show();
            }
        });


    }

    /**
     * divider item for recycler view
     */
    public class DividerItemDecoration extends RecyclerView.ItemDecoration {
        private int mOrientation = LinearLayoutManager.VERTICAL;
        private Drawable mDivider;

        private int[] attrs = new int[]{
                android.R.attr.listDivider
        };

        public DividerItemDecoration(Context context,  int orientation) {
            TypedArray typedArray = context.obtainStyledAttributes(attrs);
            mDivider = typedArray.getDrawable(0);
            typedArray.recycle();
            setOrientation(orientation);
        }

        private void setOrientation( int orientation) {
            if (orientation != LinearLayoutManager.VERTICAL && orientation != LinearLayoutManager.HORIZONTAL) {
                throw new IllegalArgumentException("传入的布局类型不合法");
            }
            this.mOrientation = orientation;
        }

        @Override
        public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
            //调用这个绘制方法，RecyclerView会回调该绘制方法，需要我们自己去绘制条目的间隔线
            if (mOrientation == LinearLayoutManager.VERTICAL) {
                //垂直
                drawVertical(c, parent);
            } else {
                //水平
                drawHorizontal(c, parent);
            }
        }

        private void drawVertical(Canvas c, RecyclerView parent) {
            // 画水平线
            int left = parent.getPaddingLeft();
            int right = parent.getWidth() - parent.getPaddingRight();
            int childCount = parent.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = parent.getChildAt(i);

                RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();
                int top = child.getBottom() + params.bottomMargin + Math.round(child.getTranslationY());
                int bottom = top + mDivider.getIntrinsicHeight();
                mDivider.setBounds(left, top, right, bottom);
                mDivider.draw(c);
            }
        }

        private void drawHorizontal(Canvas c, RecyclerView parent) {
            int top = parent.getPaddingTop();
            int bottom = parent.getHeight() - parent.getPaddingBottom();
            int childCount = parent.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = parent.getChildAt(i);

                RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();
                int left = child.getRight() + params.rightMargin + Math.round(ViewCompat.getTranslationX(child));
                int right = left + mDivider.getIntrinsicHeight();
                mDivider.setBounds(left, top, right, bottom);
                mDivider.draw(c);
            }
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            //获得条目的偏移量（所有的条目都会回调一次该方法）
            if (mOrientation == LinearLayoutManager.VERTICAL) {
                //垂直
                outRect.set(0, 0, 0, mDivider.getIntrinsicHeight());
            } else {
                //水平
                outRect.set(0, 0, mDivider.getIntrinsicWidth(), 0);
            }
        }

//        @IntDef({LinearLayoutManager.VERTICAL, LinearLayoutManager.HORIZONTAL})
//        public @interface OrientationType {
//
//        }

    }

    }
