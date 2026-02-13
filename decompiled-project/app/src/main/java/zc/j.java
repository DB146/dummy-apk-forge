package zc;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class j extends p {

    /* renamed from: a, reason: collision with root package name */
    public final String f28385a;

    /* renamed from: b, reason: collision with root package name */
    public final Pattern f28386b;

    public j(String str, Pattern pattern) {
        this.f28385a = wc.c.d(str);
        this.f28386b = pattern;
    }

    @Override // zc.p
    public final int a() {
        return 8;
    }

    @Override // zc.p
    public final boolean b(xc.l lVar, xc.l lVar2) {
        String str = this.f28385a;
        return lVar2.I(str) && this.f28386b.matcher(lVar2.o(str)).find();
    }

    public final String toString() {
        return "[" + this.f28385a + "~=" + this.f28386b.toString() + "]";
    }
}
