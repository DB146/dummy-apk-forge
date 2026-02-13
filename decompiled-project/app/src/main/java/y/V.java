package y;

import B0.AbstractC0207v0;
import Q.C0480b;
import Q.InterfaceC0493h0;
import Q.S0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public final class V extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public static final V f26436a = new kotlin.jvm.internal.m(1);

    @Override // Rb.c
    public final Object invoke(Object obj) {
        InterfaceC0493h0 interfaceC0493h0 = (InterfaceC0493h0) obj;
        int i7 = AbstractC2307o.f26498a;
        S0 s02 = AndroidCompositionLocals_androidKt.f13207b;
        interfaceC0493h0.getClass();
        Context context = (Context) C0480b.p(interfaceC0493h0, s02);
        V0.c cVar = (V0.c) C0480b.p(interfaceC0493h0, AbstractC0207v0.f1993h);
        T t5 = (T) C0480b.p(interfaceC0493h0, U.f26435a);
        if (t5 == null) {
            return null;
        }
        return new C2306n(context, cVar, t5.f26433a, t5.f26434b);
    }
}
