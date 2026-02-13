package I8;

import G8.A;
import G8.z;
import J8.C0357l;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class c extends z {

    /* renamed from: a, reason: collision with root package name */
    public volatile z f5262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5264c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G8.m f5265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N8.a f5266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f5267f;

    public c(d dVar, boolean z8, boolean z10, G8.m mVar, N8.a aVar) {
        this.f5267f = dVar;
        this.f5263b = z8;
        this.f5264c = z10;
        this.f5265d = mVar;
        this.f5266e = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0067, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[SYNTHETIC] */
    @Override // G8.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(O8.a aVar) {
        Iterator it;
        if (this.f5263b) {
            aVar.p0();
            return null;
        }
        z zVar = this.f5262a;
        if (zVar == null) {
            G8.m mVar = this.f5265d;
            d dVar = this.f5267f;
            N8.a aVar2 = this.f5266e;
            mVar.getClass();
            Objects.requireNonNull(dVar, "skipPast must not be null");
            C0357l c0357l = mVar.f4386d;
            c0357l.getClass();
            if (dVar != C0357l.f5701c) {
                ConcurrentHashMap concurrentHashMap = c0357l.f5703b;
                Class cls = aVar2.f7386a;
                A a9 = (A) concurrentHashMap.get(cls);
                if (a9 == null) {
                    H8.a aVar3 = (H8.a) cls.getAnnotation(H8.a.class);
                    if (aVar3 != null) {
                        Class value = aVar3.value();
                        if (A.class.isAssignableFrom(value)) {
                            A a10 = (A) c0357l.f5702a.l(new N8.a(value), true).h();
                            A a11 = (A) concurrentHashMap.putIfAbsent(cls, a10);
                            if (a11 != null) {
                                a10 = a11;
                            }
                        }
                    }
                    it = mVar.f4387e.iterator();
                    boolean z8 = false;
                    while (true) {
                        if (!it.hasNext()) {
                            A a12 = (A) it.next();
                            if (z8) {
                                z a13 = a12.a(mVar, aVar2);
                                if (a13 != null) {
                                    zVar = a13;
                                    break;
                                }
                            } else if (a12 == dVar) {
                                z8 = true;
                            }
                        } else {
                            if (z8) {
                                throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar2);
                            }
                            zVar = mVar.d(aVar2);
                        }
                    }
                    this.f5262a = zVar;
                }
            }
            dVar = c0357l;
            it = mVar.f4387e.iterator();
            boolean z82 = false;
            while (true) {
                if (!it.hasNext()) {
                }
            }
            this.f5262a = zVar;
        }
        return zVar.b(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0066, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[SYNTHETIC] */
    @Override // G8.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(O8.b bVar, Object obj) {
        Iterator it;
        if (this.f5264c) {
            bVar.W();
            return;
        }
        z zVar = this.f5262a;
        if (zVar == null) {
            G8.m mVar = this.f5265d;
            d dVar = this.f5267f;
            N8.a aVar = this.f5266e;
            mVar.getClass();
            Objects.requireNonNull(dVar, "skipPast must not be null");
            C0357l c0357l = mVar.f4386d;
            c0357l.getClass();
            if (dVar != C0357l.f5701c) {
                ConcurrentHashMap concurrentHashMap = c0357l.f5703b;
                Class cls = aVar.f7386a;
                A a9 = (A) concurrentHashMap.get(cls);
                if (a9 == null) {
                    H8.a aVar2 = (H8.a) cls.getAnnotation(H8.a.class);
                    if (aVar2 != null) {
                        Class value = aVar2.value();
                        if (A.class.isAssignableFrom(value)) {
                            A a10 = (A) c0357l.f5702a.l(new N8.a(value), true).h();
                            A a11 = (A) concurrentHashMap.putIfAbsent(cls, a10);
                            if (a11 != null) {
                                a10 = a11;
                            }
                        }
                    }
                    it = mVar.f4387e.iterator();
                    boolean z8 = false;
                    while (true) {
                        if (!it.hasNext()) {
                            A a12 = (A) it.next();
                            if (z8) {
                                z a13 = a12.a(mVar, aVar);
                                if (a13 != null) {
                                    zVar = a13;
                                    break;
                                }
                            } else if (a12 == dVar) {
                                z8 = true;
                            }
                        } else {
                            if (z8) {
                                throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar);
                            }
                            zVar = mVar.d(aVar);
                        }
                    }
                    this.f5262a = zVar;
                }
            }
            dVar = c0357l;
            it = mVar.f4387e.iterator();
            boolean z82 = false;
            while (true) {
                if (!it.hasNext()) {
                }
            }
            this.f5262a = zVar;
        }
        zVar.c(bVar, obj);
    }
}
