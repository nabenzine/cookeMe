package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class SearchRecipeBean extends RecipeModel{
	public static final String ALL_VALUES_STRING="[ALL]";
	public static final int ALL_VALUES_INT = 0;
	public static final int NB_PEOPLE = 2;
	public SearchRecipeBean() {
		this.setDescription(ALL_VALUES_STRING);
		this.setTitle(ALL_VALUES_STRING);
		this.setType(ALL_VALUES_STRING);
		this.setExpertise(ALL_VALUES_INT);
		this.setNbpeople(NB_PEOPLE);
		this.setDuration(ALL_VALUES_INT);
	}
}