package com.google.android.exoplayer2.ui;

import G3.A;
import P4.m0;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.material.datepicker.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k5.v;
import l5.O;
import l5.P;
import m4.M0;

@Deprecated
/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f14797a;

    /* renamed from: b, reason: collision with root package name */
    public final LayoutInflater f14798b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckedTextView f14799c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckedTextView f14800d;

    /* renamed from: e, reason: collision with root package name */
    public final k f14801e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f14802f;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f14803u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14804v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14805w;

    /* renamed from: x, reason: collision with root package name */
    public O f14806x;

    /* renamed from: y, reason: collision with root package name */
    public CheckedTextView[][] f14807y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f14808z;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f14797a = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f14798b = from;
        k kVar = new k(this, 3);
        this.f14801e = kVar;
        this.f14806x = new A(getResources(), 1);
        this.f14802f = new ArrayList();
        this.f14803u = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f14799c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.kt.apps.media.xemtv.beta.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(kVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(com.kt.apps.media.xemtv.beta.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f14800d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.kt.apps.media.xemtv.beta.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(kVar);
        addView(checkedTextView2);
    }

    public final void a() {
        this.f14799c.setChecked(this.f14808z);
        boolean z8 = this.f14808z;
        HashMap hashMap = this.f14803u;
        this.f14800d.setChecked(!z8 && hashMap.size() == 0);
        for (int i7 = 0; i7 < this.f14807y.length; i7++) {
            v vVar = (v) hashMap.get(((M0) this.f14802f.get(i7)).f20108b);
            int i10 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f14807y[i7];
                if (i10 < checkedTextViewArr.length) {
                    if (vVar != null) {
                        Object tag = checkedTextViewArr[i10].getTag();
                        tag.getClass();
                        this.f14807y[i7][i10].setChecked(vVar.f18968b.contains(Integer.valueOf(((P) tag).f19403b)));
                    } else {
                        checkedTextViewArr[i10].setChecked(false);
                    }
                    i10++;
                }
            }
        }
    }

    public final void b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f14802f;
        boolean isEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f14800d;
        CheckedTextView checkedTextView2 = this.f14799c;
        if (isEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f14807y = new CheckedTextView[arrayList.size()];
        boolean z8 = this.f14805w && arrayList.size() > 1;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            M0 m02 = (M0) arrayList.get(i7);
            boolean z10 = this.f14804v && m02.f20109c;
            CheckedTextView[][] checkedTextViewArr = this.f14807y;
            int i10 = m02.f20107a;
            checkedTextViewArr[i7] = new CheckedTextView[i10];
            P[] pArr = new P[i10];
            for (int i11 = 0; i11 < m02.f20107a; i11++) {
                pArr[i11] = new P(m02, i11);
            }
            for (int i12 = 0; i12 < i10; i12++) {
                LayoutInflater layoutInflater = this.f14798b;
                if (i12 == 0) {
                    addView(layoutInflater.inflate(com.kt.apps.media.xemtv.beta.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z10 || z8) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f14797a);
                O o10 = this.f14806x;
                P p10 = pArr[i12];
                checkedTextView3.setText(((A) o10).c(p10.f19402a.f20108b.f8109d[p10.f19403b]));
                checkedTextView3.setTag(pArr[i12]);
                if (m02.b(i12)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f14801e);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.f14807y[i7][i12] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.f14808z;
    }

    public Map<m0, v> getOverrides() {
        return this.f14803u;
    }

    public void setAllowAdaptiveSelections(boolean z8) {
        if (this.f14804v != z8) {
            this.f14804v = z8;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z8) {
        if (this.f14805w != z8) {
            this.f14805w = z8;
            if (!z8) {
                HashMap hashMap = this.f14803u;
                if (hashMap.size() > 1) {
                    ArrayList arrayList = this.f14802f;
                    HashMap hashMap2 = new HashMap();
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        v vVar = (v) hashMap.get(((M0) arrayList.get(i7)).f20108b);
                        if (vVar != null && hashMap2.isEmpty()) {
                            hashMap2.put(vVar.f18967a, vVar);
                        }
                    }
                    hashMap.clear();
                    hashMap.putAll(hashMap2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z8) {
        this.f14799c.setVisibility(z8 ? 0 : 8);
    }

    public void setTrackNameProvider(O o10) {
        o10.getClass();
        this.f14806x = o10;
        b();
    }
}
