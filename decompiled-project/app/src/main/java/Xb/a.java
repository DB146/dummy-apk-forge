package Xb;

import c2.q;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class a implements Iterable, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final char f11018a;

    /* renamed from: b, reason: collision with root package name */
    public final char f11019b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11020c = 1;

    public a(char c10, char c11) {
        this.f11018a = c10;
        this.f11019b = (char) q.l(c10, c11, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f11018a, this.f11019b, this.f11020c);
    }
}
