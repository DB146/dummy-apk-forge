package I2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: I2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325n extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public Set f5179a;

    /* renamed from: b, reason: collision with root package name */
    public int f5180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String[] f5181c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0327p f5182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0325n(String[] strArr, C0327p c0327p, Hb.d dVar) {
        super(2, dVar);
        this.f5181c = strArr;
        this.f5182d = c0327p;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C0325n(this.f5181c, this.f5182d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0325n) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Set tables;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f5180b;
        C0327p c0327p = this.f5182d;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            String[] strArr = this.f5181c;
            Object[] elements = Arrays.copyOf(strArr, strArr.length);
            kotlin.jvm.internal.l.e(elements, "elements");
            Set f02 = Eb.n.f0(elements);
            fc.P p10 = c0327p.f5190h;
            this.f5179a = f02;
            this.f5180b = 1;
            if (p10.emit(f02, this) == aVar) {
                return aVar;
            }
            tables = f02;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tables = this.f5179a;
            com.bumptech.glide.c.c0(obj);
        }
        C0323l c0323l = c0327p.f5185b;
        kotlin.jvm.internal.l.e(tables, "tables");
        ReentrantLock reentrantLock = c0323l.f5172e;
        reentrantLock.lock();
        try {
            List s02 = Eb.o.s0(c0323l.f5171d.values());
            reentrantLock.unlock();
            Iterator it = s02.iterator();
            while (it.hasNext()) {
                ((C0332v) it.next()).f5206a.getClass();
            }
            return Db.q.f3365a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
