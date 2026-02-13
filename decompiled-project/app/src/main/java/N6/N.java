package N6;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class N extends H0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7243b;

    public N(Object obj) {
        this.f7243b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f7242a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7242a) {
            throw new NoSuchElementException();
        }
        this.f7242a = true;
        return this.f7243b;
    }
}
