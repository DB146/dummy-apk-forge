package u;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2048a implements Iterator, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public int f24656a;

    /* renamed from: b, reason: collision with root package name */
    public int f24657b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24658c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24660e;

    public C2048a(int i7) {
        this.f24656a = i7;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2048a(C2052e c2052e, int i7) {
        this(c2052e.f24637c);
        this.f24659d = i7;
        switch (i7) {
            case 1:
                this.f24660e = c2052e;
                this(c2052e.f24637c);
                return;
            default:
                this.f24660e = c2052e;
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2048a(C2053f c2053f) {
        this(c2053f.f24672c);
        this.f24659d = 2;
        this.f24660e = c2053f;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24657b < this.f24656a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f4;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f24657b;
        switch (this.f24659d) {
            case 0:
                f4 = ((C2052e) this.f24660e).f(i7);
                break;
            case 1:
                f4 = ((C2052e) this.f24660e).k(i7);
                break;
            default:
                f4 = ((C2053f) this.f24660e).f24671b[i7];
                break;
        }
        this.f24657b++;
        this.f24658c = true;
        return f4;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f24658c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i7 = this.f24657b - 1;
        this.f24657b = i7;
        switch (this.f24659d) {
            case 0:
                ((C2052e) this.f24660e).h(i7);
                break;
            case 1:
                ((C2052e) this.f24660e).h(i7);
                break;
            default:
                ((C2053f) this.f24660e).b(i7);
                break;
        }
        this.f24656a--;
        this.f24658c = false;
    }
}
