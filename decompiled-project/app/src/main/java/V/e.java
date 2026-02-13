package V;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.y;

/* loaded from: classes.dex */
public class e extends d {

    /* renamed from: d, reason: collision with root package name */
    public final Y.i f9945d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9946e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9947f;

    /* renamed from: u, reason: collision with root package name */
    public int f9948u;

    public e(Y.i iVar, m[] mVarArr) {
        super(iVar.f11048b, mVarArr);
        this.f9945d = iVar;
        this.f9948u = iVar.f11050d;
    }

    public final void c(int i7, l lVar, Object obj, int i10) {
        int i11 = i10 * 5;
        m[] mVarArr = this.f9942a;
        if (i11 <= 30) {
            int u3 = 1 << O5.b.u(i7, i11);
            if (lVar.h(u3)) {
                mVarArr[i10].a(lVar.f9961d, Integer.bitCount(lVar.f9958a) * 2, lVar.f(u3));
                this.f9943b = i10;
                return;
            } else {
                int t5 = lVar.t(u3);
                l s3 = lVar.s(t5);
                mVarArr[i10].a(lVar.f9961d, Integer.bitCount(lVar.f9958a) * 2, t5);
                c(i7, s3, obj, i10 + 1);
                return;
            }
        }
        m mVar = mVarArr[i10];
        Object[] objArr = lVar.f9961d;
        mVar.a(objArr, objArr.length, 0);
        while (true) {
            m mVar2 = mVarArr[i10];
            if (kotlin.jvm.internal.l.a(mVar2.f9962a[mVar2.f9964c], obj)) {
                this.f9943b = i10;
                return;
            } else {
                mVarArr[i10].f9964c += 2;
            }
        }
    }

    @Override // V.d, java.util.Iterator
    public final Object next() {
        if (this.f9945d.f11050d != this.f9948u) {
            throw new ConcurrentModificationException();
        }
        if (!this.f9944c) {
            throw new NoSuchElementException();
        }
        m mVar = this.f9942a[this.f9943b];
        this.f9946e = mVar.f9962a[mVar.f9964c];
        this.f9947f = true;
        return super.next();
    }

    @Override // V.d, java.util.Iterator
    public final void remove() {
        if (!this.f9947f) {
            throw new IllegalStateException();
        }
        boolean z8 = this.f9944c;
        Y.i iVar = this.f9945d;
        if (!z8) {
            y.a(iVar).remove(this.f9946e);
        } else {
            if (!z8) {
                throw new NoSuchElementException();
            }
            m mVar = this.f9942a[this.f9943b];
            Object obj = mVar.f9962a[mVar.f9964c];
            y.a(iVar).remove(this.f9946e);
            c(obj != null ? obj.hashCode() : 0, iVar.f11048b, obj, 0);
        }
        this.f9946e = null;
        this.f9947f = false;
        this.f9948u = iVar.f11050d;
    }
}
