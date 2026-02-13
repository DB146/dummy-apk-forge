package d0;

import A9.AbstractC0068b1;
import B0.D;
import H0.o;
import android.graphics.Rect;
import android.view.autofill.AutofillId;
import u.y;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1034b extends h {

    /* renamed from: a, reason: collision with root package name */
    public final R7.a f16300a;

    /* renamed from: b, reason: collision with root package name */
    public final o f16301b;

    /* renamed from: c, reason: collision with root package name */
    public final D f16302c;

    /* renamed from: d, reason: collision with root package name */
    public final I0.a f16303d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16304e;

    /* renamed from: f, reason: collision with root package name */
    public final AutofillId f16305f;
    public final y g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16306h;

    public C1034b(R7.a aVar, o oVar, D d10, I0.a aVar2, String str) {
        this.f16300a = aVar;
        this.f16301b = oVar;
        this.f16302c = d10;
        this.f16303d = aVar2;
        this.f16304e = str;
        new Rect();
        d10.setImportantForAutofill(1);
        D0.a m10 = Y6.b.m(d10);
        AutofillId i7 = m10 != null ? AbstractC0068b1.i(m10.f3146a) : null;
        if (i7 == null) {
            throw X.c.c("Required value was null.");
        }
        this.f16305f = i7;
        this.g = new y();
    }
}
