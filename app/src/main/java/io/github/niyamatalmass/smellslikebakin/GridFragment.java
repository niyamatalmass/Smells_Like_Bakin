package io.github.niyamatalmass.smellslikebakin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class GridFragment  extends android.support.v4.app.Fragment {

    public interface OnRecipeSelectedInterface {
        void OnGridRecipeSelected(int index);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        OnRecipeSelectedInterface listener = (OnRecipeSelectedInterface) getActivity();

        View view = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(new GridAdapter(listener));
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float dbWidth = displayMetrics.widthPixels / displayMetrics.density;
        int numColumns = (int) (dbWidth / 2);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), numColumns));

        return view;
    }
}
