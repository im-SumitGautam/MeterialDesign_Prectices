package com.bongo.meterialdesign_prectices;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bongo.meterialdesign_prectices.Adapter.GridViewAdapter;
import com.bongo.meterialdesign_prectices.Model.HomeItems;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ArrayList<HomeItems> list = new ArrayList<>();
    CardView addIncome, addExpense, addCategory, report, balance, calender;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.home_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Track");

        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.baseline_keyboard_backspace_24));

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.settings) {
                    Toast.makeText(HomeActivity.this, "settings", Toast.LENGTH_SHORT).show();
                } else if (item.getItemId() == R.id.logout) {
                    Toast.makeText(HomeActivity.this, "logout", Toast.LENGTH_SHORT).show();
                } else {
                    // do something
                }

                return false;
            }
        });

        addIncome = findViewById(R.id.layout_add_income);
        addExpense = findViewById(R.id.layout_add_expense);
        addCategory = findViewById(R.id.layout_add_category);
        report = findViewById(R.id.layout_report);
        balance = findViewById(R.id.layout_balance);
        calender = findViewById(R.id.layout_default_month);

        addIncome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this,AddIncome.class);
                startActivity(intent,ActivityOptions.makeSceneTransitionAnimation(HomeActivity.this).toBundle());
            }
        });

        addExpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this,AddExpense.class);
                startActivity(intent,ActivityOptions.makeSceneTransitionAnimation(HomeActivity.this).toBundle());
            }
        });

        addCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this,AddCategory.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(HomeActivity.this).toBundle());
            }
        });

        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this,ReportGraph.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(HomeActivity.this).toBundle());
            }
        });

        balance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this,BalanceActivity.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(HomeActivity.this).toBundle());
            }
        });

        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this,CalenderActivity.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(HomeActivity.this).toBundle());
            }
        });


//
//        //GridView
//        GridView simpleList = (GridView) findViewById(R.id.gridView);
//        list.add(new HomeItems("Add Income",R.drawable.addincome));
//        list.add(new HomeItems("Add Expense",R.drawable.addexpenditure));
//        list.add(new HomeItems("Add Category",R.drawable.addcategory));
//        list.add(new HomeItems("Reports",R.drawable.reports));
//        list.add(new HomeItems("Balance",R.drawable.rupees));
//        list.add(new HomeItems("Default Month",R.drawable.calendarr));
//        GridViewAdapter myAdapter=new GridViewAdapter(this,list);
//        simpleList.setAdapter(myAdapter);
//
//        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                ;
//
//                switch (position) {
//                    case 0:
//
//                        break;
//                    case 1:
//
//                        break;
//                    case 2:
//
//                        break;
//                    case 3:
//
//                        break;
//                    case 4:
//
//                        break;
//                    case 5:
//
//                        break;
//
//                }
//            }
//        });
//

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu_toolbar, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }



}