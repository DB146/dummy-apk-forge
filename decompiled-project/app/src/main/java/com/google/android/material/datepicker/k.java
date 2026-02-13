package com.google.android.material.datepicker;

import N6.H;
import P4.m0;
import android.R;
import android.content.res.TypedArray;
import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import i.C1284d;
import java.util.ArrayList;
import java.util.HashMap;
import l5.P;
import m.AbstractC1519a;
import m4.M0;
import n.C1680n;
import o.P0;

/* loaded from: classes.dex */
public final class k implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15320b;

    public /* synthetic */ k(Object obj, int i7) {
        this.f15319a = i7;
        this.f15320b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        switch (this.f15319a) {
            case 0:
                l lVar = (l) this.f15320b;
                int i7 = lVar.f15324q0;
                if (i7 == 2) {
                    lVar.p0(1);
                    return;
                } else {
                    if (i7 == 1) {
                        lVar.p0(2);
                        return;
                    }
                    return;
                }
            case 1:
                C1284d c1284d = (C1284d) this.f15320b;
                Message obtain = (view != c1284d.f18052i || (message3 = c1284d.k) == null) ? (view != c1284d.f18053l || (message2 = c1284d.f18055n) == null) ? (view != c1284d.f18056o || (message = c1284d.f18058q) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (obtain != null) {
                    obtain.sendToTarget();
                }
                c1284d.f18043E.obtainMessage(1, c1284d.f18046b).sendToTarget();
                return;
            case 2:
                i6.h hVar = (i6.h) this.f15320b;
                if (hVar.f18456x && hVar.isShowing()) {
                    if (!hVar.f18458z) {
                        TypedArray obtainStyledAttributes = hVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        hVar.f18457y = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        hVar.f18458z = true;
                    }
                    if (hVar.f18457y) {
                        hVar.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.f15320b;
                HashMap hashMap = trackSelectionView.f14803u;
                boolean z8 = true;
                if (view == trackSelectionView.f14799c) {
                    trackSelectionView.f14808z = true;
                    hashMap.clear();
                } else if (view == trackSelectionView.f14800d) {
                    trackSelectionView.f14808z = false;
                    hashMap.clear();
                } else {
                    trackSelectionView.f14808z = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    P p10 = (P) tag;
                    M0 m02 = p10.f19402a;
                    m0 m0Var = m02.f20108b;
                    k5.v vVar = (k5.v) hashMap.get(m0Var);
                    int i10 = p10.f19403b;
                    if (vVar == null) {
                        if (!trackSelectionView.f14805w && hashMap.size() > 0) {
                            hashMap.clear();
                        }
                        hashMap.put(m0Var, new k5.v(m0Var, H.K(Integer.valueOf(i10))));
                    } else {
                        ArrayList arrayList = new ArrayList(vVar.f18968b);
                        boolean isChecked = ((CheckedTextView) view).isChecked();
                        boolean z10 = trackSelectionView.f14804v && m02.f20109c;
                        if (!z10 && (!trackSelectionView.f14805w || trackSelectionView.f14802f.size() <= 1)) {
                            z8 = false;
                        }
                        if (isChecked && z8) {
                            arrayList.remove(Integer.valueOf(i10));
                            if (arrayList.isEmpty()) {
                                hashMap.remove(m0Var);
                            } else {
                                hashMap.put(m0Var, new k5.v(m0Var, arrayList));
                            }
                        } else if (!isChecked) {
                            if (z10) {
                                arrayList.add(Integer.valueOf(i10));
                                hashMap.put(m0Var, new k5.v(m0Var, arrayList));
                            } else {
                                hashMap.put(m0Var, new k5.v(m0Var, H.K(Integer.valueOf(i10))));
                            }
                        }
                    }
                }
                trackSelectionView.a();
                return;
            case 4:
                ((AbstractC1519a) this.f15320b).a();
                return;
            default:
                P0 p02 = ((Toolbar) this.f15320b).f13084c0;
                C1680n c1680n = p02 == null ? null : p02.f21417b;
                if (c1680n != null) {
                    c1680n.collapseActionView();
                    return;
                }
                return;
        }
    }
}
