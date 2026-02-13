package rc;

import Y5.C0660y;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class z implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final String f24006b;

    /* renamed from: a, reason: collision with root package name */
    public final C1967k f24007a;

    static {
        String separator = File.separator;
        kotlin.jvm.internal.l.d(separator, "separator");
        f24006b = separator;
    }

    public z(C1967k bytes) {
        kotlin.jvm.internal.l.e(bytes, "bytes");
        this.f24007a = bytes;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a9 = sc.c.a(this);
        C1967k c1967k = this.f24007a;
        if (a9 == -1) {
            a9 = 0;
        } else if (a9 < c1967k.f() && c1967k.r(a9) == 92) {
            a9++;
        }
        int f4 = c1967k.f();
        int i7 = a9;
        while (a9 < f4) {
            if (c1967k.r(a9) == 47 || c1967k.r(a9) == 92) {
                arrayList.add(c1967k.B(i7, a9));
                i7 = a9 + 1;
            }
            a9++;
        }
        if (i7 < c1967k.f()) {
            arrayList.add(c1967k.B(i7, c1967k.f()));
        }
        return arrayList;
    }

    public final String b() {
        C1967k c1967k = sc.c.f24359a;
        C1967k c1967k2 = sc.c.f24359a;
        C1967k c1967k3 = this.f24007a;
        int u3 = C1967k.u(c1967k3, c1967k2);
        if (u3 == -1) {
            u3 = C1967k.u(c1967k3, sc.c.f24360b);
        }
        if (u3 != -1) {
            c1967k3 = C1967k.C(c1967k3, u3 + 1, 0, 2);
        } else if (o() != null && c1967k3.f() == 2) {
            c1967k3 = C1967k.f23967d;
        }
        return c1967k3.E();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        z other = (z) obj;
        kotlin.jvm.internal.l.e(other, "other");
        return this.f24007a.compareTo(other.f24007a);
    }

    public final z d() {
        C1967k c1967k = sc.c.f24362d;
        C1967k c1967k2 = this.f24007a;
        if (kotlin.jvm.internal.l.a(c1967k2, c1967k)) {
            return null;
        }
        C1967k c1967k3 = sc.c.f24359a;
        if (kotlin.jvm.internal.l.a(c1967k2, c1967k3)) {
            return null;
        }
        C1967k prefix = sc.c.f24360b;
        if (kotlin.jvm.internal.l.a(c1967k2, prefix)) {
            return null;
        }
        C1967k suffix = sc.c.f24363e;
        c1967k2.getClass();
        kotlin.jvm.internal.l.e(suffix, "suffix");
        int f4 = c1967k2.f();
        byte[] bArr = suffix.f23968a;
        if (c1967k2.v(f4 - bArr.length, suffix, bArr.length) && (c1967k2.f() == 2 || c1967k2.v(c1967k2.f() - 3, c1967k3, 1) || c1967k2.v(c1967k2.f() - 3, prefix, 1))) {
            return null;
        }
        int u3 = C1967k.u(c1967k2, c1967k3);
        if (u3 == -1) {
            u3 = C1967k.u(c1967k2, prefix);
        }
        if (u3 == 2 && o() != null) {
            if (c1967k2.f() == 3) {
                return null;
            }
            return new z(C1967k.C(c1967k2, 0, 3, 1));
        }
        if (u3 == 1) {
            kotlin.jvm.internal.l.e(prefix, "prefix");
            if (c1967k2.v(0, prefix, prefix.f())) {
                return null;
            }
        }
        if (u3 != -1 || o() == null) {
            return u3 == -1 ? new z(c1967k) : u3 == 0 ? new z(C1967k.C(c1967k2, 0, 1, 1)) : new z(C1967k.C(c1967k2, 0, u3, 1));
        }
        if (c1967k2.f() == 2) {
            return null;
        }
        return new z(C1967k.C(c1967k2, 0, 2, 1));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z) && kotlin.jvm.internal.l.a(((z) obj).f24007a, this.f24007a);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, rc.h] */
    public final z f(z other) {
        kotlin.jvm.internal.l.e(other, "other");
        int a9 = sc.c.a(this);
        C1967k c1967k = this.f24007a;
        z zVar = a9 == -1 ? null : new z(c1967k.B(0, a9));
        int a10 = sc.c.a(other);
        C1967k c1967k2 = other.f24007a;
        if (!kotlin.jvm.internal.l.a(zVar, a10 != -1 ? new z(c1967k2.B(0, a10)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList a11 = a();
        ArrayList a12 = other.a();
        int min = Math.min(a11.size(), a12.size());
        int i7 = 0;
        while (i7 < min && kotlin.jvm.internal.l.a(a11.get(i7), a12.get(i7))) {
            i7++;
        }
        if (i7 == min && c1967k.f() == c1967k2.f()) {
            return C0660y.a(".", false);
        }
        if (a12.subList(i7, a12.size()).indexOf(sc.c.f24363e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (kotlin.jvm.internal.l.a(c1967k2, sc.c.f24362d)) {
            return this;
        }
        ?? obj = new Object();
        C1967k c10 = sc.c.c(other);
        if (c10 == null && (c10 = sc.c.c(this)) == null) {
            c10 = sc.c.f(f24006b);
        }
        int size = a12.size();
        for (int i10 = i7; i10 < size; i10++) {
            obj.i0(sc.c.f24363e);
            obj.i0(c10);
        }
        int size2 = a11.size();
        while (i7 < size2) {
            obj.i0((C1967k) a11.get(i7));
            obj.i0(c10);
            i7++;
        }
        return sc.c.d(obj, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, rc.h] */
    public final z g(String child) {
        kotlin.jvm.internal.l.e(child, "child");
        ?? obj = new Object();
        obj.r0(child);
        return sc.c.b(this, sc.c.d(obj, false), false);
    }

    public final int hashCode() {
        return this.f24007a.hashCode();
    }

    public final File i() {
        return new File(this.f24007a.E());
    }

    public final Path j() {
        Path path;
        path = Paths.get(this.f24007a.E(), new String[0]);
        kotlin.jvm.internal.l.d(path, "get(...)");
        return path;
    }

    public final Character o() {
        C1967k c1967k = sc.c.f24359a;
        C1967k c1967k2 = this.f24007a;
        if (C1967k.j(c1967k2, c1967k) != -1 || c1967k2.f() < 2 || c1967k2.r(1) != 58) {
            return null;
        }
        char r10 = (char) c1967k2.r(0);
        if (('a' > r10 || r10 >= '{') && ('A' > r10 || r10 >= '[')) {
            return null;
        }
        return Character.valueOf(r10);
    }

    public final String toString() {
        return this.f24007a.E();
    }
}
