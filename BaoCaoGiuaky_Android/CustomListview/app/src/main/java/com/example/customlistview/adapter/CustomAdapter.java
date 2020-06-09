package com.example.customlistview.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.customlistview.R;
import com.example.customlistview.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Contact> {
    private Context context;
    private  int resource;
    private ArrayList<Contact> arrContact;
    private final String TAG= getClass().getSimpleName();
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Contact> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.arrContact=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView==null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row_item_contact,parent,false);

            viewHolder = new ViewHolder();
            viewHolder.tv_color = convertView.findViewById(R.id.tv_color);
            viewHolder.tv_name = convertView.findViewById(R.id.tv_name);
            viewHolder.tv_number = convertView.findViewById(R.id.tv_number);

            convertView.setTag(viewHolder);
            Log.d(TAG,"getview:"+ (position+1));
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }


        Contact contact = arrContact.get(position);

        viewHolder.tv_color.setBackgroundColor(contact.getmColor());
        viewHolder.tv_color.setText((position+1)+"");
        viewHolder.tv_name.setText(contact.getmName());
        viewHolder.tv_number.setText(contact.getmNumber());
        return convertView;
    }
    public class ViewHolder{
        TextView tv_color;
        TextView tv_name;
        TextView tv_number;

    }
}
