package wc;

import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        k kVar = (k) obj;
        CharSequence charSequence = (CharSequence) obj2;
        vc.i.D(kVar.f25888a);
        if (!kVar.f25890c) {
            kVar.f25888a.append(kVar.f25889b);
        }
        kVar.f25888a.append((Object) charSequence);
        kVar.f25890c = false;
    }
}
