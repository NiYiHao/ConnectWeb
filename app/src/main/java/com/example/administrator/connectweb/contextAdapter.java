package com.example.administrator.connectweb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class contextAdapter extends BaseAdapter{
    private LayoutInflater inflater;
    private List<context> contextList;

    public contextAdapter(Context c, List<context> contextList) {
        inflater = (LayoutInflater)c.getSystemService( c.LAYOUT_INFLATER_SERVICE ) ;
        this.contextList = contextList;
    }

    @Override
    public int getCount() {
        return contextList.size(  );
    }

    @Override
    public Object getItem(int position) {
        return contextList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return contextList.indexOf( getItem( position ) );
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        contextList = (List) getItem( position );
        context data =(context) getItem( position );
        convertView = inflater.inflate( R.layout.item_view , null );
        ImageView imageView =convertView.findViewById( R.id.imageView );
        TextView textname  =convertView.findViewById( R.id.textname );
        TextView textphome  =convertView.findViewById( R.id.textphome );
        TextView textmail  =convertView.findViewById( R.id.textmail );
        TextView textbirth  =convertView.findViewById( R.id.textbirth );
        imageView.setImageBitmap( data.getImageView() );
        textname.setText( data.getEditname() );
        textphome.setText( data.getEditphome() );
        textmail.setText( data.getEditemail() );
        textbirth.setText( data.getEditbirth() );
        return convertView;
    }
}
