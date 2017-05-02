package btr.jsp.com.placementalert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class upcoming_companies_activity extends AppCompatActivity {
    ListView upcoming_comapnies;
    ArrayList<String> list=new ArrayList<>();
  //  ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcompanies_activity);
        upcoming_comapnies=(ListView)findViewById(R.id.listView_upcoming_companies);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list) ;

        list.add("CDAC R&D");
        list.add("Tech Mahindra");
        list.add("Nokia");
        list.add("Cap gemini");
        list.add("Larsen & Turbo");
        list.add("Happesit Mind");
        list.add("HCL Technologies");
        list.add("Chain Analytics");
        list.add("Earnest and Young");
        list.add("Soft Way");
        list.add("WABCO");
        list.add("Xebia");
        list.add("Sigmond");
        list.add("Cisco");
        list.add("ESKO Graphics");
        upcoming_comapnies.setAdapter(arrayAdapter);
    }

}
