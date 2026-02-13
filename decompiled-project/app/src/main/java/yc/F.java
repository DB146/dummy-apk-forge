package yc;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class F implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final String f27656a;

    /* renamed from: b, reason: collision with root package name */
    public String f27657b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27658c;

    /* renamed from: d, reason: collision with root package name */
    public int f27659d = 0;

    public F(String str, String str2, String str3) {
        this.f27657b = str;
        this.f27658c = str2;
        this.f27656a = str3;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F clone() {
        try {
            return (F) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final boolean b(int i7) {
        return (i7 & this.f27659d) != 0;
    }

    public final boolean c() {
        return (this.f27659d & 2) != 0;
    }

    public final boolean d() {
        return (this.f27659d & 1) != 0;
    }

    public final boolean e() {
        int i7 = this.f27659d;
        return ((i7 & 16) == 0 && (i7 & 2) == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f4 = (F) obj;
        return Objects.equals(this.f27657b, f4.f27657b) && Objects.equals(this.f27656a, f4.f27656a) && Objects.equals(this.f27658c, f4.f27658c) && this.f27659d == f4.f27659d;
    }

    public final void f(int i7) {
        this.f27659d = i7 | this.f27659d | 1;
    }

    public final l1 g() {
        if (b(128)) {
            return l1.f27777c;
        }
        if (b(256)) {
            return l1.f27781e;
        }
        return null;
    }

    public final int hashCode() {
        return Objects.hash(this.f27657b, this.f27656a);
    }

    public final String toString() {
        return this.f27657b;
    }
}
