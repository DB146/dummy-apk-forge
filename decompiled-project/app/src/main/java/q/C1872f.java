package q;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1872f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public C1869c f23335a;

    /* renamed from: b, reason: collision with root package name */
    public C1869c f23336b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f23337c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f23338d = 0;

    public C1869c b(Object obj) {
        C1869c c1869c = this.f23335a;
        while (c1869c != null && !c1869c.f23328a.equals(obj)) {
            c1869c = c1869c.f23330c;
        }
        return c1869c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((q.C1868b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1872f)) {
            return false;
        }
        C1872f c1872f = (C1872f) obj;
        if (this.f23338d != c1872f.f23338d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c1872f.iterator();
        while (true) {
            C1868b c1868b = (C1868b) it;
            if (!c1868b.hasNext()) {
                break;
            }
            C1868b c1868b2 = (C1868b) it2;
            if (!c1868b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c1868b.next();
            Object next = c1868b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i7 = 0;
        while (true) {
            C1868b c1868b = (C1868b) it;
            if (!c1868b.hasNext()) {
                return i7;
            }
            i7 += ((Map.Entry) c1868b.next()).hashCode();
        }
    }

    public Object i(Object obj) {
        C1869c b2 = b(obj);
        if (b2 == null) {
            return null;
        }
        this.f23338d--;
        WeakHashMap weakHashMap = this.f23337c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC1871e) it.next()).a(b2);
            }
        }
        C1869c c1869c = b2.f23331d;
        if (c1869c != null) {
            c1869c.f23330c = b2.f23330c;
        } else {
            this.f23335a = b2.f23330c;
        }
        C1869c c1869c2 = b2.f23330c;
        if (c1869c2 != null) {
            c1869c2.f23331d = c1869c;
        } else {
            this.f23336b = c1869c;
        }
        b2.f23330c = null;
        b2.f23331d = null;
        return b2.f23329b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1868b c1868b = new C1868b(this.f23335a, this.f23336b, 0);
        this.f23337c.put(c1868b, Boolean.FALSE);
        return c1868b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1868b c1868b = (C1868b) it;
            if (!c1868b.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) c1868b.next()).toString());
            if (c1868b.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
