package zc;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class o extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28392a;

    /* renamed from: b, reason: collision with root package name */
    public final Pattern f28393b;

    public /* synthetic */ o(Pattern pattern, int i7) {
        this.f28392a = i7;
        this.f28393b = pattern;
    }

    @Override // zc.p
    public final int a() {
        switch (this.f28392a) {
            case 0:
                return 8;
            case 1:
                return 7;
            case 2:
                return 7;
            default:
                return 8;
        }
    }

    @Override // zc.p
    public final boolean b(xc.l lVar, xc.l lVar2) {
        switch (this.f28392a) {
            case 0:
                return this.f28393b.matcher(lVar2.o0()).find();
            case 1:
                return this.f28393b.matcher(lVar2.l0()).find();
            case 2:
                return this.f28393b.matcher((String) lVar2.f26350e.stream().map(new wc.b(4)).collect(wc.l.k(""))).find();
            default:
                lVar2.getClass();
                return this.f28393b.matcher((String) android.support.v4.media.session.b.F(lVar2, xc.q.class).map(new wc.b(4)).collect(wc.l.k(""))).find();
        }
    }

    public final String toString() {
        switch (this.f28392a) {
            case 0:
                return ":matches(" + this.f28393b + ")";
            case 1:
                return ":matchesOwn(" + this.f28393b + ")";
            case 2:
                return ":matchesWholeOwnText(" + this.f28393b + ")";
            default:
                return ":matchesWholeText(" + this.f28393b + ")";
        }
    }
}
