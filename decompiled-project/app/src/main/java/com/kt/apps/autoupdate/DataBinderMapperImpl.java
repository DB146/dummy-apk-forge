package com.kt.apps.autoupdate;

import J1.c;
import J1.k;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.List;
import r9.AbstractC1952a;
import s9.AbstractC2000a;
import s9.C2001b;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f15908a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f15908a = sparseIntArray;
        sparseIntArray.put(R.layout.fragment_qr_code, 1);
    }

    @Override // J1.c
    public final List a() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.kt.apps.core.DataBinderMapperImpl());
        arrayList.add(new com.kt.skeleton.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [J1.k, s9.a, s9.b] */
    @Override // J1.c
    public final k b(View view, int i7) {
        int i10 = f15908a.get(i7);
        if (i10 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i10 == 1) {
                if (!"layout/fragment_qr_code_0".equals(tag)) {
                    throw new IllegalArgumentException(X.c.g(tag, "The tag for fragment_qr_code is invalid. Received: "));
                }
                Object[] h10 = k.h(view, 3, null, C2001b.f24210F);
                ?? abstractC2000a = new AbstractC2000a(null, view, (ShapeableImageView) h10[1], (ShapeableImageView) h10[2]);
                abstractC2000a.f24211E = -1L;
                ((ConstraintLayout) h10[0]).setTag(null);
                abstractC2000a.k(view);
                abstractC2000a.f();
                return abstractC2000a;
            }
        }
        return null;
    }

    @Override // J1.c
    public final k c(View[] viewArr, int i7) {
        if (viewArr.length != 0 && f15908a.get(i7) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // J1.c
    public final int d(String str) {
        Integer num;
        if (str == null || (num = (Integer) AbstractC1952a.f23905a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
