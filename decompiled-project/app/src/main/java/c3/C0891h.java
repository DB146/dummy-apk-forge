package c3;

import A4.s;
import android.content.res.ColorStateList;
import android.graphics.Paint;

/* renamed from: c3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0891h extends AbstractC0894k {

    /* renamed from: d, reason: collision with root package name */
    public s f14280d;

    /* renamed from: e, reason: collision with root package name */
    public float f14281e;

    /* renamed from: f, reason: collision with root package name */
    public s f14282f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public float f14283h;

    /* renamed from: i, reason: collision with root package name */
    public float f14284i;
    public float j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f14285l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f14286m;

    /* renamed from: n, reason: collision with root package name */
    public float f14287n;

    @Override // c3.AbstractC0893j
    public final boolean a() {
        return this.f14282f.p() || this.f14280d.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // c3.AbstractC0893j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z8;
        s sVar;
        s sVar2 = this.f14282f;
        boolean z10 = false;
        if (sVar2.p()) {
            ColorStateList colorStateList = (ColorStateList) sVar2.f472c;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != sVar2.f470a) {
                sVar2.f470a = colorForState;
                z8 = true;
                sVar = this.f14280d;
                if (sVar.p()) {
                    ColorStateList colorStateList2 = (ColorStateList) sVar.f472c;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != sVar.f470a) {
                        sVar.f470a = colorForState2;
                        z10 = true;
                    }
                }
                return z8 | z10;
            }
        }
        z8 = false;
        sVar = this.f14280d;
        if (sVar.p()) {
        }
        return z8 | z10;
    }

    public float getFillAlpha() {
        return this.f14283h;
    }

    public int getFillColor() {
        return this.f14282f.f470a;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.f14280d.f470a;
    }

    public float getStrokeWidth() {
        return this.f14281e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.f14284i;
    }

    public void setFillAlpha(float f4) {
        this.f14283h = f4;
    }

    public void setFillColor(int i7) {
        this.f14282f.f470a = i7;
    }

    public void setStrokeAlpha(float f4) {
        this.g = f4;
    }

    public void setStrokeColor(int i7) {
        this.f14280d.f470a = i7;
    }

    public void setStrokeWidth(float f4) {
        this.f14281e = f4;
    }

    public void setTrimPathEnd(float f4) {
        this.j = f4;
    }

    public void setTrimPathOffset(float f4) {
        this.k = f4;
    }

    public void setTrimPathStart(float f4) {
        this.f14284i = f4;
    }
}
