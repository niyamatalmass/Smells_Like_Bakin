package io.github.niyamatalmass.smellslikebakin;

/**
 * Created by Niyamat on 4/12/2016.
 */
public class DirectionsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.directions[index].split("`");
    }
}
