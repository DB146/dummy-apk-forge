package I2;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class b0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f5147a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f5149c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, Hb.d dVar) {
        super(2, dVar);
        this.f5149c = c0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        b0 b0Var = new b0(this.f5149c, dVar);
        b0Var.f5148b = obj;
        return b0Var;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((M) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        M m10;
        Object a9;
        EnumC0329s[] enumC0329sArr;
        EnumC0329s enumC0329s;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f5147a;
        Db.q qVar = Db.q.f3365a;
        boolean z8 = true;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            m10 = (M) this.f5148b;
            this.f5148b = m10;
            this.f5147a = 1;
            a9 = m10.a(this);
            if (a9 == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.c.c0(obj);
                return qVar;
            }
            m10 = (M) this.f5148b;
            com.bumptech.glide.c.c0(obj);
            a9 = obj;
        }
        if (((Boolean) a9).booleanValue()) {
            return qVar;
        }
        c0 c0Var = this.f5149c;
        C0330t c0330t = c0Var.f5157h;
        long[] jArr = (long[]) c0330t.f5201c;
        ReentrantLock reentrantLock = (ReentrantLock) c0330t.f5200b;
        reentrantLock.lock();
        try {
            if (c0330t.f5199a) {
                boolean z10 = false;
                c0330t.f5199a = false;
                int length = jArr.length;
                enumC0329sArr = new EnumC0329s[length];
                int i10 = 0;
                boolean z11 = false;
                while (i10 < length) {
                    if (jArr[i10] <= 0) {
                        z8 = z10;
                    }
                    boolean[] zArr = (boolean[]) c0330t.f5202d;
                    if (z8 != zArr[i10]) {
                        zArr[i10] = z8;
                        enumC0329s = z8 ? EnumC0329s.f5196b : EnumC0329s.f5197c;
                        z11 = true;
                    } else {
                        enumC0329s = EnumC0329s.f5195a;
                    }
                    enumC0329sArr[i10] = enumC0329s;
                    i10++;
                    z8 = true;
                    z10 = false;
                }
                if (!z11) {
                    enumC0329sArr = null;
                }
                reentrantLock.unlock();
            } else {
                reentrantLock.unlock();
                enumC0329sArr = null;
            }
            if (enumC0329sArr != null) {
                L l10 = L.f5058b;
                a0 a0Var = new a0(enumC0329sArr, c0Var, m10, null);
                this.f5148b = null;
                this.f5147a = 2;
                if (m10.d(l10, a0Var, this) == aVar) {
                    return aVar;
                }
            }
            return qVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
