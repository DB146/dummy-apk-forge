package Fb;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class c extends e implements Iterator, Sb.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4189e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, int i7) {
        super(fVar);
        this.f4189e = i7;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4189e) {
            case 0:
                a();
                int i7 = this.f4193a;
                f fVar = (f) this.f4196d;
                if (i7 >= fVar.f4204f) {
                    throw new NoSuchElementException();
                }
                this.f4193a = i7 + 1;
                this.f4194b = i7;
                d dVar = new d(fVar, i7);
                d();
                return dVar;
            case 1:
                a();
                int i10 = this.f4193a;
                f fVar2 = (f) this.f4196d;
                if (i10 >= fVar2.f4204f) {
                    throw new NoSuchElementException();
                }
                this.f4193a = i10 + 1;
                this.f4194b = i10;
                Object obj = fVar2.f4199a[i10];
                d();
                return obj;
            default:
                a();
                int i11 = this.f4193a;
                f fVar3 = (f) this.f4196d;
                if (i11 >= fVar3.f4204f) {
                    throw new NoSuchElementException();
                }
                this.f4193a = i11 + 1;
                this.f4194b = i11;
                Object[] objArr = fVar3.f4200b;
                l.b(objArr);
                Object obj2 = objArr[this.f4194b];
                d();
                return obj2;
        }
    }
}
