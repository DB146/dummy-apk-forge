package B8;

import Eb.B;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.l;
import mc.InterfaceC1656a;
import v7.i;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2227a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f2228b = Collections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map dependencies = f2228b;
        l.d(dependencies, "dependencies");
        Object obj = dependencies.get(dVar);
        if (obj != null) {
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0 A[Catch: all -> 0x00c9, TRY_ENTER, TryCatch #0 {all -> 0x00c9, blocks: (B:12:0x009b, B:23:0x00b0, B:24:0x00c8), top: B:11:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0099 -> B:10:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Jb.c cVar) {
        b bVar;
        int i7;
        Iterator it;
        Map map;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f2226w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f2226w = i10 - Integer.MIN_VALUE;
                Object obj = bVar.f2224u;
                Ib.a aVar = Ib.a.f5345a;
                i7 = bVar.f2226w;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    Map dependencies = f2228b;
                    l.d(dependencies, "dependencies");
                    LinkedHashMap linkedHashMap = new LinkedHashMap(B.F(dependencies.size()));
                    it = dependencies.entrySet().iterator();
                    map = linkedHashMap;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object key = bVar.f2223f;
                    map = bVar.f2222e;
                    InterfaceC1656a interfaceC1656a = bVar.f2221d;
                    d subscriberName = bVar.f2220c;
                    it = bVar.f2219b;
                    Map map2 = bVar.f2218a;
                    com.bumptech.glide.c.c0(obj);
                    try {
                        l.e(subscriberName, "subscriberName");
                        i iVar = a(subscriberName).f2217b;
                        if (iVar == null) {
                            interfaceC1656a.l(null);
                            map.put(key, iVar);
                            map = map2;
                            if (it.hasNext()) {
                                return map;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            key = entry.getKey();
                            subscriberName = (d) entry.getKey();
                            interfaceC1656a = ((a) entry.getValue()).f2216a;
                            Map map3 = map;
                            bVar.f2218a = map3;
                            bVar.f2219b = it;
                            bVar.f2220c = subscriberName;
                            bVar.f2221d = interfaceC1656a;
                            bVar.f2222e = map3;
                            bVar.f2223f = key;
                            bVar.f2226w = 1;
                            if (interfaceC1656a.n(bVar) == aVar) {
                                return aVar;
                            }
                            map2 = map;
                            l.e(subscriberName, "subscriberName");
                            i iVar2 = a(subscriberName).f2217b;
                            if (iVar2 == null) {
                                throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
                            }
                        }
                    } catch (Throwable th) {
                        interfaceC1656a.l(null);
                        throw th;
                    }
                }
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f2224u;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = bVar.f2226w;
        if (i7 != 0) {
        }
    }
}
