package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.kt.apps.media.xemtv.beta.R;
import e3.AbstractC1076a;
import e3.AbstractC1084i;
import y1.C2354b;

/* loaded from: classes.dex */
public final class i extends C2354b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15315e;

    public /* synthetic */ i(Object obj, int i7) {
        this.f15314d = i7;
        this.f15315e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r0.c() > 1) goto L14;
     */
    @Override // y1.C2354b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z8;
        AbstractC1076a abstractC1076a;
        switch (this.f15314d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName(AbstractC1084i.class.getName());
                AbstractC1084i abstractC1084i = (AbstractC1084i) this.f15315e;
                AbstractC1076a abstractC1076a2 = abstractC1084i.f16759e;
                if (abstractC1076a2 != null) {
                    z8 = true;
                    break;
                }
                z8 = false;
                accessibilityEvent.setScrollable(z8);
                if (accessibilityEvent.getEventType() != 4096 || (abstractC1076a = abstractC1084i.f16759e) == null) {
                    return;
                }
                accessibilityEvent.setItemCount(abstractC1076a.c());
                accessibilityEvent.setFromIndex(abstractC1084i.f16761f);
                accessibilityEvent.setToIndex(abstractC1084i.f16761f);
                return;
            case 4:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f15315e).f15403d);
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // y1.C2354b
    public final void d(View view, z1.e eVar) {
        int i7 = -1;
        boolean z8 = false;
        Object obj = this.f15315e;
        View.AccessibilityDelegate accessibilityDelegate = this.f26680a;
        switch (this.f15314d) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, eVar.f28173a);
                l lVar = (l) obj;
                eVar.l(lVar.f15331x0.getVisibility() == 0 ? lVar.G(R.string.mtrl_picker_toggle_to_year_selection) : lVar.G(R.string.mtrl_picker_toggle_to_day_selection));
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, eVar.f28173a);
                eVar.i(AbstractC1084i.class.getName());
                AbstractC1084i abstractC1084i = (AbstractC1084i) obj;
                AbstractC1076a abstractC1076a = abstractC1084i.f16759e;
                if (abstractC1076a != null && abstractC1076a.c() > 1) {
                    z8 = true;
                }
                eVar.m(z8);
                if (abstractC1084i.canScrollHorizontally(1)) {
                    eVar.a(4096);
                }
                if (abstractC1084i.canScrollHorizontally(-1)) {
                    eVar.a(8192);
                    return;
                }
                return;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo = eVar.f28173a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (!((i6.h) obj).f18456x) {
                    accessibilityNodeInfo.setDismissable(false);
                    return;
                } else {
                    eVar.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                    return;
                }
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, eVar.f28173a);
                int i10 = MaterialButtonToggleGroup.f15250y;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                if (view instanceof MaterialButton) {
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        if (i11 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i11) == view) {
                                i7 = i12;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i11) instanceof MaterialButton) && materialButtonToggleGroup.c(i11)) {
                                    i12++;
                                }
                                i11++;
                            }
                        }
                    }
                }
                eVar.k(o7.o.m(((MaterialButton) view).f15238C, 0, 1, i7, 1));
                return;
            case 4:
                AccessibilityNodeInfo accessibilityNodeInfo2 = eVar.f28173a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f15404e);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f15403d);
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = eVar.f28173a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).L);
                return;
        }
    }

    @Override // y1.C2354b
    public boolean g(View view, int i7, Bundle bundle) {
        switch (this.f15314d) {
            case 1:
                if (super.g(view, i7, bundle)) {
                    return true;
                }
                AbstractC1084i abstractC1084i = (AbstractC1084i) this.f15315e;
                if (i7 != 4096) {
                    if (i7 == 8192 && abstractC1084i.canScrollHorizontally(-1)) {
                        abstractC1084i.setCurrentItem(abstractC1084i.f16761f - 1);
                        return true;
                    }
                } else if (abstractC1084i.canScrollHorizontally(1)) {
                    abstractC1084i.setCurrentItem(abstractC1084i.f16761f + 1);
                    return true;
                }
                return false;
            case 2:
                if (i7 == 1048576) {
                    i6.h hVar = (i6.h) this.f15315e;
                    if (hVar.f18456x) {
                        hVar.cancel();
                        return true;
                    }
                }
                return super.g(view, i7, bundle);
            default:
                return super.g(view, i7, bundle);
        }
    }
}
