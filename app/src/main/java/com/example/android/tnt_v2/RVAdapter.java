package com.example.android.tnt_v2;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Lakshmi on 23/8/2016.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder>{

    Calendar c = Calendar.getInstance();
    final String today = c.get(Calendar.DAY_OF_MONTH)+"/" + (c.get(Calendar.MONTH)+1) +"/"+c.get(Calendar.YEAR);

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView categTV;
        TextView dateTV;
        TextView totTV;
        TextView descTV;


        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            categTV = (TextView) itemView.findViewById(R.id.txt_categ);
            dateTV = (TextView) itemView.findViewById(R.id.txt_date);
            descTV = (TextView) itemView.findViewById(R.id.txt_desc);
            totTV = (TextView) itemView.findViewById(R.id.txt_amt);

        }
    }

    List<expense> expenses;

    RVAdapter(List<expense> expenses){
        this.expenses = expenses;
    }

    @Override
    public int getItemCount() {
        return expenses.size();
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.descTV.setText(expenses.get(i).d);
        personViewHolder.descTV.setTag(Integer.toString(expenses.get(i).id));
        personViewHolder.descTV.setOnLongClickListener(new longClick());

        personViewHolder.categTV.setText(expenses.get(i).c);
        personViewHolder.categTV.setTag(Integer.toString(expenses.get(i).id));
        personViewHolder.categTV.setOnLongClickListener(new longClick());

        personViewHolder.totTV.setText(expenses.get(i).t);
        personViewHolder.totTV.setTag(Integer.toString(expenses.get(i).id));
        personViewHolder.totTV.setOnLongClickListener(new longClick());

        personViewHolder.dateTV.setText(expenses.get(i).date);
        personViewHolder.dateTV.setTag(Integer.toString(expenses.get(i).id));
        personViewHolder.dateTV.setOnLongClickListener(new longClick());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
