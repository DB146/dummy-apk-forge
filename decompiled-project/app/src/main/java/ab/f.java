package ab;

import W1.C;
import W1.F;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import cb.InterfaceC0919a;
import i1.C1290a;
import oa.C1827b;
import oa.C1830e;

/* loaded from: classes2.dex */
public final class f implements cb.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12807a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12808b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public volatile InterfaceC0919a f12809c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12810d;

    public f(C c10) {
        this.f12810d = c10;
    }

    public f(C1290a c1290a) {
        this.f12810d = c1290a;
    }

    public static final Context b(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public C1830e a() {
        C c10 = (C) this.f12810d;
        F f4 = c10.f10266I;
        if ((f4 == null ? null : f4.f10314e) == null) {
            throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
        }
        com.bumptech.glide.c.h((f4 == null ? null : f4.f10314e) instanceof cb.b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", (f4 == null ? null : f4.f10314e).getClass());
        F f10 = c10.f10266I;
        C1827b c1827b = (C1827b) ((g) c2.i.p(g.class, f10 != null ? f10.f10314e : null));
        return new C1830e(c1827b.f22145a, c1827b.f22147c);
    }

    @Override // cb.b
    public final Object e() {
        switch (this.f12807a) {
            case 0:
                if (((oa.j) this.f12809c) == null) {
                    synchronized (this.f12808b) {
                        try {
                            if (((oa.j) this.f12809c) == null) {
                                this.f12809c = ((C1290a) this.f12810d).m();
                            }
                        } finally {
                        }
                    }
                }
                return (oa.j) this.f12809c;
            default:
                if (((C1830e) this.f12809c) == null) {
                    synchronized (this.f12808b) {
                        try {
                            if (((C1830e) this.f12809c) == null) {
                                this.f12809c = a();
                            }
                        } finally {
                        }
                    }
                }
                return (C1830e) this.f12809c;
        }
    }
}
