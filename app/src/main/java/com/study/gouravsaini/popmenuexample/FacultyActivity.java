package com.study.gouravsaini.popmenuexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class FacultyActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    Button btndep,btncourse,btnsem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);

        getSupportActionBar().setTitle("Faculty Search");

        btndep=findViewById(R.id.dep);
        btncourse=findViewById(R.id.course);
        btnsem=findViewById(R.id.sem);


    }
    public void department(View view) {

        PopupMenu popupMenu=new PopupMenu(this,view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.department);
        popupMenu.show();
    }


    public void course(View view) {
        PopupMenu popupMenu=new PopupMenu(this,view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.course);
        popupMenu.show();
    }

    public void sem(View view) {
        PopupMenu popupMenu=new PopupMenu(this,view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.sem);
        popupMenu.show();
    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.scse:
                Toast.makeText(this,"SCSE is selected",Toast.LENGTH_LONG).show();
                btndep.setText("SCSE");

                return true;
            case R.id.law:
                Toast.makeText(this,"LAW is selected",Toast.LENGTH_LONG).show();
                btndep.setText("LAW");
                return true;
            case R.id.business:
                Toast.makeText(this,"Business is selected",Toast.LENGTH_LONG).show();
                btndep.setText("Business");
                return true;
            case R.id.bca:
                Toast.makeText(this,"BCA is selected",Toast.LENGTH_LONG).show();
                btncourse.setText("BCA");
                return true;
            case R.id.bba:
                Toast.makeText(this,"BBA is selected",Toast.LENGTH_LONG).show();
                btncourse.setText("BBA");
                return true;
            case R.id.mba:
                Toast.makeText(this,"MBA is selected",Toast.LENGTH_LONG).show();
                btncourse.setText("MBA");
                return true;
            case R.id.mca:
                Toast.makeText(this,"MCA is selected",Toast.LENGTH_LONG).show();
                btncourse.setText("MCA");
                return true;
            case R.id.btech:
                Toast.makeText(this,"B.Tech  is selected",Toast.LENGTH_LONG).show();
                btncourse.setText("B.Tech");
                return true;
            case R.id.mtech:
                Toast.makeText(this,"M.Tech is selected",Toast.LENGTH_LONG).show();
                btncourse.setText("M.Tech");
                return true;
            case R.id.sem1:
                Toast.makeText(this,"Sem1 is selected",Toast.LENGTH_LONG).show();
                btnsem.setText("Sem1");
                return true;

            case R.id.sem2:
                Toast.makeText(this,"Sem2 is selected",Toast.LENGTH_LONG).show();
                btnsem.setText("Sem2");
                return true;
            case R.id.sem3:
                Toast.makeText(this,"Sem3 is selected",Toast.LENGTH_LONG).show();
                btnsem.setText("Sem3");
                return true;
            case R.id.sem4:
                Toast.makeText(this,"Sem4 is selected",Toast.LENGTH_LONG).show();
                btnsem.setText("Sem4");
                return true;

            case R.id.sem5:
                Toast.makeText(this,"Sem5 is selected",Toast.LENGTH_LONG).show();
                btnsem.setText("Sem5");
                return true;
            case R.id.sem6:
                Toast.makeText(this,"Sem6 is selected",Toast.LENGTH_LONG).show();
                btnsem.setText("Sem6");
                return true;
            case R.id.sem7:
                Toast.makeText(this,"Sem7 is selected",Toast.LENGTH_LONG).show();
                btnsem.setText("Sem7");
                return true;

            case R.id.sem8:
                Toast.makeText(this,"Sem8 is selected",Toast.LENGTH_LONG).show();
                btnsem.setText("Sem8");
                return true;

            default:
                return false;


        }

    }

}
