package com.example.student_card;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<StudentCardModel> studentList;
    StudentCardAdapter adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        define();
        fillList();

    }

    private void define() {
        listView=(ListView) findViewById(R.id.listview);
    }

    private void fillList() {
        studentList=new ArrayList<>();

        StudentCardModel card1=new StudentCardModel(R.drawable.student1,"12345678910","Ayşe","Beautiful","xy","xx","001","class 9/A","Karataş","01234567891");
        StudentCardModel card2=new StudentCardModel(R.drawable.student2,"12345678910","Sevgi","Beautiful","xy","xx","002","class 9/B","Akkent","12345678910");
        StudentCardModel card3=new StudentCardModel(R.drawable.student3,"12345678910","Animal","Squirrel","xy","xx","003","class 9/C","Yeditepe","23456789101");
        StudentCardModel card4=new StudentCardModel(R.drawable.student4,"12345678910","Animal","Sheep","xy","xx","004","class 9/D","Bülbülzade","34567891011");

        studentList.add(card1);
        studentList.add(card2);
        studentList.add(card3);
        studentList.add(card4);

        adp=new StudentCardAdapter(studentList,this);


        listView.setAdapter(adp);

    }


}