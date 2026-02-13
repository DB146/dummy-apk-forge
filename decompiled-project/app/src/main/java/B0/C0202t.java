package B0;

import android.content.res.Resources;
import f0.C1127b;

/* renamed from: B0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0202t extends kotlin.jvm.internal.j implements Rb.f {
    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            throw new ClassCastException();
        }
        D d10 = (D) this.receiver;
        Resources resources = d10.getContext().getResources();
        return Boolean.valueOf(T.f1795a.a(d10, null, new C1127b(new V0.d(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((i0.e) obj2).f18185a, (Rb.c) obj3)));
    }
}
