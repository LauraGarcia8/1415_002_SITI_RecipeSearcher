package model.entity;

import java.util.ArrayList;

public class Recipe
{
	private Integer recipeId;
	private String name;
	private String description;
	private String timePrep;
	private String timeCook;
	private String timeTotal;
	private String category;
	private String rating;
	private ArrayList<Direction> directions;
	private ArrayList<Ingredient> ingredients;
	private ArrayList<Nutrient> nutrients;

	public Recipe(Integer recipeId, String name, String description, String timePrep, String timeCook, String timeTotal, String category, String rating)
	{
		this.recipeId = recipeId;
		this.name =name;
		this.description = description;
		this.timePrep =timePrep;
		this.timeCook = timeCook;
		this.timeTotal = timeTotal;
		this.category = category;
		this.rating = rating;
		
		directions = new ArrayList<Direction>();
		ingredients = new ArrayList<Ingredient>();
		nutrients = new ArrayList<Nutrient>();
	}
	
	public Integer getRecipeId()
	{
		return recipeId;
	}

	public void setRecipeId(Integer recipeId)
	{
		this.recipeId = recipeId;
	}	
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public String getTimePrep()
	{
		return timePrep;
	}
	
	public void setTimePrep(String timePrep) {
		this.timePrep = timePrep;
	}
	
	public String getTimeCook() {
		return timeCook;
	}
	
	public void setTimeCook(String timeCook)
	{
		this.timeCook = timeCook;
	}
	
	public String getTimeTotal()
	{
		return timeTotal;
	}
	
	public void setTimeTotal(String timeTotal)
	{
		this.timeTotal = timeTotal;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	public String getRating()
	{
		return rating;
	}
	
	public void setRating(String rating)
	{
		this.rating = rating;
	}
	public ArrayList<Direction> getDirections()
	{
		return directions;
	}

	public void setDirections(ArrayList<Direction> directions)
	{
		this.directions = directions;
	}

	public ArrayList<Ingredient> getIngredients()
	{
		return ingredients;
	}

	public void setIngredients(ArrayList<Ingredient> ingredients)
	{
		this.ingredients = ingredients;
	}

	public ArrayList<Nutrient> getNutrients()
	{
		return nutrients;
	}

	public void setNutrients(ArrayList<Nutrient> nutrients)
	{
		this.nutrients = nutrients;
	}
}
