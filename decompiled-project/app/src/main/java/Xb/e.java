package Xb;

import c2.q;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class e implements Iterable, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f11025a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11026b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11027c;

    public e(int i7, int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i11 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f11025a = i7;
        this.f11026b = q.l(i7, i10, i11);
        this.f11027c = i11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f11025a != eVar.f11025a || this.f11026b != eVar.f11026b || this.f11027c != eVar.f11027c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f11025a * 31) + this.f11026b) * 31) + this.f11027c;
    }

    public boolean isEmpty() {
        int i7 = this.f11027c;
        int i10 = this.f11026b;
        int i11 = this.f11025a;
        if (i7 > 0) {
            if (i11 <= i10) {
                return false;
            }
        } else if (i11 >= i10) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f(this.f11025a, this.f11026b, this.f11027c);
    }

    public String toString() {
        StringBuilder sb2;
        int i7 = this.f11026b;
        int i10 = this.f11025a;
        int i11 = this.f11027c;
        if (i11 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append("..");
            sb2.append(i7);
            sb2.append(" step ");
            sb2.append(i11);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(" downTo ");
            sb2.append(i7);
            sb2.append(" step ");
            sb2.append(-i11);
        }
        return sb2.toString();
    }
}
