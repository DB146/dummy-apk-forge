package J2;

import U9.i;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import q3.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final i f5443c = new i(7);

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f5444d = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f5445a;

    /* renamed from: b, reason: collision with root package name */
    public final c f5446b;

    public a(String str, boolean z8) {
        ReentrantLock reentrantLock;
        synchronized (f5443c) {
            try {
                LinkedHashMap linkedHashMap = f5444d;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f5445a = reentrantLock;
        this.f5446b = z8 ? new c(str) : null;
    }
}
