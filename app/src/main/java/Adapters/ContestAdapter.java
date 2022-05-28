package Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ContestAdapter extends BaseAdapter {
    Context context;
    String listContest[];
    int listImages[];
    LayoutInflater inflater;

    public ContestAdapter(Context ctx, String[] contestlist, int[] images) {
        this.context = ctx;
        this.listContest = contestlist;
        this.listImages = images;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return listContest.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
