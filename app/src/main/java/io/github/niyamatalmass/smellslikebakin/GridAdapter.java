package io.github.niyamatalmass.smellslikebakin;

public class GridAdapter extends RecyclerViewAdapter {
    private final GridFragment.OnRecipeSelectedInterface mListener;

    public GridAdapter(GridFragment.OnRecipeSelectedInterface listener) {
        mListener = listener;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.grid_item;
    }

    @Override
    protected void OnListRecipeSelected(int index) {
        mListener.OnGridRecipeSelected(index);
    }
}
