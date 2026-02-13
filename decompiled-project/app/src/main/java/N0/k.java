package N0;

import java.util.List;
import y7.u0;

/* loaded from: classes.dex */
public final class k implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final k f7139b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f7140c;

    /* renamed from: d, reason: collision with root package name */
    public static final k f7141d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f7142e;

    /* renamed from: a, reason: collision with root package name */
    public final int f7143a;

    static {
        k kVar = new k(100);
        k kVar2 = new k(200);
        k kVar3 = new k(300);
        k kVar4 = new k(400);
        k kVar5 = new k(500);
        k kVar6 = new k(600);
        f7139b = kVar6;
        k kVar7 = new k(700);
        k kVar8 = new k(800);
        k kVar9 = new k(900);
        f7140c = kVar4;
        f7141d = kVar5;
        f7142e = u0.y(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9);
    }

    public k(int i7) {
        this.f7143a = i7;
        boolean z8 = false;
        if (1 <= i7 && i7 < 1001) {
            z8 = true;
        }
        if (z8) {
            return;
        }
        P0.a.a("Font weight can be in range [1, 1000]. Current value: " + i7);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.l.f(this.f7143a, ((k) obj).f7143a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f7143a == ((k) obj).f7143a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7143a;
    }

    public final String toString() {
        return X.c.k(new StringBuilder("FontWeight(weight="), this.f7143a, ')');
    }
}
