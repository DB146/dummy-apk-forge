package com.kt.apps.core.utils.leanback;

import B6.j;
import B6.o;
import android.view.View;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class ViewUtilsKt {
    public static final int findCurrentFocusedPosition(o oVar) {
        l.e(oVar, "<this>");
        int tabCount = oVar.getTabCount();
        for (int i7 = 0; i7 < tabCount; i7++) {
            j g = oVar.g(i7);
            l.b(g);
            if (g.g.isFocused()) {
                return i7;
            }
        }
        return -1;
    }

    public static final View findCurrentFocusedView(o oVar) {
        j g;
        l.e(oVar, "<this>");
        int findCurrentFocusedPosition = findCurrentFocusedPosition(oVar);
        if (findCurrentFocusedPosition < 0 || (g = oVar.g(findCurrentFocusedPosition)) == null) {
            return null;
        }
        return g.g;
    }

    public static final int findCurrentSelectedPosition(o oVar) {
        l.e(oVar, "<this>");
        int tabCount = oVar.getTabCount();
        for (int i7 = 0; i7 < tabCount; i7++) {
            j g = oVar.g(i7);
            l.b(g);
            if (g.g.isSelected()) {
                return i7;
            }
        }
        return -1;
    }

    public static final View findCurrentSelectedTabView(o oVar) {
        j g;
        l.e(oVar, "<this>");
        int findCurrentSelectedPosition = findCurrentSelectedPosition(oVar);
        if (findCurrentSelectedPosition < 0 || (g = oVar.g(findCurrentSelectedPosition)) == null) {
            return null;
        }
        return g.g;
    }
}
