package G8;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class k extends z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f4377b;

    public /* synthetic */ k(z zVar, int i7) {
        this.f4376a = i7;
        this.f4377b = zVar;
    }

    @Override // G8.z
    public final Object b(O8.a aVar) {
        switch (this.f4376a) {
            case 0:
                return new AtomicLong(((Number) this.f4377b.b(aVar)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                aVar.l();
                while (aVar.W()) {
                    arrayList.add(Long.valueOf(((Number) this.f4377b.b(aVar)).longValue()));
                }
                aVar.P();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i7 = 0; i7 < size; i7++) {
                    atomicLongArray.set(i7, ((Long) arrayList.get(i7)).longValue());
                }
                return atomicLongArray;
        }
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        switch (this.f4376a) {
            case 0:
                this.f4377b.c(bVar, Long.valueOf(((AtomicLong) obj).get()));
                return;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.n();
                int length = atomicLongArray.length();
                for (int i7 = 0; i7 < length; i7++) {
                    this.f4377b.c(bVar, Long.valueOf(atomicLongArray.get(i7)));
                }
                bVar.P();
                return;
        }
    }
}
