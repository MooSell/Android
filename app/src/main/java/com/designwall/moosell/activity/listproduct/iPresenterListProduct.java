package com.designwall.moosell.activity.listproduct;

/**
 * Created by phams on 3/15/2017.
 */

public interface iPresenterListProduct {
    void saveReceivedCategory(String categoryName, int categoryCount);

    void loadPage(int pagePos);

    void refreshData();

    void loadNextPage();
}
