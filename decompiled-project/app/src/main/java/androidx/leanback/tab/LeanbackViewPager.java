package androidx.leanback.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import e3.AbstractC1084i;

/* loaded from: classes.dex */
public class LeanbackViewPager extends AbstractC1084i {

    /* renamed from: q0, reason: collision with root package name */
    public boolean f13487q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f13488r0;

    public LeanbackViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13487q0 = false;
        this.f13488r0 = false;
    }

    @Override // e3.AbstractC1084i, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f13487q0 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // e3.AbstractC1084i, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f13487q0 && super.onTouchEvent(motionEvent);
    }

    public void setKeyEventsEnabled(boolean z8) {
        this.f13488r0 = z8;
    }

    public void setTouchEnabled(boolean z8) {
        this.f13487q0 = z8;
    }
}
