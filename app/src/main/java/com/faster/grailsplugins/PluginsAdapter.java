package com.faster.grailsplugins;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kevintan on 28/01/2016.
 */
public class PluginsAdapter extends RecyclerView.Adapter<PluginsAdapter.PluginsViewHolder> {


    @Override
    public PluginsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(PluginsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class PluginsViewHolder extends RecyclerView.ViewHolder {



        public PluginsViewHolder(View itemView) {
            super(itemView);
        }
    }
}
