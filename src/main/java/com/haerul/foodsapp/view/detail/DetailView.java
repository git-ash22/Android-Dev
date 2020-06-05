/*-----------------------------------------------------------------------------
 -                                                 -
 - Last modified 4/7/19 5:49 PM                                               -
 -                             -
 -                                       -
 -----------------------------------------------------------------------------*/
package com.haerul.foodsapp.view.detail;

import com.haerul.foodsapp.model.Meals;

public interface DetailView {
     void showLoading();
     void hideLoading();
     void setMeal(Meals.Meal meal);
     void onErrorLoading(String message);
}
