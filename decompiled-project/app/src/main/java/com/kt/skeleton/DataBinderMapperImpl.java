package com.kt.skeleton;

import J1.c;
import J1.k;
import Ta.a;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f16259a = new SparseIntArray(0);

    @Override // J1.c
    public final List a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // J1.c
    public final k b(View view, int i7) {
        if (f16259a.get(i7) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // J1.c
    public final k c(View[] viewArr, int i7) {
        if (viewArr.length != 0 && f16259a.get(i7) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // J1.c
    public final int d(String str) {
        Integer num;
        if (str == null || (num = (Integer) a.f9384a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
