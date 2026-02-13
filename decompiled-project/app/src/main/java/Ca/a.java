package Ca;

import A9.C0163z1;
import Ca.b;
import W1.C;
import W1.U;
import W1.b0;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class a extends b0 {
    public final Db.o j;
    public boolean k;

    public a(U u3) {
        super(u3, 0);
        this.j = android.support.v4.media.session.b.z(new C0163z1(11));
    }

    @Override // e3.AbstractC1076a
    public final int c() {
        return m().size();
    }

    @Override // e3.AbstractC1076a
    public final int d(C object) {
        kotlin.jvm.internal.l.e(object, "object");
        return object.getClass().getName().equals(b.a.class.getName()) ? -2 : -1;
    }

    @Override // e3.AbstractC1076a
    public final CharSequence e(int i7) {
        return this.k ? k(i7) : l(i7);
    }

    @Override // W1.b0
    public final C i(int i7) {
        return this.k ? new b.a() : j(i7);
    }

    public abstract C j(int i7);

    public abstract CharSequence k(int i7);

    public abstract CharSequence l(int i7);

    public final List m() {
        return (List) this.j.getValue();
    }
}
