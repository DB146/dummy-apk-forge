package z;

import android.widget.EdgeEffect;
import y.C2305m;

/* renamed from: z.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2576x extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f28131b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2576x(p0 p0Var, int i7) {
        super(0);
        this.f28130a = i7;
        this.f28131b = p0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 31 ? l3.d.b(r1) : 0.0f) == 0.0f) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 31 ? l3.d.b(r1) : 0.0f) == 0.0f) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 31 ? l3.d.b(r1) : 0.0f) == 0.0f) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006c, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 31 ? l3.d.b(r0) : 0.0f) == 0.0f) goto L42;
     */
    @Override // Rb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z8;
        switch (this.f28130a) {
            case 0:
                ec.d dVar = this.f28131b.f28053I;
                if (dVar != null) {
                    dVar.h(C2569p.f28048a);
                }
                return Db.q.f3365a;
            case 1:
                w0 w0Var = this.f28131b.f28061R;
                if (!w0Var.f28121a.f3375h.r()) {
                    C2305m c2305m = w0Var.f28122b;
                    if (c2305m != null) {
                        y.y yVar = c2305m.f26488c;
                        EdgeEffect edgeEffect = yVar.f26540d;
                        if (edgeEffect != null) {
                            break;
                        }
                        EdgeEffect edgeEffect2 = yVar.f26541e;
                        if (edgeEffect2 != null) {
                            break;
                        }
                        EdgeEffect edgeEffect3 = yVar.f26542f;
                        if (edgeEffect3 != null) {
                            break;
                        }
                        EdgeEffect edgeEffect4 = yVar.g;
                        if (edgeEffect4 != null) {
                            break;
                        }
                    }
                    z8 = false;
                    return Boolean.valueOf(!z8);
                }
                z8 = true;
                return Boolean.valueOf(!z8);
            default:
                return Boolean.valueOf(this.f28131b.f14112B);
        }
    }
}
