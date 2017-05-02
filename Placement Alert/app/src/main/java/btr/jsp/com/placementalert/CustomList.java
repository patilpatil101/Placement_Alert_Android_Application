package btr.jsp.com.placementalert;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Asus on 20-07-2016.
 */
public class CustomList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] course_name;
    private final Integer[] imageId;

    public CustomList(Activity context,String[] course_name,Integer[] imageId)
    {
        super(context,R.layout.course_list_view,course_name);
        this.context=context;
        this.course_name=course_name;
        this.imageId=imageId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.course_list_view, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(course_name[position]);

        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}
