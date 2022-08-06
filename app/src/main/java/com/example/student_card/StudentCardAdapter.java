package com.example.student_card;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class StudentCardAdapter extends BaseAdapter {

    List<StudentCardModel> list;
    Context context;

    public StudentCardAdapter(List<StudentCardModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View layout= LayoutInflater.from(context).inflate(R.layout.main_layout,viewGroup,false);

        ImageView studentPicture=(ImageView) layout.findViewById(R.id.picture);
        TextView studentTC=(TextView) layout.findViewById(R.id.tc);
        TextView studentName=(TextView) layout.findViewById(R.id.name);
        TextView studentSurname=(TextView) layout.findViewById(R.id.surname);
        TextView studentFatherName=(TextView) layout.findViewById(R.id.fatherName);
        TextView studentMotherName=(TextView) layout.findViewById(R.id.motherName);
        TextView studentSchoolNumber=(TextView) layout.findViewById(R.id.schoolNumber);
        TextView studentClassBranch=(TextView) layout.findViewById(R.id.classBranch);
        TextView studentAddress=(TextView)layout.findViewById(R.id.address);
        TextView studentTel=(TextView) layout.findViewById(R.id.tel);

        studentPicture.setImageResource(list.get(i).getPictureId());
        studentTC.setText(list.get(i).getTc());
        studentName.setText(list.get(i).getName());
        studentSurname.setText(list.get(i).getSurname());
        studentFatherName.setText(list.get(i).getFatherName());
        studentMotherName.setText(list.get(i).getMotherName());
        studentSchoolNumber.setText(list.get(i).getSchoolNumber());
        studentClassBranch.setText(list.get(i).getClassBranch());
        studentAddress.setText(list.get(i).getAddress());
        studentTel.setText(list.get(i).getTel());

        return layout;
    }
}
