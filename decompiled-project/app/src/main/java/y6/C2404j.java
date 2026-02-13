package y6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import c6.AbstractC0911a;
import y7.u0;

/* renamed from: y6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2404j {

    /* renamed from: a, reason: collision with root package name */
    public u0 f27048a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public u0 f27049b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public u0 f27050c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public u0 f27051d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2397c f27052e = new C2395a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2397c f27053f = new C2395a(0.0f);
    public InterfaceC2397c g = new C2395a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC2397c f27054h = new C2395a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public C2399e f27055i = new C2399e(0);
    public C2399e j = new C2399e(0);
    public C2399e k = new C2399e(0);

    /* renamed from: l, reason: collision with root package name */
    public C2399e f27056l = new C2399e(0);

    public static L7.j a(Context context, int i7, int i10, C2395a c2395a) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i7);
        if (i10 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i10);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0911a.f14423y);
        try {
            int i11 = obtainStyledAttributes.getInt(0, 0);
            int i12 = obtainStyledAttributes.getInt(3, i11);
            int i13 = obtainStyledAttributes.getInt(4, i11);
            int i14 = obtainStyledAttributes.getInt(2, i11);
            int i15 = obtainStyledAttributes.getInt(1, i11);
            InterfaceC2397c c10 = c(obtainStyledAttributes, 5, c2395a);
            InterfaceC2397c c11 = c(obtainStyledAttributes, 8, c10);
            InterfaceC2397c c12 = c(obtainStyledAttributes, 9, c10);
            InterfaceC2397c c13 = c(obtainStyledAttributes, 7, c10);
            InterfaceC2397c c14 = c(obtainStyledAttributes, 6, c10);
            L7.j jVar = new L7.j(2);
            u0 f4 = E6.b.f(i12);
            jVar.f6356b = f4;
            L7.j.d(f4);
            jVar.f6360f = c11;
            u0 f10 = E6.b.f(i13);
            jVar.f6357c = f10;
            L7.j.d(f10);
            jVar.g = c12;
            u0 f11 = E6.b.f(i14);
            jVar.f6358d = f11;
            L7.j.d(f11);
            jVar.f6361h = c13;
            u0 f12 = E6.b.f(i15);
            jVar.f6359e = f12;
            L7.j.d(f12);
            jVar.f6362i = c14;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static L7.j b(Context context, AttributeSet attributeSet, int i7, int i10) {
        C2395a c2395a = new C2395a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0911a.f14417s, i7, i10);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, c2395a);
    }

    public static InterfaceC2397c c(TypedArray typedArray, int i7, InterfaceC2397c interfaceC2397c) {
        TypedValue peekValue = typedArray.peekValue(i7);
        if (peekValue == null) {
            return interfaceC2397c;
        }
        int i10 = peekValue.type;
        return i10 == 5 ? new C2395a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i10 == 6 ? new C2402h(peekValue.getFraction(1.0f, 1.0f)) : interfaceC2397c;
    }

    public final boolean d(RectF rectF) {
        boolean z8 = this.f27056l.getClass().equals(C2399e.class) && this.j.getClass().equals(C2399e.class) && this.f27055i.getClass().equals(C2399e.class) && this.k.getClass().equals(C2399e.class);
        float a9 = this.f27052e.a(rectF);
        return z8 && ((this.f27053f.a(rectF) > a9 ? 1 : (this.f27053f.a(rectF) == a9 ? 0 : -1)) == 0 && (this.f27054h.a(rectF) > a9 ? 1 : (this.f27054h.a(rectF) == a9 ? 0 : -1)) == 0 && (this.g.a(rectF) > a9 ? 1 : (this.g.a(rectF) == a9 ? 0 : -1)) == 0) && ((this.f27049b instanceof C2403i) && (this.f27048a instanceof C2403i) && (this.f27050c instanceof C2403i) && (this.f27051d instanceof C2403i));
    }

    public final L7.j e() {
        L7.j jVar = new L7.j(false);
        jVar.f6356b = this.f27048a;
        jVar.f6357c = this.f27049b;
        jVar.f6358d = this.f27050c;
        jVar.f6359e = this.f27051d;
        jVar.f6360f = this.f27052e;
        jVar.g = this.f27053f;
        jVar.f6361h = this.g;
        jVar.f6362i = this.f27054h;
        jVar.j = this.f27055i;
        jVar.k = this.j;
        jVar.f6363l = this.k;
        jVar.f6364m = this.f27056l;
        return jVar;
    }
}
