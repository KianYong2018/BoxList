package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by 16038975 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{
    Context parent_context;
    int layout_id;
    ArrayList<Color> colors;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Color> object){
        super(context,resource,object);
        parent_context = context;
        layout_id = resource;
        colors = object;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        //Obtain the LayoutInflater object.
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id,parent,false);

        //Obtain the UI elements and bind them to their respective Java variable
        ImageView imageView = rowView.findViewById(R.id.imageView);

        //Obtain the property values from the Data Class object
        // and set them to the corresponding UI elements.
        Color currentItem = colors.get(position);
        if(currentItem.getImageView() == 0){
            imageView.setImageResource(R.drawable.blue_box);
        }else if(currentItem.getImageView() == 1){
            imageView.setImageResource(R.drawable.orange_box);
        }
        else{
            imageView.setImageResource(R.drawable.brown_box);
        }
        return rowView;
    }
}