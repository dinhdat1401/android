package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;

import com.example.customlistview.adapter.CustomAdapter;
import com.example.customlistview.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // lv_contact xml
    private ListView lv_contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // khai bao lv_contact ket noi lv_contact bên xml
        lv_contact = findViewById(R.id.lv_contact);

        ArrayList<Contact> arrayList = new ArrayList<>();
        Contact contact1 = new Contact(Color.BLUE,"Nguyen Phuoc Dinh Dat","0901 463 191");
        Contact contact2 = new Contact(Color.CYAN,"Le Quoc Huy","0901 888 252");
        Contact contact3 = new Contact(Color.YELLOW,"Lam Tuan Thanh","0901 090 958");
        Contact contact4 = new Contact(Color.BLACK,"Le Van Khanh","0904 090 999");
        Contact contact5 = new Contact(Color.RED,"Nguyen Phuoc Dinh Dat","0901 234 567");
        Contact contact6 = new Contact(Color.GREEN,"Lam Canh Tan","0901 123 456");
        Contact contact7 = new Contact(Color.YELLOW,"Tran Van Cuong ","0901 525 525");
        Contact contact8 = new Contact(Color.BLUE,"Nguyen Huy Nam","0901 358 358");
        arrayList.add(contact1);
        arrayList.add(contact2);
        arrayList.add(contact3);
        arrayList.add(contact4);
        arrayList.add(contact5);
        arrayList.add(contact6);
        arrayList.add(contact7);
        arrayList.add(contact8);
        //khai bao adapter
        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.row_item_contact,arrayList);

        /// gan adapter vao lv_contact
        lv_contact.setAdapter(customAdapter);
    }
}
