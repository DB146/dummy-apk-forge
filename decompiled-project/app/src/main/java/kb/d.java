package kb;

import hb.InterfaceC1269b;
import hb.InterfaceC1270c;
import ib.C1360b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import vb.s;
import xb.AbstractC2275c;
import y7.u0;

/* loaded from: classes2.dex */
public final class d implements InterfaceC1269b, InterfaceC1270c {

    /* renamed from: a, reason: collision with root package name */
    public LinkedList f19074a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f19075b;

    @Override // hb.InterfaceC1270c
    public final boolean a(InterfaceC1269b interfaceC1269b) {
        if (this.f19075b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f19075b) {
                    return false;
                }
                LinkedList linkedList = this.f19074a;
                if (linkedList != null && linkedList.remove(interfaceC1269b)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        if (this.f19075b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f19075b) {
                    return;
                }
                this.f19075b = true;
                LinkedList linkedList = this.f19074a;
                ArrayList arrayList = null;
                this.f19074a = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC1269b) it.next()).b();
                    } catch (Throwable th) {
                        u0.L(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new C1360b(arrayList);
                    }
                    throw AbstractC2275c.b((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // hb.InterfaceC1270c
    public final boolean c(InterfaceC1269b interfaceC1269b) {
        if (!a(interfaceC1269b)) {
            return false;
        }
        ((s) interfaceC1269b).b();
        return true;
    }

    @Override // hb.InterfaceC1270c
    public final boolean d(InterfaceC1269b interfaceC1269b) {
        if (!this.f19075b) {
            synchronized (this) {
                try {
                    if (!this.f19075b) {
                        LinkedList linkedList = this.f19074a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f19074a = linkedList;
                        }
                        linkedList.add(interfaceC1269b);
                        return true;
                    }
                } finally {
                }
            }
        }
        interfaceC1269b.b();
        return false;
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f19075b;
    }
}
