package io.github.niyamatalmass.smellslikebakin;

/**
 * Created by Niyamat on 4/12/2016.
 */
public class IngredientsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.ingredients[index].split("`");
    }
}
