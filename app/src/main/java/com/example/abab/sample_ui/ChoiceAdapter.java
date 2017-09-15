package com.example.abab.sample_ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ChoiceAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private List<Choice> choiceList;

    public ChoiceAdapter(Context context, List<Choice> choiceList) {
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.choiceList = choiceList;
    }

    @Override
    public int getCount() {
        return choiceList.size();
    }

    @Override
    public Object getItem(int position) {
        return choiceList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.choice, parent, false);

        ((TextView) convertView.findViewById(R.id.num)).setText(String.valueOf(position + 1));
        ((TextView) convertView.findViewById(R.id.content)).setText(choiceList.get(position).getContent());

        return convertView;
    }
}
