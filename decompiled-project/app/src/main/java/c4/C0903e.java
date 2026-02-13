package c4;

import Y5.B;
import Y5.C0656w;
import android.content.Context;
import d4.InterfaceC1049b;
import i4.i;

/* renamed from: c4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0903e implements InterfaceC1049b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14340a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14341b;

    public /* synthetic */ C0903e(Object obj, int i7) {
        this.f14340a = i7;
        this.f14341b = obj;
    }

    @Override // Cb.a
    public final Object get() {
        switch (this.f14340a) {
            case 0:
                return new C0902d((Context) ((C0903e) this.f14341b).f14341b, new C0656w(12), new B(11));
            case 1:
                String packageName = ((Context) ((C0903e) this.f14341b).f14341b).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 2:
                return new i(Integer.valueOf(i.f18419d).intValue(), (Context) ((C0903e) this.f14341b).f14341b, "com.google.android.datatransport.events");
            default:
                return this.f14341b;
        }
    }
}
