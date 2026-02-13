package C;

import A0.w0;

/* loaded from: classes.dex */
public final class C extends c0.l implements w0 {

    /* renamed from: C, reason: collision with root package name */
    public float f2337C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2338D;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, C.H] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, C.H] */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // A0.w0
    public final Object S(Object obj) {
        ?? r22 = obj instanceof H ? (H) obj : 0;
        if (r22 == 0) {
            r22 = new Object();
            r22.f2352a = 0.0f;
            r22.f2353b = true;
        }
        r22.f2352a = this.f2337C;
        r22.f2353b = this.f2338D;
        return r22;
    }
}
