package V;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d implements Iterator, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final m[] f9942a;

    /* renamed from: b, reason: collision with root package name */
    public int f9943b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9944c = true;

    public d(l lVar, m[] mVarArr) {
        this.f9942a = mVarArr;
        mVarArr[0].a(lVar.f9961d, Integer.bitCount(lVar.f9958a) * 2, 0);
        this.f9943b = 0;
        a();
    }

    public final void a() {
        int i7 = this.f9943b;
        m[] mVarArr = this.f9942a;
        m mVar = mVarArr[i7];
        if (mVar.f9964c < mVar.f9963b) {
            return;
        }
        while (-1 < i7) {
            int b2 = b(i7);
            if (b2 == -1) {
                m mVar2 = mVarArr[i7];
                int i10 = mVar2.f9964c;
                Object[] objArr = mVar2.f9962a;
                if (i10 < objArr.length) {
                    int length = objArr.length;
                    mVar2.f9964c = i10 + 1;
                    b2 = b(i7);
                }
            }
            if (b2 != -1) {
                this.f9943b = b2;
                return;
            }
            if (i7 > 0) {
                m mVar3 = mVarArr[i7 - 1];
                int i11 = mVar3.f9964c;
                int length2 = mVar3.f9962a.length;
                mVar3.f9964c = i11 + 1;
            }
            mVarArr[i7].a(l.f9957e.f9961d, 0, 0);
            i7--;
        }
        this.f9944c = false;
    }

    public final int b(int i7) {
        m[] mVarArr = this.f9942a;
        m mVar = mVarArr[i7];
        int i10 = mVar.f9964c;
        if (i10 < mVar.f9963b) {
            return i7;
        }
        Object[] objArr = mVar.f9962a;
        if (i10 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i10];
        kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        l lVar = (l) obj;
        if (i7 == 6) {
            m mVar2 = mVarArr[i7 + 1];
            Object[] objArr2 = lVar.f9961d;
            mVar2.a(objArr2, objArr2.length, 0);
        } else {
            mVarArr[i7 + 1].a(lVar.f9961d, Integer.bitCount(lVar.f9958a) * 2, 0);
        }
        return b(i7 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9944c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f9944c) {
            throw new NoSuchElementException();
        }
        Object next = this.f9942a[this.f9943b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
