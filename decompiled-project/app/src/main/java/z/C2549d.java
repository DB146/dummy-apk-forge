package z;

import Q.C0480b;
import Q.InterfaceC0493h0;
import Q.S0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import u0.C2080j;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2549d extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: b, reason: collision with root package name */
    public static final C2549d f27964b = new C2549d(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C2549d f27965c = new C2549d(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final C2549d f27966d = new C2549d(1, 2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27967a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2549d(int i7, int i10) {
        super(i7);
        this.f27967a = i10;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f27967a) {
            case 0:
                InterfaceC0493h0 interfaceC0493h0 = (InterfaceC0493h0) obj;
                S0 s02 = AndroidCompositionLocals_androidKt.f13207b;
                interfaceC0493h0.getClass();
                if (((Context) C0480b.p(interfaceC0493h0, s02)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC2553f.f27973b;
                }
                InterfaceC2547c.f27963a.getClass();
                return C2545b.f27962c;
            case 1:
                ((Number) obj).longValue();
                return Db.q.f3365a;
            default:
                return Boolean.valueOf(!u0.u.e(((C2080j) obj).f24770i, 2));
        }
    }
}
