package zc;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class r extends t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28394a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f28395b;

    public r(String str) {
        StringBuilder b2 = wc.l.b();
        wc.l.a(str, b2, false);
        this.f28395b = wc.c.c(wc.l.l(b2));
    }

    public r(Pattern pattern) {
        this.f28395b = pattern;
    }

    @Override // zc.p
    public final int a() {
        switch (this.f28394a) {
            case 0:
                return 6;
            default:
                return 8;
        }
    }

    @Override // zc.t
    public final boolean g(xc.q qVar) {
        switch (this.f28394a) {
            case 0:
                return wc.c.c(qVar.O()).contains((String) this.f28395b);
            default:
                return ((Pattern) this.f28395b).matcher(qVar.O()).find();
        }
    }

    public final String toString() {
        switch (this.f28394a) {
            case 0:
                return h3.o.p(new StringBuilder(":contains("), (String) this.f28395b, ")");
            default:
                return ":matches(" + ((Pattern) this.f28395b) + ")";
        }
    }
}
