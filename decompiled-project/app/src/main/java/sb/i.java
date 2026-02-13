package sb;

import hb.InterfaceC1269b;
import java.util.Objects;
import jb.InterfaceC1394e;
import jb.InterfaceC1395f;
import kb.EnumC1437b;
import y7.u0;
import yb.InterfaceC2471a;

/* loaded from: classes2.dex */
public final class i implements gb.l, InterfaceC2471a {

    /* renamed from: a, reason: collision with root package name */
    public final gb.l f24269a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1269b f24270b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC2471a f24271c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24272d;

    /* renamed from: e, reason: collision with root package name */
    public int f24273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f24274f;

    /* renamed from: u, reason: collision with root package name */
    public final Object f24275u;

    public i(gb.l lVar, Object obj, int i7) {
        this.f24274f = i7;
        this.f24269a = lVar;
        this.f24275u = obj;
    }

    @Override // gb.l
    public final void a() {
        if (this.f24272d) {
            return;
        }
        this.f24272d = true;
        this.f24269a.a();
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        this.f24270b.b();
    }

    @Override // gb.l
    public final void c(InterfaceC1269b interfaceC1269b) {
        if (EnumC1437b.o(this.f24270b, interfaceC1269b)) {
            this.f24270b = interfaceC1269b;
            if (interfaceC1269b instanceof InterfaceC2471a) {
                this.f24271c = (InterfaceC2471a) interfaceC1269b;
            }
            this.f24269a.c(this);
        }
    }

    @Override // yb.InterfaceC2475e
    public final void clear() {
        this.f24271c.clear();
    }

    @Override // gb.l
    public final void e(Object obj) {
        switch (this.f24274f) {
            case 0:
                int i7 = this.f24273e;
                gb.l lVar = this.f24269a;
                if (i7 != 0) {
                    lVar.e(null);
                    return;
                }
                try {
                    if (((InterfaceC1395f) this.f24275u).test(obj)) {
                        lVar.e(obj);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    u0.L(th);
                    this.f24270b.b();
                    onError(th);
                    return;
                }
            default:
                if (this.f24272d) {
                    return;
                }
                int i10 = this.f24273e;
                gb.l lVar2 = this.f24269a;
                if (i10 != 0) {
                    lVar2.e(null);
                    return;
                }
                try {
                    Object apply = ((InterfaceC1394e) this.f24275u).apply(obj);
                    Objects.requireNonNull(apply, "The mapper function returned a null value.");
                    lVar2.e(apply);
                    return;
                } catch (Throwable th2) {
                    u0.L(th2);
                    this.f24270b.b();
                    onError(th2);
                    return;
                }
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f24270b.g();
    }

    @Override // yb.InterfaceC2472b
    public int i(int i7) {
        InterfaceC2471a interfaceC2471a = this.f24271c;
        if (interfaceC2471a == null || (i7 & 4) != 0) {
            return 0;
        }
        int i10 = interfaceC2471a.i(i7);
        if (i10 == 0) {
            return i10;
        }
        this.f24273e = i10;
        return i10;
    }

    @Override // yb.InterfaceC2475e
    public final boolean isEmpty() {
        return this.f24271c.isEmpty();
    }

    @Override // yb.InterfaceC2475e
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // gb.l
    public final void onError(Throwable th) {
        if (this.f24272d) {
            com.bumptech.glide.d.t(th);
        } else {
            this.f24272d = true;
            this.f24269a.onError(th);
        }
    }

    @Override // yb.InterfaceC2475e
    public final Object poll() {
        Object poll;
        switch (this.f24274f) {
            case 0:
                break;
            default:
                Object poll2 = this.f24271c.poll();
                if (poll2 == null) {
                    return null;
                }
                Object apply = ((InterfaceC1394e) this.f24275u).apply(poll2);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                return apply;
        }
        do {
            poll = this.f24271c.poll();
            if (poll != null) {
            }
            return poll;
        } while (!((InterfaceC1395f) this.f24275u).test(poll));
        return poll;
    }
}
