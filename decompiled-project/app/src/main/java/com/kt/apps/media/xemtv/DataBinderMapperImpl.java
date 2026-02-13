package com.kt.apps.media.xemtv;

import J1.c;
import J1.d;
import J1.k;
import J9.a;
import J9.b;
import J9.i;
import P1.g;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.material.button.MaterialButton;
import com.kt.apps.core.base.leanback.BrowseFrameLayout;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.List;
import pa.AbstractC1863a;
import pa.AbstractC1866d;
import pa.C1864b;
import pa.C1865c;
import pa.e;
import pa.f;
import pa.h;
import pa.j;
import pa.l;
import pa.m;
import pa.n;
import pa.o;
import pa.p;
import pa.q;
import pa.r;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f16194a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(18);
        f16194a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_details, 1);
        sparseIntArray.put(R.layout.activity_dialog, 2);
        sparseIntArray.put(R.layout.activity_main, 3);
        sparseIntArray.put(R.layout.activity_playback, 4);
        sparseIntArray.put(R.layout.activity_settings, 5);
        sparseIntArray.put(R.layout.activity_tv_search, 6);
        sparseIntArray.put(R.layout.fragment_add_extensions, 7);
        sparseIntArray.put(R.layout.fragment_custom_number, 8);
        sparseIntArray.put(R.layout.fragment_extensions_dashboard, 9);
        sparseIntArray.put(R.layout.fragment_extensions_dashboard_empty_sence, 10);
        sparseIntArray.put(R.layout.fragment_football, 11);
        sparseIntArray.put(R.layout.fragment_info, 12);
        sparseIntArray.put(R.layout.fragment_tv_dashboard_new, 13);
        sparseIntArray.put(R.layout.fragment_tv_grid, 14);
        sparseIntArray.put(R.layout.item_channel_overlay, 15);
        sparseIntArray.put(R.layout.item_football_presenter, 16);
        sparseIntArray.put(R.layout.item_menu_channel, 17);
        sparseIntArray.put(R.layout.tv_channel_grid_view_overlay, 18);
    }

    @Override // J1.c
    public final List a() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.kt.apps.autoupdate.DataBinderMapperImpl());
        arrayList.add(new com.kt.apps.core.DataBinderMapperImpl());
        arrayList.add(new com.kt.apps.voiceselector.DataBinderMapperImpl());
        arrayList.add(new com.kt.skeleton.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [pa.a, pa.b, J1.k] */
    /* JADX WARN: Type inference failed for: r0v30, types: [pa.c, J1.k, J9.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [J1.k, java.lang.Object, pa.f, pa.g] */
    /* JADX WARN: Type inference failed for: r0v46, types: [J1.k, java.lang.Object, pa.f, pa.h] */
    /* JADX WARN: Type inference failed for: r0v62, types: [J1.k, pa.l] */
    /* JADX WARN: Type inference failed for: r0v66, types: [pa.m, pa.n, J1.k] */
    /* JADX WARN: Type inference failed for: r0v70, types: [J1.k, pa.o] */
    /* JADX WARN: Type inference failed for: r0v74, types: [J1.k, pa.p] */
    /* JADX WARN: Type inference failed for: r0v78, types: [pa.q, J1.k] */
    /* JADX WARN: Type inference failed for: r0v82, types: [pa.r, J1.k, J9.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v76, types: [J1.k, pa.i, pa.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [pa.d, J1.k, java.lang.Object, pa.e] */
    @Override // J1.c
    public final k b(View view, int i7) {
        int i10 = f16194a.get(i7);
        if (i10 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            d dVar = null;
            switch (i10) {
                case 1:
                    if (!"layout/activity_details_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for activity_details is invalid. Received: "));
                    }
                    a aVar = new a(dVar, view, (FrameLayout) k.h(view, 1, null, null)[0], 1);
                    aVar.f5742E = -1L;
                    ((FrameLayout) aVar.f5741D).setTag(null);
                    view.setTag(R.id.dataBinding, aVar);
                    aVar.f();
                    return aVar;
                case 2:
                    if (!"layout/activity_dialog_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for activity_dialog is invalid. Received: "));
                    }
                    a aVar2 = new a(dVar, view, (FrameLayout) k.h(view, 1, null, null)[0], 2);
                    aVar2.f5742E = -1L;
                    ((FrameLayout) aVar2.f5741D).setTag(null);
                    view.setTag(R.id.dataBinding, aVar2);
                    aVar2.f();
                    return aVar2;
                case 3:
                    if (!"layout/activity_main_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for activity_main is invalid. Received: "));
                    }
                    Object[] h10 = k.h(view, 3, C1864b.f23222E, C1864b.f23223F);
                    b bVar = (b) h10[1];
                    ?? abstractC1863a = new AbstractC1863a(null, view, bVar);
                    abstractC1863a.f23224D = -1L;
                    b bVar2 = abstractC1863a.f23221C;
                    if (bVar2 != null) {
                        bVar2.f5439x = abstractC1863a;
                    }
                    ((FrameLayout) h10[0]).setTag(null);
                    abstractC1863a.k(view);
                    abstractC1863a.f();
                    return abstractC1863a;
                case 4:
                    if (!"layout/activity_playback_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for activity_playback is invalid. Received: "));
                    }
                    a aVar3 = new a(dVar, view, (FrameLayout) k.h(view, 1, null, null)[0], 3);
                    aVar3.f5742E = -1L;
                    ((FrameLayout) aVar3.f5741D).setTag(null);
                    view.setTag(R.id.dataBinding, aVar3);
                    aVar3.f();
                    return aVar3;
                case 5:
                    if (!"layout/activity_settings_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for activity_settings is invalid. Received: "));
                    }
                    a aVar4 = new a(dVar, view, (FrameLayout) k.h(view, 1, null, null)[0], 4);
                    aVar4.f5742E = -1L;
                    ((FrameLayout) aVar4.f5741D).setTag(null);
                    view.setTag(R.id.dataBinding, aVar4);
                    aVar4.f();
                    return aVar4;
                case 6:
                    if (!"layout/activity_tv_search_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for activity_tv_search is invalid. Received: "));
                    }
                    a aVar5 = new a(dVar, view, (FrameLayout) k.h(view, 1, null, null)[0], 5);
                    aVar5.f5742E = -1L;
                    ((FrameLayout) aVar5.f5741D).setTag(null);
                    view.setTag(R.id.dataBinding, aVar5);
                    aVar5.f();
                    return aVar5;
                case 7:
                    if (!"layout/fragment_add_extensions_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for fragment_add_extensions is invalid. Received: "));
                    }
                    Object[] h11 = k.h(view, 11, null, C1865c.f23225E);
                    BrowseFrameLayout browseFrameLayout = (BrowseFrameLayout) h11[0];
                    ?? iVar = new i(dVar, view, browseFrameLayout);
                    iVar.f23226D = -1L;
                    ((BrowseFrameLayout) iVar.f5763C).setTag(null);
                    view.setTag(R.id.dataBinding, iVar);
                    iVar.f();
                    return iVar;
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    if (!"layout/fragment_custom_number_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for fragment_custom_number is invalid. Received: "));
                    }
                    Object[] h12 = k.h(view, 5, null, e.f23232I);
                    ?? abstractC1866d = new AbstractC1866d(null, view, (MaterialButton) h12[2], (MaterialButton) h12[3], (MaterialButton) h12[4], (BrowseFrameLayout) h12[0], (TextView) h12[1]);
                    abstractC1866d.f23233H = -1L;
                    abstractC1866d.f23230F.setTag(null);
                    view.setTag(R.id.dataBinding, abstractC1866d);
                    abstractC1866d.f();
                    return abstractC1866d;
                case 9:
                    if (!"layout/fragment_extensions_dashboard_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for fragment_extensions_dashboard is invalid. Received: "));
                    }
                    Object[] h13 = k.h(view, 6, null, pa.g.f23235E);
                    ConstraintLayout constraintLayout = (ConstraintLayout) h13[0];
                    ?? fVar = new f(dVar, view, constraintLayout);
                    fVar.f23236D = -1L;
                    fVar.f23234C.setTag(null);
                    view.setTag(R.id.dataBinding, fVar);
                    fVar.f();
                    return fVar;
                case 10:
                    if (!"layout/fragment_extensions_dashboard_empty_sence_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for fragment_extensions_dashboard_empty_sence is invalid. Received: "));
                    }
                    Object[] h14 = k.h(view, 6, null, h.f23237E);
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) h14[0];
                    ?? fVar2 = new f(dVar, view, constraintLayout2);
                    fVar2.f23238D = -1L;
                    fVar2.f23234C.setTag(null);
                    view.setTag(R.id.dataBinding, fVar2);
                    fVar2.f();
                    return fVar2;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    if (!"layout/fragment_football_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for fragment_football is invalid. Received: "));
                    }
                    a aVar6 = new a(dVar, view, (FrameLayout) k.h(view, 1, null, null)[0], 6);
                    aVar6.f5742E = -1L;
                    ((FrameLayout) aVar6.f5741D).setTag(null);
                    view.setTag(R.id.dataBinding, aVar6);
                    aVar6.f();
                    return aVar6;
                case 12:
                    if (!"layout/fragment_info_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for fragment_info is invalid. Received: "));
                    }
                    Object[] h15 = k.h(view, 7, null, j.f23246K);
                    ?? iVar2 = new pa.i(null, view, (MaterialButton) h15[2], (MaterialButton) h15[3], (BrowseFrameLayout) h15[0], (TextView) h15[5], (TextView) h15[4], (TextView) h15[1], (TextView) h15[6]);
                    iVar2.f23247J = -1L;
                    iVar2.f23241E.setTag(null);
                    view.setTag(R.id.dataBinding, iVar2);
                    iVar2.f();
                    return iVar2;
                case 13:
                    if (!"layout/fragment_tv_dashboard_new_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for fragment_tv_dashboard_new is invalid. Received: "));
                    }
                    Object[] h16 = k.h(view, 4, null, l.f23248D);
                    ?? kVar = new k(null, view, 0);
                    kVar.f23249C = -1L;
                    ((ConstraintLayout) h16[0]).setTag(null);
                    kVar.k(view);
                    kVar.f();
                    return kVar;
                case 14:
                    if (!"layout/fragment_tv_grid_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for fragment_tv_grid is invalid. Received: "));
                    }
                    Object[] h17 = k.h(view, 3, null, n.f23251E);
                    ?? mVar = new m(null, view, (TextView) h17[1]);
                    mVar.f23252D = -1L;
                    ((LinearLayout) h17[0]).setTag(null);
                    mVar.k(view);
                    mVar.f();
                    return mVar;
                case 15:
                    if (!"layout/item_channel_overlay_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for item_channel_overlay is invalid. Received: "));
                    }
                    Object[] h18 = k.h(view, 3, null, o.f23253D);
                    ?? kVar2 = new k(null, view, 0);
                    kVar2.f23254C = -1L;
                    ((FrameLayout) h18[0]).setTag(null);
                    kVar2.k(view);
                    kVar2.f();
                    return kVar2;
                case 16:
                    if (!"layout/item_football_presenter_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for item_football_presenter is invalid. Received: "));
                    }
                    Object[] h19 = k.h(view, 7, null, p.f23255D);
                    ?? kVar3 = new k(null, view, 0);
                    kVar3.f23256C = -1L;
                    ((LinearLayout) h19[0]).setTag(null);
                    kVar3.k(view);
                    kVar3.f();
                    return kVar3;
                case 17:
                    if (!"layout/item_menu_channel_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for item_menu_channel is invalid. Received: "));
                    }
                    Object[] h20 = k.h(view, 3, null, q.f23257D);
                    ?? kVar4 = new k(null, view, 0);
                    kVar4.f23258C = -1L;
                    ((CardView) h20[0]).setTag(null);
                    kVar4.k(view);
                    kVar4.f();
                    return kVar4;
                case 18:
                    if (!"layout/tv_channel_grid_view_overlay_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for tv_channel_grid_view_overlay is invalid. Received: "));
                    }
                    Object[] h21 = k.h(view, 2, null, r.f23259E);
                    FrameLayout frameLayout = (FrameLayout) h21[0];
                    ?? iVar3 = new i(dVar, view, frameLayout);
                    iVar3.f23260D = -1L;
                    iVar3.f5763C.setTag(null);
                    view.setTag(R.id.dataBinding, iVar3);
                    iVar3.f();
                    return iVar3;
            }
        }
        return null;
    }

    @Override // J1.c
    public final k c(View[] viewArr, int i7) {
        if (viewArr.length != 0 && f16194a.get(i7) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // J1.c
    public final int d(String str) {
        Integer num;
        if (str == null || (num = (Integer) oa.m.f22201a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
