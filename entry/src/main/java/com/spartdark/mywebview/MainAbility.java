package com.spartdark.mywebview;

import com.spartdark.mywebview.slice.MainAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.agp.components.webengine.WebView;

public class MainAbility extends Ability {



    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());

    }
}
