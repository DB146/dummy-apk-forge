package androidx.datastore.preferences.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC1014h;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0801d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13383a;

    /* renamed from: b, reason: collision with root package name */
    public int f13384b;

    /* renamed from: c, reason: collision with root package name */
    public int f13385c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Iterable f13386d;

    public C0801d(C0804g c0804g) {
        this.f13383a = 0;
        this.f13386d = c0804g;
        this.f13384b = 0;
        this.f13385c = c0804g.size();
    }

    public C0801d(AbstractC1014h abstractC1014h) {
        this.f13383a = 1;
        this.f13386d = abstractC1014h;
        this.f13384b = 0;
        this.f13385c = abstractC1014h.size();
    }

    public C0801d(xc.b bVar) {
        this.f13383a = 2;
        this.f13386d = bVar;
        this.f13384b = bVar.f26332a;
        this.f13385c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f13383a) {
            case 0:
                return this.f13384b < this.f13385c;
            case 1:
                return this.f13384b < this.f13385c;
            default:
                xc.b bVar = (xc.b) this.f13386d;
                if (bVar.f26332a != this.f13384b) {
                    throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
                }
                while (true) {
                    int i7 = this.f13385c;
                    if (i7 < bVar.f26332a && xc.b.G(bVar.f26333b[i7])) {
                        this.f13385c++;
                    }
                }
                return this.f13385c < bVar.f26332a;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f13383a) {
            case 0:
                int i7 = this.f13384b;
                if (i7 >= this.f13385c) {
                    throw new NoSuchElementException();
                }
                this.f13384b = i7 + 1;
                return Byte.valueOf(((C0804g) this.f13386d).z(i7));
            case 1:
                int i10 = this.f13384b;
                if (i10 >= this.f13385c) {
                    throw new NoSuchElementException();
                }
                this.f13384b = i10 + 1;
                return Byte.valueOf(((AbstractC1014h) this.f13386d).y(i10));
            default:
                xc.b bVar = (xc.b) this.f13386d;
                int i11 = bVar.f26332a;
                if (i11 != this.f13384b) {
                    throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
                }
                int i12 = this.f13385c;
                if (i12 >= i11) {
                    throw new NoSuchElementException();
                }
                xc.a aVar = new xc.a(bVar.f26333b[i12], (String) bVar.f26334c[this.f13385c], bVar);
                this.f13385c++;
                return aVar;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f13383a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                int i7 = this.f13385c - 1;
                this.f13385c = i7;
                ((xc.b) this.f13386d).I(i7);
                this.f13384b--;
                return;
        }
    }
}
