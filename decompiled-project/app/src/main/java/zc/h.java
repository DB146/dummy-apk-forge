package zc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import r7.C1947c;

/* loaded from: classes2.dex */
public final class h extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28380a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28381b;

    public h(String str, int i7) {
        this.f28380a = i7;
        switch (i7) {
            case 3:
                this.f28381b = wc.c.c(str);
                return;
            case 4:
                StringBuilder b2 = wc.l.b();
                wc.l.a(str, b2, false);
                this.f28381b = wc.c.c(wc.l.l(b2));
                return;
            case 5:
                StringBuilder b10 = wc.l.b();
                wc.l.a(str, b10, false);
                this.f28381b = wc.c.c(wc.l.l(b10));
                return;
            default:
                vc.i.D(str);
                this.f28381b = wc.c.c(str);
                return;
        }
    }

    public /* synthetic */ h(String str, int i7, boolean z8) {
        this.f28380a = i7;
        this.f28381b = str;
    }

    @Override // zc.p
    public int a() {
        switch (this.f28380a) {
            case 0:
                return 2;
            case 1:
                return 6;
            case 2:
                return 8;
            case 3:
            case 4:
            case 6:
            default:
                return super.a();
            case 5:
                return 10;
            case 7:
                return 10;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return 2;
            case 9:
                return 1;
        }
    }

    @Override // zc.p
    public final boolean b(xc.l lVar, xc.l lVar2) {
        switch (this.f28380a) {
            case 0:
                return lVar2.I(this.f28381b);
            case 1:
                xc.b y10 = lVar2.y();
                y10.getClass();
                ArrayList arrayList = new ArrayList(y10.f26332a);
                for (int i7 = 0; i7 < y10.f26332a; i7++) {
                    String str = y10.f26333b[i7];
                    if (!xc.b.G(str)) {
                        arrayList.add(new xc.a(str, (String) y10.f26334c[i7], y10));
                    }
                }
                Iterator it = Collections.unmodifiableList(arrayList).iterator();
                while (it.hasNext()) {
                    if (wc.c.c(((xc.a) it.next()).f26329a).startsWith(this.f28381b)) {
                        return true;
                    }
                }
                return false;
            case 2:
                xc.b bVar = lVar2.f26351f;
                if (bVar == null) {
                    return false;
                }
                String C2 = bVar.C("class");
                int length = C2.length();
                String str2 = this.f28381b;
                int length2 = str2.length();
                if (length == 0 || length < length2) {
                    return false;
                }
                if (length == length2) {
                    return str2.equalsIgnoreCase(C2);
                }
                boolean z8 = false;
                int i10 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    if (Character.isWhitespace(C2.charAt(i11))) {
                        if (!z8) {
                            continue;
                        } else {
                            if (i11 - i10 == length2 && C2.regionMatches(true, i10, str2, 0, length2)) {
                                return true;
                            }
                            z8 = false;
                        }
                    } else if (!z8) {
                        i10 = i11;
                        z8 = true;
                    }
                }
                if (z8 && length - i10 == length2) {
                    return C2.regionMatches(true, i10, str2, 0, length2);
                }
                return false;
            case 3:
                lVar2.getClass();
                StringBuilder b2 = wc.l.b();
                new C1947c(b2, 19).h(lVar2);
                return wc.c.c(wc.l.l(b2)).contains(this.f28381b);
            case 4:
                return wc.c.c(lVar2.l0()).contains(this.f28381b);
            case 5:
                return wc.c.c(lVar2.o0()).contains(this.f28381b);
            case 6:
                return ((String) lVar2.f26350e.stream().map(new wc.b(4)).collect(wc.l.k(""))).contains(this.f28381b);
            case 7:
                lVar2.getClass();
                return ((String) android.support.v4.media.session.b.F(lVar2, xc.q.class).map(new wc.b(4)).collect(wc.l.k(""))).contains(this.f28381b);
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                xc.b bVar2 = lVar2.f26351f;
                return this.f28381b.equals(bVar2 != null ? bVar2.C("id") : "");
            case 9:
                return lVar2.K(this.f28381b);
            case 10:
                return lVar2.f26349d.f27658c.endsWith(this.f28381b);
            default:
                return lVar2.f26349d.f27658c.startsWith(this.f28381b);
        }
    }

    public final String toString() {
        switch (this.f28380a) {
            case 0:
                return h3.o.p(new StringBuilder("["), this.f28381b, "]");
            case 1:
                return h3.o.p(new StringBuilder("[^"), this.f28381b, "]");
            case 2:
                return "." + this.f28381b;
            case 3:
                return h3.o.p(new StringBuilder(":containsData("), this.f28381b, ")");
            case 4:
                return h3.o.p(new StringBuilder(":containsOwn("), this.f28381b, ")");
            case 5:
                return h3.o.p(new StringBuilder(":contains("), this.f28381b, ")");
            case 6:
                return h3.o.p(new StringBuilder(":containsWholeOwnText("), this.f28381b, ")");
            case 7:
                return h3.o.p(new StringBuilder(":containsWholeText("), this.f28381b, ")");
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return "#" + this.f28381b;
            case 9:
                return this.f28381b;
            case 10:
                return "*|" + this.f28381b;
            default:
                return h3.o.p(new StringBuilder(), this.f28381b, "|*");
        }
    }
}
