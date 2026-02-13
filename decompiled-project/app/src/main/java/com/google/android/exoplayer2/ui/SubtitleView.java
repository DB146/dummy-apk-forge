package com.google.android.exoplayer2.ui;

import a5.C0775a;
import a5.C0776b;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.bumptech.glide.c;
import e5.InterfaceC1093b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l5.C1488b;
import l5.C1489c;
import l5.L;
import l5.T;
import n5.D;

@Deprecated
/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public List f14788a;

    /* renamed from: b, reason: collision with root package name */
    public C1489c f14789b;

    /* renamed from: c, reason: collision with root package name */
    public float f14790c;

    /* renamed from: d, reason: collision with root package name */
    public float f14791d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14792e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14793f;

    /* renamed from: u, reason: collision with root package name */
    public int f14794u;

    /* renamed from: v, reason: collision with root package name */
    public L f14795v;

    /* renamed from: w, reason: collision with root package name */
    public View f14796w;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14788a = Collections.emptyList();
        this.f14789b = C1489c.g;
        this.f14790c = 0.0533f;
        this.f14791d = 0.08f;
        this.f14792e = true;
        this.f14793f = true;
        C1488b c1488b = new C1488b(context);
        this.f14795v = c1488b;
        this.f14796w = c1488b;
        addView(c1488b);
        this.f14794u = 1;
    }

    private List<C0776b> getCuesWithStylingPreferencesApplied() {
        if (this.f14792e && this.f14793f) {
            return this.f14788a;
        }
        ArrayList arrayList = new ArrayList(this.f14788a.size());
        for (int i7 = 0; i7 < this.f14788a.size(); i7++) {
            C0775a a9 = ((C0776b) this.f14788a.get(i7)).a();
            if (!this.f14792e) {
                a9.f12704n = false;
                CharSequence charSequence = a9.f12694a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        a9.f12694a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = a9.f12694a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof InterfaceC1093b)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                c.W(a9);
            } else if (!this.f14793f) {
                c.W(a9);
            }
            arrayList.add(a9.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (D.f21141a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C1489c getUserCaptionStyle() {
        CaptioningManager captioningManager;
        C1489c c1489c;
        int i7 = D.f21141a;
        C1489c c1489c2 = C1489c.g;
        if (i7 < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return c1489c2;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i7 >= 21) {
            c1489c = new C1489c(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        } else {
            c1489c = new C1489c(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
        }
        return c1489c;
    }

    private <T extends View & L> void setView(T t5) {
        removeView(this.f14796w);
        View view = this.f14796w;
        if (view instanceof T) {
            ((T) view).f19406b.destroy();
        }
        this.f14796w = t5;
        this.f14795v = t5;
        addView(t5);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.f14795v.a(getCuesWithStylingPreferencesApplied(), this.f14789b, this.f14790c, this.f14791d);
    }

    public void setApplyEmbeddedFontSizes(boolean z8) {
        this.f14793f = z8;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z8) {
        this.f14792e = z8;
        c();
    }

    public void setBottomPaddingFraction(float f4) {
        this.f14791d = f4;
        c();
    }

    public void setCues(List<C0776b> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f14788a = list;
        c();
    }

    public void setFractionalTextSize(float f4) {
        this.f14790c = f4;
        c();
    }

    public void setStyle(C1489c c1489c) {
        this.f14789b = c1489c;
        c();
    }

    public void setViewType(int i7) {
        if (this.f14794u == i7) {
            return;
        }
        if (i7 == 1) {
            setView(new C1488b(getContext()));
        } else {
            if (i7 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new T(getContext()));
        }
        this.f14794u = i7;
    }
}
