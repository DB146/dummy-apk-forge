package p7;

import j8.InterfaceC1387b;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class m implements InterfaceC1387b {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f23146a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f23147b;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        throw r0;
     */
    @Override // j8.InterfaceC1387b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.f23147b == null) {
            synchronized (this) {
                try {
                    if (this.f23147b == null) {
                        this.f23147b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator it = this.f23146a.iterator();
                            while (it.hasNext()) {
                                this.f23147b.add(((InterfaceC1387b) it.next()).get());
                            }
                            this.f23146a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f23147b);
    }
}
