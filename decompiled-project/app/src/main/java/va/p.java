package va;

import W1.U;
import W1.b0;
import java.util.List;

/* loaded from: classes2.dex */
public final class p extends b0 {
    public final Db.o j;

    public p(U u3) {
        super(u3, 1);
        this.j = android.support.v4.media.session.b.z(new com.kt.apps.core.utils.l(22));
    }

    @Override // e3.AbstractC1076a
    public final int c() {
        return j().size();
    }

    @Override // e3.AbstractC1076a
    public final CharSequence e(int i7) {
        return ((M9.d) j().get(i7)).f6850a;
    }

    @Override // W1.b0
    public final W1.C i(int i7) {
        M9.d extensionConfig = (M9.d) j().get(i7);
        kotlin.jvm.internal.l.e(extensionConfig, "extensionConfig");
        u uVar = new u();
        uVar.l0(com.bumptech.glide.c.f(new Db.j("extra:extensions_id", extensionConfig)));
        return uVar;
    }

    public final List j() {
        return (List) this.j.getValue();
    }
}
