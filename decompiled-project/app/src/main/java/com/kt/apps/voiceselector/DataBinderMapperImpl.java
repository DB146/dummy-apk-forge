package com.kt.apps.voiceselector;

import J1.c;
import J1.k;
import Ma.b;
import Ma.d;
import Ma.e;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f16249a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        f16249a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_voice_search, 1);
        sparseIntArray.put(R.layout.fragment_gg_voice_selector, 2);
        sparseIntArray.put(R.layout.fragment_voice_selector_dialog, 3);
    }

    @Override // J1.c
    public final List a() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.kt.apps.core.DataBinderMapperImpl());
        arrayList.add(new com.kt.skeleton.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Ma.a, J1.k] */
    /* JADX WARN: Type inference failed for: r13v0, types: [J1.k, Ma.b, Ma.c] */
    /* JADX WARN: Type inference failed for: r6v3, types: [J1.k, Ma.d, Ma.e] */
    @Override // J1.c
    public final k b(View view, int i7) {
        int i10 = f16249a.get(i7);
        if (i10 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i10 == 1) {
                if (!"layout/activity_voice_search_0".equals(tag)) {
                    throw new IllegalArgumentException(X.c.g(tag, "The tag for activity_voice_search is invalid. Received: "));
                }
                Object[] h10 = k.h(view, 1, null, null);
                ?? kVar = new k(null, view, 0);
                kVar.f6921C = -1L;
                ((ConstraintLayout) h10[0]).setTag(null);
                kVar.k(view);
                kVar.f();
                return kVar;
            }
            if (i10 == 2) {
                if (!"layout/fragment_gg_voice_selector_0".equals(tag)) {
                    throw new IllegalArgumentException(X.c.g(tag, "The tag for fragment_gg_voice_selector is invalid. Received: "));
                }
                Object[] h11 = k.h(view, 6, null, Ma.c.f6927I);
                ?? bVar = new b(null, view, (AppCompatButton) h11[2], (AppItemView) h11[1], (AppCompatButton) h11[5], (AppCompatButton) h11[3], (AppItemView) h11[4]);
                bVar.f6928H = -1L;
                ((ScrollView) h11[0]).setTag(null);
                bVar.k(view);
                bVar.f();
                return bVar;
            }
            if (i10 == 3) {
                if (!"layout/fragment_voice_selector_dialog_0".equals(tag)) {
                    throw new IllegalArgumentException(X.c.g(tag, "The tag for fragment_voice_selector_dialog is invalid. Received: "));
                }
                Object[] h12 = k.h(view, 4, null, e.f6932G);
                ?? dVar = new d(null, view, (AppItemView) h12[3], (Button) h12[2], (AppItemView) h12[1]);
                dVar.f6933F = -1L;
                ((LinearLayout) h12[0]).setTag(null);
                dVar.k(view);
                dVar.f();
                return dVar;
            }
        }
        return null;
    }

    @Override // J1.c
    public final k c(View[] viewArr, int i7) {
        if (viewArr.length != 0 && f16249a.get(i7) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // J1.c
    public final int d(String str) {
        Integer num;
        if (str == null || (num = (Integer) La.b.f6431a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
