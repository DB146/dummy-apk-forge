package com.kt.apps.core;

import J1.c;
import J1.k;
import J9.a;
import J9.b;
import J9.d;
import J9.e;
import J9.f;
import J9.g;
import J9.h;
import J9.i;
import J9.j;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.kt.apps.core.base.leanback.VerticalGridView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f15910a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(7);
        f15910a = sparseIntArray;
        sparseIntArray.put(R.layout.default_grid_fragment, 1);
        sparseIntArray.put(R.layout.item_link_stream, 2);
        sparseIntArray.put(R.layout.layout_tv_channel_number, 3);
        sparseIntArray.put(R.layout.layout_tv_program_schedule, 4);
        sparseIntArray.put(R.layout.layout_video_codec_info, 5);
        sparseIntArray.put(R.layout.lb_program_row_header, 6);
        sparseIntArray.put(R.layout.playback_vertical_grid_overlay, 7);
    }

    @Override // J1.c
    public final List a() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.kt.skeleton.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [J9.b, J9.c, J1.k] */
    /* JADX WARN: Type inference failed for: r0v45, types: [J1.k, J9.i, J9.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [J9.f, J1.k, J9.g] */
    /* JADX WARN: Type inference failed for: r9v1, types: [J9.e, J1.k, J9.d, java.lang.Object] */
    @Override // J1.c
    public final k b(View view, int i7) {
        int i10 = f15910a.get(i7);
        if (i10 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            switch (i10) {
                case 1:
                    if (!"layout/default_grid_fragment_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for default_grid_fragment is invalid. Received: "));
                    }
                    a aVar = new a(null, view, (FrameLayout) k.h(view, 1, null, null)[0], 0);
                    aVar.f5742E = -1L;
                    ((FrameLayout) aVar.f5741D).setTag(null);
                    view.setTag(R.id.dataBinding, aVar);
                    aVar.f();
                    return aVar;
                case 2:
                    if (!"layout/item_link_stream_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for item_link_stream is invalid. Received: "));
                    }
                    a aVar2 = new a(null, view, (MaterialButton) k.h(view, 1, null, null)[0], 7);
                    aVar2.f5742E = -1L;
                    ((MaterialButton) aVar2.f5741D).setTag(null);
                    view.setTag(R.id.dataBinding, aVar2);
                    aVar2.f();
                    return aVar2;
                case 3:
                    if (!"layout/layout_tv_channel_number_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for layout_tv_channel_number is invalid. Received: "));
                    }
                    Object[] h10 = k.h(view, 2, null, J9.c.f5744E);
                    ?? bVar = new b(null, view, (TextView) h10[1]);
                    bVar.f5745D = -1L;
                    ((FrameLayout) h10[0]).setTag(null);
                    bVar.k(view);
                    bVar.f();
                    return bVar;
                case 4:
                    if (!"layout/layout_tv_program_schedule_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for layout_tv_program_schedule is invalid. Received: "));
                    }
                    Object[] h11 = k.h(view, 4, e.f5751I, e.f5752J);
                    ?? dVar = new d(null, view, (FrameLayout) h11[0], (TextView) h11[2], (h) h11[1], (VerticalGridView) h11[3]);
                    dVar.f5753H = -1L;
                    dVar.f5746C.setTag(null);
                    h hVar = dVar.f5748E;
                    if (hVar != null) {
                        hVar.f5439x = dVar;
                    }
                    view.setTag(R.id.dataBinding, dVar);
                    dVar.f();
                    return dVar;
                case 5:
                    if (!"layout/layout_video_codec_info_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for layout_video_codec_info is invalid. Received: "));
                    }
                    Object[] h12 = k.h(view, 11, g.f5755E, g.f5756F);
                    h hVar2 = (h) h12[2];
                    ?? fVar = new f(null, view, hVar2);
                    fVar.f5757D = -1L;
                    h hVar3 = fVar.f5754C;
                    if (hVar3 != null) {
                        hVar3.f5439x = fVar;
                    }
                    ((FrameLayout) h12[0]).setTag(null);
                    ((LinearLayout) h12[1]).setTag(null);
                    fVar.k(view);
                    fVar.f();
                    return fVar;
                case 6:
                    if ("layout/lb_program_row_header_0".equals(tag)) {
                        return new h(view);
                    }
                    throw new IllegalArgumentException(X.c.g(tag, "The tag for lb_program_row_header is invalid. Received: "));
                case 7:
                    if (!"layout/playback_vertical_grid_overlay_0".equals(tag)) {
                        throw new IllegalArgumentException(X.c.g(tag, "The tag for playback_vertical_grid_overlay is invalid. Received: "));
                    }
                    Object[] h13 = k.h(view, 19, null, j.f5764E);
                    FrameLayout frameLayout = (FrameLayout) h13[0];
                    ?? iVar = new i(null, view, frameLayout);
                    iVar.f5765D = -1L;
                    iVar.f5763C.setTag(null);
                    view.setTag(R.id.dataBinding, iVar);
                    iVar.f();
                    return iVar;
            }
        }
        return null;
    }

    @Override // J1.c
    public final k c(View[] viewArr, int i7) {
        if (viewArr.length != 0 && f15910a.get(i7) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // J1.c
    public final int d(String str) {
        Integer num;
        if (str == null || (num = (Integer) x9.b.f26277a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
