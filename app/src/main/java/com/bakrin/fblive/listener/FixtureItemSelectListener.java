package com.bakrin.fblive.listener;

import com.bakrin.fblive.action.Actions;
import com.bakrin.fblive.model.response.FixtureItem;

public interface FixtureItemSelectListener {

    public void onFixtureSelect(int pos, FixtureItem fixtureItem, Actions actions);
}
