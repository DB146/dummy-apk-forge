package A9;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.kt.apps.core.base.leanback.ControlBar;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: A9.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0067b0 extends C0109l2 {

    /* renamed from: b, reason: collision with root package name */
    public C0098j f1058b;

    /* renamed from: c, reason: collision with root package name */
    public C0093h2 f1059c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0113m2 f1060d;

    /* renamed from: e, reason: collision with root package name */
    public final ControlBar f1061e;

    /* renamed from: f, reason: collision with root package name */
    public final View f1062f;
    public final SparseArray g;

    /* renamed from: h, reason: collision with root package name */
    public final Z f1063h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0071c0 f1064i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0067b0(C0071c0 c0071c0, View view) {
        super(view);
        this.f1064i = c0071c0;
        this.g = new SparseArray();
        this.f1062f = view.findViewById(R.id.controls_container);
        ControlBar controlBar = (ControlBar) view.findViewById(R.id.control_bar);
        this.f1061e = controlBar;
        if (controlBar == null) {
            throw new IllegalStateException("Couldn't find control_bar");
        }
        controlBar.setDefaultFocusToMiddle(c0071c0.f1089d);
        controlBar.setOnChildFocusedListener(new T(this));
        this.f1063h = new Z(this, 0);
    }

    public final void c(int i7, C0098j c0098j, AbstractC0113m2 abstractC0113m2) {
        SparseArray sparseArray = this.g;
        C0109l2 c0109l2 = (C0109l2) sparseArray.get(i7);
        Object obj = c0098j.f1233c.get(i7);
        ControlBar controlBar = this.f1061e;
        if (c0109l2 == null) {
            c0109l2 = abstractC0113m2.d(controlBar);
            sparseArray.put(i7, c0109l2);
            abstractC0113m2.h(c0109l2, new ViewOnClickListenerC0063a0(this, i7, c0109l2));
        }
        View view = c0109l2.f1271a;
        if (view.getParent() == null) {
            controlBar.addView(view);
        }
        abstractC0113m2.c(c0109l2, obj);
    }

    public final void d(AbstractC0113m2 abstractC0113m2) {
        C0098j c0098j = this.f1058b;
        int size = c0098j == null ? 0 : c0098j.f1233c.size();
        ControlBar controlBar = this.f1061e;
        View focusedChild = controlBar.getFocusedChild();
        if (focusedChild != null && size > 0 && controlBar.indexOfChild(focusedChild) >= size) {
            controlBar.getChildAt(c0098j.f1233c.size() - 1).requestFocus();
        }
        for (int childCount = controlBar.getChildCount() - 1; childCount >= size; childCount--) {
            controlBar.removeViewAt(childCount);
        }
        for (int i7 = 0; i7 < size && i7 < 7; i7++) {
            c(i7, c0098j, abstractC0113m2);
        }
        Context context = controlBar.getContext();
        this.f1064i.getClass();
        if (C0071c0.f1085e == 0) {
            C0071c0.f1085e = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_controls_child_margin_default);
        }
        int i10 = C0071c0.f1085e;
        if (C0071c0.f1086f == 0) {
            C0071c0.f1086f = context.getResources().getDimensionPixelSize(R.dimen.lb_control_icon_width);
        }
        controlBar.setChildMarginFromCenter(i10 + C0071c0.f1086f);
    }
}
