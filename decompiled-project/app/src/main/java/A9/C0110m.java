package A9;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: A9.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0110m extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1275a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1276b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1277c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0118o f1278d;

    public C0110m(AbstractC0118o abstractC0118o, float f4, float f10, int i7) {
        this.f1275a = i7;
        switch (i7) {
            case 1:
                this.f1278d = abstractC0118o;
                this.f1276b = f4;
                this.f1277c = f10 - f4;
                return;
            case 2:
                this.f1278d = abstractC0118o;
                this.f1276b = f4;
                this.f1277c = f10 - f4;
                return;
            default:
                this.f1278d = abstractC0118o;
                this.f1276b = f4;
                this.f1277c = f10 - f4;
                return;
        }
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f4, Transformation transformation) {
        switch (this.f1275a) {
            case 0:
                float f10 = (f4 * this.f1277c) + this.f1276b;
                AbstractC0118o abstractC0118o = this.f1278d;
                abstractC0118o.f1310C = f10;
                for (int i7 = 0; i7 < abstractC0118o.f1317e.size(); i7++) {
                    ((View) abstractC0118o.f1317e.get(i7)).setAlpha(abstractC0118o.f1310C);
                }
                return;
            case 1:
                float f11 = (f4 * this.f1277c) + this.f1276b;
                AbstractC0118o abstractC0118o2 = this.f1278d;
                abstractC0118o2.f1309B = f11;
                abstractC0118o2.requestLayout();
                return;
            default:
                float f12 = (f4 * this.f1277c) + this.f1276b;
                AbstractC0118o abstractC0118o3 = this.f1278d;
                abstractC0118o3.f1308A = f12;
                abstractC0118o3.requestLayout();
                return;
        }
    }
}
