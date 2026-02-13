package Eb;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;
import u.U;

/* renamed from: Eb.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0252c implements Iterator, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3872a;

    /* renamed from: b, reason: collision with root package name */
    public int f3873b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3874c;

    public C0252c(Zb.b bVar) {
        this.f3872a = 1;
        this.f3874c = bVar.f12337a.iterator();
        this.f3873b = bVar.f12338b;
    }

    public /* synthetic */ C0252c(Object obj, int i7) {
        this.f3872a = i7;
        this.f3874c = obj;
    }

    public C0252c(Object[] array) {
        this.f3872a = 2;
        kotlin.jvm.internal.l.e(array, "array");
        this.f3874c = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f3872a) {
            case 0:
                return this.f3873b < ((AbstractC0255f) this.f3874c).b();
            case 1:
                break;
            case 2:
                return this.f3873b < ((Object[]) this.f3874c).length;
            case 3:
                return this.f3873b < ((U) this.f3874c).f();
            default:
                return this.f3873b < ((ViewGroup) this.f3874c).getChildCount();
        }
        while (true) {
            int i7 = this.f3873b;
            it = (Iterator) this.f3874c;
            if (i7 > 0 && it.hasNext()) {
                it.next();
                this.f3873b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f3872a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.f3873b;
                this.f3873b = i7 + 1;
                return ((AbstractC0255f) this.f3874c).get(i7);
            case 1:
                break;
            case 2:
                try {
                    Object[] objArr = (Object[]) this.f3874c;
                    int i10 = this.f3873b;
                    this.f3873b = i10 + 1;
                    return objArr[i10];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f3873b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
            case 3:
                int i11 = this.f3873b;
                this.f3873b = i11 + 1;
                return ((U) this.f3874c).g(i11);
            default:
                int i12 = this.f3873b;
                this.f3873b = i12 + 1;
                View childAt = ((ViewGroup) this.f3874c).getChildAt(i12);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
        while (true) {
            int i13 = this.f3873b;
            it = (Iterator) this.f3874c;
            if (i13 > 0 && it.hasNext()) {
                it.next();
                this.f3873b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3872a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                int i7 = this.f3873b - 1;
                this.f3873b = i7;
                ((ViewGroup) this.f3874c).removeViewAt(i7);
                return;
        }
    }
}
