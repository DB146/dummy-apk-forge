package wc;

import java.util.function.BinaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements BinaryOperator {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        k kVar = (k) obj;
        k kVar2 = (k) obj2;
        String l10 = l.l(kVar2.f25888a);
        kVar2.f25888a = null;
        vc.i.D(kVar.f25888a);
        kVar.f25888a.append((Object) l10);
        return kVar;
    }
}
